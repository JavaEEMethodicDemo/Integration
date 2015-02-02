package com.itheima08.spring.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//检查personDao的对象是否有代理对象，如果有代理对象，则返回代理对象
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.savePerson();
	}
}
