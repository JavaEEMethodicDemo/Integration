package com.itheima08.annotation;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 注解解析器
 * 	 解析类上的注解
 * @author zd
 *
 */
public class AnnotationParse {
	public static void parse(){
		/**
		 * 如果要获取类上的注解，先获取class
		 * 如果要获取方法上的注解，先获取method
		 */
		Class classt = Itheima08.class;
		/**
		 * 判断该类上面是否存在ClassInfo注解
		 */
		if(classt.isAnnotationPresent(ClassInfo.class)){
			ClassInfo classInfo = (ClassInfo)classt.getAnnotation(ClassInfo.class);
			//输出类上的注解的属性value的值
			System.out.println(classInfo.value());
		}
		
		Method[] methods = classt.getMethods();
		for(Method method:methods){
			/**
			 * 检查正在遍历的方法上面是否存在MethodInfo注解
			 */
			if(method.isAnnotationPresent(MethodInfo.class)){
				MethodInfo methodInfo =  method.getAnnotation(MethodInfo.class);
				System.out.println(methodInfo.name());
			}
		}
	}
	
	@Test
	public void testAnnotation(){
		AnnotationParse.parse();
	}
}
