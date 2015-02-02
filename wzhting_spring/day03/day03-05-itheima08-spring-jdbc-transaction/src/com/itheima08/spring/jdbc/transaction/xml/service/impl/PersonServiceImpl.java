package com.itheima08.spring.jdbc.transaction.xml.service.impl;

import com.itheima08.spring.jdbc.transaction.xml.dao.PersonDao;
import com.itheima08.spring.jdbc.transaction.xml.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void savePerson() {
		this.personDao.savePerson();
		int a = 1/0;
		this.personDao.savePerson();
	}
}
