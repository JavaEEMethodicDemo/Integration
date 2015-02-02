package com.itheima08.threadlocal;

import org.junit.Test;

public class A {
	public void aa(){
		B b = new B();
		b.bb();
	}
	
	@Test
	public void test(){
		A a = new A();
		a.aa();
	}
}
