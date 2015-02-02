package com.itheima08.hibernate.callback;

import org.hibernate.Session;

public interface HibernateCallback {
	public Object doInHibernate(Session session);
}
