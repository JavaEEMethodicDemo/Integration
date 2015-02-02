package com.itheima08.spring.jdbc.template;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Itheima08Template {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Itheima08Template(){
		
	}
	
	public Itheima08Template(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public void insert(String sql) throws Exception{
		Connection connection = this.dataSource.getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate(sql);
	}
}
