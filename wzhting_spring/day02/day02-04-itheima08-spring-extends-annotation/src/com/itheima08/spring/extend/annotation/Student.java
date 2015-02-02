package com.itheima08.spring.extend.annotation;

import org.springframework.stereotype.Component;

@Component("student")
public class Student extends Person{
	public void say(){
		this.getSupStudent().say();
	}
}
