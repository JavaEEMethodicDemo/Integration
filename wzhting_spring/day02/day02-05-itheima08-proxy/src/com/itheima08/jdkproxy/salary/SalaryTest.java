package com.itheima08.jdkproxy.salary;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class SalaryTest {
	@Test
	public void testSalary(){
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("asf");
		Object target = new SalaryManagerImpl();
		MyInterceptor interceptor = new MyInterceptor(logger, security, privilege, target);
		SalaryManager salaryManager = (SalaryManager)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		salaryManager.showSalary();
	}
}
