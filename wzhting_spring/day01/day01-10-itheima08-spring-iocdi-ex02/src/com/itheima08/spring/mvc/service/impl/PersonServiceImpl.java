package com.itheima08.spring.mvc.service.impl;

import com.itheima08.spring.mvc.dao.PersonDao;
import com.itheima08.spring.mvc.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;
	
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson() {
		// TODO Auto-generated method stub
		this.personDao.savePerson();
	}
}
