package com.itheima08.spring.jdbc.template;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDao2 extends JdbcDaoSupport{
	public void insert(){
		this.getJdbcTemplate().execute("insert into person(name) values('aaa')");
	}
	
	public List<Person> getPersons(){
		return this.getJdbcTemplate().query("select * from person", new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person person = new Person();
				person.setPid(rs.getLong("id"));
				person.setName(rs.getString("name"));
				return person;
			}
		});
	}
}
