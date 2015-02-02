package com.itheima08.spring.ioc.createobject.scope;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	public List<String> sList = new ArrayList<String>();

	public HelloWorld(){
		System.out.println("create object");
	}
	public void hello(){
		System.out.println("hello");
	}
}
