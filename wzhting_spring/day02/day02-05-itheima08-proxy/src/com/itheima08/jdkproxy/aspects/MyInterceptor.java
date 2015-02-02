package com.itheima08.jdkproxy.aspects;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class MyInterceptor implements InvocationHandler{
	private List<Interceptor> interceptors;
	private Object target;
	
	public MyInterceptor(List<Interceptor> interceptors,
			Object target) {
		this.interceptors = interceptors;
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		/**
		 * 遍历所有的切面中的通知
		 */
		for(Interceptor interceptor:interceptors){
			interceptor.interceptor();
		}
		method.invoke(this.target, args);
		return null;
	}
}
