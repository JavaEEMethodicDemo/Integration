package com.itheima08.proxy;

/**
 * 目标类
 * @author zd
 *
 */
public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		System.out.println("save person");
	}
}
