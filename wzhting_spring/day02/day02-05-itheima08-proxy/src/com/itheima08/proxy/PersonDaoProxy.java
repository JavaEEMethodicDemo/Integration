package com.itheima08.proxy;

/**
 * 代理类
 * @author zd
 *
 */
public class PersonDaoProxy implements PersonDao{
	private PersonDao personDao;
	private Transaction transaction;
	
	public PersonDaoProxy(PersonDao personDao, Transaction transaction) {
		this.personDao = personDao;
		this.transaction = transaction;
	}

	public void savePerson() {
		/**
		 * 1、开启事务
		 * 2、save操作
		 * 3、事务提交
		 */
		this.transaction.beginTransaction();
		this.personDao.savePerson();
		this.transaction.commit();
	}
}
