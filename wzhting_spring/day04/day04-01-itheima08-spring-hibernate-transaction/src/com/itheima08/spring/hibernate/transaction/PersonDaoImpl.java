package com.itheima08.spring.hibernate.transaction;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.impl.SessionFactoryImpl;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.toplink.SessionFactory;

import com.itheima08.spring.hibernate.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{
	public void savePerson(Person person){
		this.getHibernateTemplate().save(person);
	}

	/**
	 * 分页的查询
	 */
	public List<Person> getPerson(final int firstResult, final int maxResult) {
		return (List<Person>)this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query = session.createQuery("from Person");
				return query.setFirstResult(firstResult).setMaxResults(maxResult).list();			}
		});
	}
	
	/**
	 * 带条件的查询
	 */
	public void queryCondition(){
		List<Person> personList = this.getHibernateTemplate().find("from Person where name=?", "aa");
		for(Person person:personList){
			System.out.println(person.getName());
		}
	}

	public void queryConditions() {
		List<Person> personList = this.getHibernateTemplate().find("from Person where name=? and sex=?", new Object[]{"aa","bb"});
		for(Person person:personList){
			System.out.println(person.getName());
		}
	}
	
	/**
	 * 根据名字查询
	 */
	public void queryCondition_name() {
		List<Person> personList = this.getHibernateTemplate().findByNamedParam("from Person where name=:name", "name", "aa");
		for(Person person:personList){
			System.out.println(person.getName());
		}
	}
	
	public void queryCondition_names(){
		List<Person> personList = this.getHibernateTemplate().findByNamedParam("from Person where name=:name and sex=:sex",new String[]{"name","sex"},new Object[]{"aa","bb"});
		for(Person person:personList){
			System.out.println(person.getName());
		}
	}
}
