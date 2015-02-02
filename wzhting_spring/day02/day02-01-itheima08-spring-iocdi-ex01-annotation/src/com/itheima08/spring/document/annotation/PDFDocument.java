package com.itheima08.spring.document.annotation;

import org.springframework.stereotype.Component;

@Component("pdfDocument")
public class PDFDocument implements Document{

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("pdf read");
	}

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("pdf write");
	}
}
