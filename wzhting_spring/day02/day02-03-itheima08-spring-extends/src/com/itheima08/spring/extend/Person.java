package com.itheima08.spring.extend;

public class Person {
	public Person(){
		System.out.println("person");
	}
	private String s;
	private Long pid;
	private Student student;
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}
