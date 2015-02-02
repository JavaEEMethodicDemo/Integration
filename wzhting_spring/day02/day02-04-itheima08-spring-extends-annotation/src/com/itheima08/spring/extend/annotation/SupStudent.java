package com.itheima08.spring.extend.annotation;

import org.springframework.stereotype.Component;

@Component("supStudent")
public class SupStudent {
	public void say(){
		System.out.println("sup student");
	}
}
