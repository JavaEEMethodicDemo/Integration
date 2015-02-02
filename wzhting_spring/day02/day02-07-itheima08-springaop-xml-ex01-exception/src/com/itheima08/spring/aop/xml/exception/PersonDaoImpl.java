package com.itheima08.spring.aop.xml.exception;

public class PersonDaoImpl implements PersonDao{
	public void savePerson() throws Exception {
		int a = 1/0;
		System.out.println("aaa");
	}
}
