package com.itheima08.spring.hibernate.transaction;

import java.util.List;

import com.itheima08.spring.hibernate.domain.Person;

public interface PersonDao {
	public void savePerson(Person person);
	
	public List<Person> getPerson(int firstResult,int maxResult);
	
	public void queryCondition();
	
	public void queryConditions();
	
	public void queryCondition_name();
	
	public void queryCondition_names();
}
