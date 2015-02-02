package com.itheima08.spring.hibernate.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima08.spring.hibernate.domain.Person;
import com.itheima08.spring.hibernate.transaction.PersonDao;
import com.itheima08.spring.hibernate.transaction.PersonService;

public class PersonTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setName("aa");
		personService.savePerson(person);
	}
	
	@Test
	public void testQueryPerson_Dispage(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.getPerson(0, 1);
	}
	
	@Test
	public void testQueryPerson_Condition_1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.queryCondition();
	}
	
	@Test
	public void testQueryPerson_Condition_2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.queryConditions();
	}
	
	@Test
	public void testQueryPerson_Condition_name(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.queryCondition_name();
	}
	
	@Test
	public void testQueryPerson_Condition_names(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.queryCondition_names();
	}
}
