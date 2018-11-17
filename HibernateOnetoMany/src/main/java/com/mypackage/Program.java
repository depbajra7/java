package com.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Program {

	public static void main(String[] args) {
		Session session = null;
		SessionFactory sf = null;
		try {
		Configuration c = new Configuration();
		c.configure();
		sf = c.buildSessionFactory();
		session = sf.openSession();
		Address a = new Address();
		a.setLine1("602 Hart St");
		a.setLine2("Aspen 211");
		a.setCity("Alva");
		a.setState("Oklahoma");
		
		
				
		Employee e = new Employee();
		e.setName("Alvin");
		e.setAge(40);
		e.setGender("male");
		
		
		session.beginTransaction();
		session.save(a);
		session.save(e);
		session.getTransaction().commit();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
			sf.close();
		}
		

	}

}
