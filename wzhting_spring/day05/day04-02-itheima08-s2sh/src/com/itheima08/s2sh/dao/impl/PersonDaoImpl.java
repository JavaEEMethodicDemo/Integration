package com.itheima08.s2sh.dao.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima08.s2sh.dao.PersonDao;
import com.itheima08.s2sh.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{
	public void savePerson(Person person) {
		this.getHibernateTemplate().save(person);
	}
	public Person getPerson(Serializable id) {
		// TODO Auto-generated method stub
		Person person =  this.getHibernateTemplate().load(Person.class, id);
		return person;
	}
}
