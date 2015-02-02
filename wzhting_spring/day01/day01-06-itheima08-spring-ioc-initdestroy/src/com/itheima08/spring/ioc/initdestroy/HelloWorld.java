package com.itheima08.spring.ioc.initdestroy;

public class HelloWorld {
	public HelloWorld(){
		System.out.println("create instance");
	}
	
	public void hello(){
		System.out.println("hello");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
}
