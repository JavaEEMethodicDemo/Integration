package com.itheima08.proxy;

import org.junit.Test;

public class PersonDaoTest {
	@Test
	public void testPersonDao(){
		//目标对象
		PersonDao target = new PersonDaoImpl();
		//事务
		Transaction transaction = new Transaction();
		//代理对象
		PersonDao proxy = new PersonDaoProxy(target, transaction);
		proxy.savePerson();
	}
}
