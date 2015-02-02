package com.itheima08.spring.aop.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima08.spring.aop.aspect.privilege.PrivilegeAspect;
import com.itheima08.spring.aop.xml.privilege.action.PersonAction;
import com.itheima08.spring.privilege.Privilege;

public class PrivilegeTest {
	@Test
	public void testPrivilege(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PrivilegeAspect privilegeAspect = (PrivilegeAspect)context.getBean("privilegeAspect");
		//初始化用户的权限，并且放入到切面中
		List<Privilege> privileges = new ArrayList<Privilege>();
		Privilege privilege = new Privilege();
		privilege.setName("asdf");
		privileges.add(privilege);
		privilegeAspect.setPrivileges(privileges);
		
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
