package com.itheima08.spring.aop.xml.count;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCountest {
	@Test
	public void testException() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.savePerson();
		personDao.savePerson();
		personDao.savePerson();
		personDao.savePerson();
		personDao.savePerson();
		personDao.savePerson();
	}
}
