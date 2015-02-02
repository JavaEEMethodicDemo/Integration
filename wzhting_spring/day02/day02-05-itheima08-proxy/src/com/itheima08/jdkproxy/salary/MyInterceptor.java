package com.itheima08.jdkproxy.salary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInterceptor implements InvocationHandler{
	private Logger logger;
	private Security security;
	private Privilege privilege;
	private Object target;
	
	public MyInterceptor(Logger logger, Security security, Privilege privilege,
			Object target) {
		this.logger = logger;
		this.security = security;
		this.privilege = privilege;
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		/**
		 * 1、开启日志
		 * 2、开启安全性的框架
		 * 3、检查权限
		 * 4、进行查看工资的操作
		 */
		this.logger.logging();
		this.security.security();
		if(this.privilege.getAccess().equals("admin")){
			method.invoke(this.target, args);//执行目标方法
		}else{
			System.out.println("权限不足");
		}
		return null;
	}
}
