package com.itheima08.spring.aop.xml.privilege.action;

import com.itheima08.spring.aop.xml.privilege.service.PersonService;

public class PersonAction {
	private PersonService personService;
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public void savePerson(){
		this.personService.savePerson();
	}
}
