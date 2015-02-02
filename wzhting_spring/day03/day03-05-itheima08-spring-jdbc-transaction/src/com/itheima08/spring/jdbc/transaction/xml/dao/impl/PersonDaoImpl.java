package com.itheima08.spring.jdbc.transaction.xml.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.jdo.JdoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;

import com.itheima08.spring.jdbc.transaction.xml.dao.PersonDao;

public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao{
	public void savePerson() {
		this.getJdbcTemplate().execute("insert into person(name) values('aa')");
	}
}
