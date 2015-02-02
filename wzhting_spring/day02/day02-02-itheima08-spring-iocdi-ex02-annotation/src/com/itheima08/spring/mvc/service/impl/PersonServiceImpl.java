package com.itheima08.spring.mvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima08.spring.mvc.dao.PersonDao;
import com.itheima08.spring.mvc.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService{
	@Resource(name="personDao")
	private PersonDao personDao;

	public void savePerson() {
		// TODO Auto-generated method stub
		this.personDao.savePerson();
	}
}
