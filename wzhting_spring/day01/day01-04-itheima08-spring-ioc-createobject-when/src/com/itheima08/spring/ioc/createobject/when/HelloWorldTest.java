package com.itheima08.spring.ioc.createobject.when;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	@Test
	public void testHelloWorld(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.getBean("helloWorld");
	}
}
