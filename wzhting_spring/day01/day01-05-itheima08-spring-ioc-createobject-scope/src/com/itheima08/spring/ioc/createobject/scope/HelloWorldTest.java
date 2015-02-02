package com.itheima08.spring.ioc.createobject.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	@Test
	public void testScope_Default(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloWorld");
		System.out.println(helloWorld);
		System.out.println(helloWorld2);
	}
	
	@Test
	public void testScope_Prototype(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloWorld");
		helloWorld.sList.add("aaa");
		System.out.println(helloWorld);
		System.out.println(helloWorld2);
		helloWorld2.sList.add("bbb");
		System.out.println(helloWorld.sList.size());
	}
}
