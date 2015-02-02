package com.itheima08.cglibproxy;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testPerson(){
		PersonDaoImpl target = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor interceptor = new MyInterceptor(target, transaction);
		PersonDaoImpl proxy = (PersonDaoImpl)interceptor.createProxy();
		proxy.savePerson();
	}
}
