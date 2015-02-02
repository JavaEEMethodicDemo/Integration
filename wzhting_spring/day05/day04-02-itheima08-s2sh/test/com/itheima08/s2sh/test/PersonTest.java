package com.itheima08.s2sh.test;

import org.junit.Test;

import com.itheima08.s2sh.dao.PersonDao;
import com.itheima08.s2sh.domain.Person;
import com.itheima08.s2sh.service.PersonService;

public class PersonTest extends SpringUtils{
	@Test
	public void testPersonService(){
		PersonService personService = (PersonService)context.getBean("personService");
		System.out.println(personService);
	}
	
	@Test
	public void testPersonDao_Load(){
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.getPerson(1L);
	}
	
	@Test
	public void testPersonService_Load(){
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = personService.getPerson(1L);
		System.out.println(person.getName());
	}
}
