package com.itheima08.spring.aop.annotation;

import java.lang.reflect.Method;

public class AnnotationParse {
	/**
	 * 
	 * @param targetClass  目标类的class形式
	 * @param methodName   目标方法
	 * @return
	 */
	public static String parse(Class targetClass,String methodName) throws Exception{
		Method method = targetClass.getMethod(methodName);
		if(method==null){
			throw new RuntimeException("该方法不存在");
		}
		String privilegeName = ""; //权限的名称
		/**
		 * 要请求的目标方法上面是否存在该注解
		 */
		if(method.isAnnotationPresent(PrivilegeInfo.class)){
			//获取目标方法的注解
			PrivilegeInfo privilegeInfo = method.getAnnotation(PrivilegeInfo.class);
			//获取注解中的name属性的值
			privilegeName = privilegeInfo.name();
		}
		return privilegeName;
	}
}
