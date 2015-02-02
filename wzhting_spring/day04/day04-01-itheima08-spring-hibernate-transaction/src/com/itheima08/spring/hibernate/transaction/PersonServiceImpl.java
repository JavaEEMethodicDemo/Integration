package com.itheima08.spring.hibernate.transaction;

import com.itheima08.spring.hibernate.domain.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}
}
