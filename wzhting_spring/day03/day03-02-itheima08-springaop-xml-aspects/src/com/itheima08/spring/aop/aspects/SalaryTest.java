package com.itheima08.spring.aop.aspects;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryTest {
	@Test
	public void testSalary(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SalaryManagerImpl salaryManager = (SalaryManagerImpl)context.getBean("salaryManager");
		salaryManager.showSalary();
	}
}
