package com.itheima08.spring.ioc.createobejct.method;

/**
 * 产生HelloWorld的工厂
 * @author zd
 *
 */
public class HelloWorldFactory {
	public static HelloWorld getInstance(){
		return new HelloWorld();
	}
}
