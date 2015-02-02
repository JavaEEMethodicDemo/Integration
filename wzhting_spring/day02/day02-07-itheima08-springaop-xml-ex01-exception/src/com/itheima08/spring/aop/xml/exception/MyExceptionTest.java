package com.itheima08.spring.aop.xml.exception;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyExceptionTest {
	@Test
	public void testException() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		personService.savePerson();
	}
}
