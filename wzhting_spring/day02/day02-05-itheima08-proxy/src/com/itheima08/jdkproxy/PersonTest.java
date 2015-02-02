package com.itheima08.jdkproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testPerson(){
		/**
		 * 1、创建目标类对象
		 * 2、创建事务对象
		 * 3、产生代理对象
		 * 4、代理对象调用方法
		 */
		Object target = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor interceptor = new MyInterceptor(target, transaction);
		/**
		 * 1、目标类的类加载器
		 * 2、目标类实现的所有的接口
		 * 3、拦截器
		 */
		PersonDao personDao = (PersonDao)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		personDao.updatePerson();
	}
}
