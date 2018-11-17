package com.mypackage1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Employee e = new Employee();
		e.setEmpid(3);
		e.setName("Claire");
		e.setSalary(10000);
		session.update(e);
		
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
