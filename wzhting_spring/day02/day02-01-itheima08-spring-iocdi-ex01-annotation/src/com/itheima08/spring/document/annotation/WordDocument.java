package com.itheima08.spring.document.annotation;

import org.springframework.stereotype.Component;

@Component("wordDocument")
public class WordDocument implements Document{

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("word read");
	}

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("word write");
	}
}
