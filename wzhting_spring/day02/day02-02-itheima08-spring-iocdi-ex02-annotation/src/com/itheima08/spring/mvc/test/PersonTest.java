package com.itheima08.spring.mvc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima08.spring.mvc.action.PersonAction;

public class PersonTest {
	@Test
	public void testMVC(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
		ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext)context;
		applicationContext.close();
	}
}
