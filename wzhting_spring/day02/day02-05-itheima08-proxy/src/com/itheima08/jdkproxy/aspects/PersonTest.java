package com.itheima08.jdkproxy.aspects;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testPerson(){
		List<Interceptor> interceptors = new ArrayList<Interceptor>();
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		interceptors.add(logger);
		interceptors.add(security);
		interceptors.add(privilege);
		Object target = new SalaryManagerImpl();
		MyInterceptor interceptor = new MyInterceptor(interceptors, target);
		SalaryManager salaryManager = (SalaryManager)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),interceptor);
		salaryManager.showSalary();
	}
}
