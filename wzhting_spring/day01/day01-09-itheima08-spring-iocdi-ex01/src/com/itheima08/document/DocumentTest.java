package com.itheima08.document;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentTest {
	@Test
	public void testDocument_NOSpring(){
		/**
		 * 1、创建一个Document对象
		 * 2、创建DocumentManager对象
		 * 3、调用方法
		 */
		Document wordDocument = new WordDocument();
		DocumentManager documentManager = new DocumentManager(wordDocument);
		documentManager.read();
		documentManager.write();
	}
	
	@Test
	public void testDocument_Spring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
		documentManager.write();
		documentManager.read();
	}
}
