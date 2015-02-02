package com.itheima08.sring.ioc.createobject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	@Test
	public void testHelloWorld(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器中把helloWorld对象提取出来
		 * 3、对象调用方法完成操作
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}
}
