package com.itheima08.spring.di.constrcutor;

public class Person {
	private Long pid;
	private String name;
	private Student student;
	
	
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * 默认的构造器
	 */
	public Person(){
		
	}
	
	public Long getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public Student getStudent() {
		return student;
	}

	public Person(Long pid){
		this.pid = pid;
	}
	
	public Person(Long pid,String name){
		this.pid = pid;
		this.name = name;
	}
	
	
	public Person(String name,Student student){
		this.name = name;
		this.student = student;
	}
}
