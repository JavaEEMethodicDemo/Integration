package com.itheima08.spring.document.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentTest {

	@Test
	public void testDocument_Spring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
		documentManager.write();
		documentManager.read();
	}
}
