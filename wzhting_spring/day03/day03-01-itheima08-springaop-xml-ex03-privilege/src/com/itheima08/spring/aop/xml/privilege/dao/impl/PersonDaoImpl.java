package com.itheima08.spring.aop.xml.privilege.dao.impl;

import com.itheima08.spring.aop.xml.privilege.dao.PersonDao;

public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		System.out.println("save person");
	}
}
