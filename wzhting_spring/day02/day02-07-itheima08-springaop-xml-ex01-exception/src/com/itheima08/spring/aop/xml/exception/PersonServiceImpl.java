package com.itheima08.spring.aop.xml.exception;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson() throws Exception {
		// TODO Auto-generated method stub
		this.personDao.savePerson();
	}
}
