package com.itheima08.spring.jdbc.transaction.xml.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima08.spring.jdbc.transaction.xml.service.PersonService;

public class PersonTest {
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		personService.savePerson();
	}
}
