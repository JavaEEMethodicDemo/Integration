package com.itheima08.spring.aop.xml;

public class PersonDaoImpl implements PersonDao{
	public String savePerson() {
		int a = 1/0;
		System.out.println("save person");
		return "aaaa";
	}
}
