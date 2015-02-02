package com.itheima08.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 拦截器
 * 		1、引入目标类和事务
 * 		2、完成invoke方法
 * @author zd
 *
 */
public class MyInterceptor implements InvocationHandler{
	
	private Object target;
	private Transaction transaction;
	
	public MyInterceptor(Object target, Transaction transaction) {
		this.target = target;
		this.transaction = transaction;
	}


	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		/**
		 * 1、开启事务
		 * 2、完成目标方法
		 * 3、事务的提交
		 */
		if(method.getName().equals("savePerson")||
				method.getName().equals("updatePerson")){
			this.transaction.beginTransaction();
			method.invoke(this.target, args);//调用目标方法
			this.transaction.commit();
		}else{
			method.invoke(this.target, args);//调用目标方法
		}
		return null;
	}

}
