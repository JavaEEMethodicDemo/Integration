package com.itheima08.s2sh.service;

import java.io.Serializable;

import com.itheima08.s2sh.domain.Person;

public interface PersonService {
	public void savePerson(Person person);
	
	public Person getPerson(Serializable id);
}
