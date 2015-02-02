package com.itheima08.spring.aop.aspect.privilege;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;

import com.itheima08.spring.aop.annotation.AnnotationParse;
import com.itheima08.spring.privilege.Privilege;

public class PrivilegeAspect {
	//用户能够访问到的权限,在客户端初始化该值
	private List<Privilege> privileges;
	
	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	/**
	 * 环绕通知
	 */
	public Object privilegeControl(ProceedingJoinPoint joinPoint) throws Throwable{
		/**
		 * 1、获取用户能够访问到的权限
		 * 2、获取访问目标方法应该具有的权限
		 * 3、判断当前用户的权限是否包含目标方法的权限
		 *      如果包含
		 *         则访问
		 *      如果不包含
		 *         则提示信息
		 */
		Object obj = null;
		
		//方法的名称
		String methodName = joinPoint.getSignature().getName();
		//目标类的class形式
		Class classt = joinPoint.getTarget().getClass();
		//访问目标方法应该具有的权限
		String privilegeName = AnnotationParse.parse(classt, methodName);
		if("".equals(privilegeName)){//说明在service层的类的方法上面有注解，但是没有写属性
			throw new RuntimeException("privilegeinfo注解的name属性必须填写");
		}
		boolean flag = false;
		for(Privilege privilege:privileges){
			if(privilege.getName().equals(privilegeName)){//该用户具有该方法的访问权限
				flag = true;
				break;
			}
		}
		if(flag){//具有权限
			obj = joinPoint.proceed();//执行目标方法
		}else{
			System.out.println("权限不足，没有办法访问");
		}
		return obj;
	}
	
	public void throwingMethod(Throwable ex){
		System.out.println(ex.getMessage());
	}
}
