package com.itheima08.s2sh.struts2.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.itheima08.s2sh.domain.Person;
import com.itheima08.s2sh.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
	public String savePerson(){
		Person person = new Person();
		person.setName("aaa");
		person.setSex("aa");
		this.personService.savePerson(person);
		ServletContext servletContext = ServletActionContext.getServletContext();
		System.out.println(servletContext);
		return null;
	}
	
	public String showPerson(){
		Person person = this.personService.getPerson(1L);
		ServletActionContext.getRequest().setAttribute("person", person);
		return "index";
	}
}
