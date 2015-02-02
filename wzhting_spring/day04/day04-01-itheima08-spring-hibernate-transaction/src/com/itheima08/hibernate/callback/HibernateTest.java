package com.itheima08.hibernate.callback;

import org.hibernate.Session;
import org.junit.Test;

import com.itheima08.spring.hibernate.domain.Person;

public class HibernateTest {
	@Test
	public void test(){
		HibernateOpt opt = new HibernateOpt();
		opt.execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Person object = new Person();
				object.setName("aa");
				session.save(object);
				return null;
			}
		});
	}
}
