package com.itheima08.spring.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima08.spring.mvc.dao.PersonDao;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("save person");
	}
}
