package com.itheima08.spring.jdbc.template;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
	@Test
	public void testPersonDao() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao2 personDao = (PersonDao2)context.getBean("personDao2_1");
		personDao.insert();
	}
	
	@Test
	public void testPersonDao_Query() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao2 personDao = (PersonDao2)context.getBean("personDao2_1");
		List<Person> pList = personDao.getPersons();
		System.out.println(pList.size());
	}
}
