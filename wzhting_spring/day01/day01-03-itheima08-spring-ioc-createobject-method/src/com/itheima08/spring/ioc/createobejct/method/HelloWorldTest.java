package com.itheima08.spring.ioc.createobejct.method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	/**
	 * 默认的构造器产生对象
	 */
	@Test
	public void testHelloWorld_Default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}
	
	/**
	 * 利用静态工厂产生对象
	 */
	@Test
	public void testHelloWorld_StaticFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld2");
		helloWorld.hello();
	}
	
	/**
	 * 利用实例工厂产生对象
	 */
	@Test
	public void testHelloWorld_InstanceFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld3");
		helloWorld.hello();
	}
}
