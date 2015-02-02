package com.itheima08.spring.extend.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Resource(name="supStudent")
	private SupStudent supStudent;

	public SupStudent getSupStudent() {
		return supStudent;
	}
	
}
