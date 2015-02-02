package com.itheima08.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor{
	private Object target;
	private Transaction transaction;
	
	public Object createProxy(){
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(this);
		//设置代理类的父类:目标类
		enhancer.setSuperclass(this.target.getClass());
		return enhancer.create();
	}
	
	public MyInterceptor(Object target, Transaction transaction) {
		this.target = target;
		this.transaction = transaction;
	}

	public Object intercept(Object arg0, Method method, Object[] args,
			MethodProxy arg3) throws Throwable {
		this.transaction.beginTransaction();
		method.invoke(target, args);
		this.transaction.commit();
		return null;
	}
}
