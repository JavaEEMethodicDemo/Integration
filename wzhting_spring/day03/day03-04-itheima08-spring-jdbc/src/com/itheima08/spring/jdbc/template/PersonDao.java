package com.itheima08.spring.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao extends Itheima08Template{
	public void inser() throws Exception{
		this.insert("insert into person(name) values('aaa')");
	}
}
