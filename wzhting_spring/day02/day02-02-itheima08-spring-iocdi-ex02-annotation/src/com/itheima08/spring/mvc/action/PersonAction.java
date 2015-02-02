package com.itheima08.spring.mvc.action;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.itheima08.spring.mvc.service.PersonService;

@Controller("personAction")
public class PersonAction {
	@Resource(name="personService")
	private PersonService personService;
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}

	public void savePerson(){
		this.personService.savePerson();
	}
}
