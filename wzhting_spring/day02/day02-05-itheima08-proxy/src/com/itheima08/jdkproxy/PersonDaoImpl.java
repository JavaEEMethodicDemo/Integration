package com.itheima08.jdkproxy;

/**
 * 目标类
 * @author zd
 *
 */
public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		System.out.println("save person");
	}

	public void updatePerson() {
		System.out.println("update person");
	}
}
