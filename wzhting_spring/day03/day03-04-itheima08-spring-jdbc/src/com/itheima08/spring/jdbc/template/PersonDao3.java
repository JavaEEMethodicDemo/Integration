package com.itheima08.spring.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao3{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(){
		this.jdbcTemplate.execute("insert into person(name) values('aaa')");
	}
}
