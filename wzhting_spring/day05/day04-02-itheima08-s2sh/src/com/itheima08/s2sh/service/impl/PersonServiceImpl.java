package com.itheima08.s2sh.service.impl;

import java.io.Serializable;

import com.itheima08.s2sh.dao.PersonDao;
import com.itheima08.s2sh.domain.Person;
import com.itheima08.s2sh.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}

	public Person getPerson(Serializable id) {
		// TODO Auto-generated method stub
		return this.personDao.getPerson(id);
	}
}
