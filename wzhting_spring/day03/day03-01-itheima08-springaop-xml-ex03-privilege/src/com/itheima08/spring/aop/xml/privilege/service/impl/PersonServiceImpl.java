package com.itheima08.spring.aop.xml.privilege.service.impl;

import com.itheima08.spring.aop.annotation.PrivilegeInfo;
import com.itheima08.spring.aop.xml.privilege.dao.PersonDao;
import com.itheima08.spring.aop.xml.privilege.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	@PrivilegeInfo
	public void savePerson() {
		this.personDao.savePerson();
	}
}
