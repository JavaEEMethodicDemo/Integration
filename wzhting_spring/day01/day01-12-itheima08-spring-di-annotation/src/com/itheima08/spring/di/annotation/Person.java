package com.itheima08.spring.di.annotation;

import javax.annotation.Resource;

public class Person {
	@Resource(name="student")
	private Student studen;
	
	public Student getStudent() {
		return studen;
	}
}
