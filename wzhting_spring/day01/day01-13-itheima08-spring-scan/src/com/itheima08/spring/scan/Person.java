package com.itheima08.spring.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
//	@Autowired//按照类型进行匹配
//	@Qualifier("student")
	@Resource(name="student")
	private Student studen;
	
	public Student getStudent() {
		return studen;
	}
}
