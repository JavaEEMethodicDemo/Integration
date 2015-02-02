package com.itheima08.spring.aop.xml.exception;

/**
 * 异常qiemia
 * @author zd
 *
 */
public class MyException {
	public void myException(Throwable ex){
		System.out.println(ex.getMessage());
	}
}
