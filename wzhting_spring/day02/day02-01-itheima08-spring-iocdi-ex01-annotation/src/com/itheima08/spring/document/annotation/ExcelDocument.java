package com.itheima08.spring.document.annotation;

import org.springframework.stereotype.Component;

@Component("excelDocument")
public class ExcelDocument implements Document{

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("excel read");
	}

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("excel write");
	}
}
