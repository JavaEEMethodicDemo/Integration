package com.itheima08.spring.scan;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	public void say(){
		System.out.println("student");
	}
}
