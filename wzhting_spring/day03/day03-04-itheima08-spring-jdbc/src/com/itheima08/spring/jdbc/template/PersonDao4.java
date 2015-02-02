package com.itheima08.spring.jdbc.template;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao4 extends JdbcTemplate{
	
	public PersonDao4(DataSource dataSource){
		super(dataSource);
	}
	public void insert(){
		this.execute("insert into person(name) values('aaa')");
	}
}
