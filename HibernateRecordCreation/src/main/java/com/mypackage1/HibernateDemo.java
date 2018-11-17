package com.mypackage1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Employee e = session.get(Employee.class, 2);
		
	
		
		System.out.print(e.getEmpid() + " ");
		System.out.print(e.getName() + " ");
		System.out.println(e.getSalary());
		
		
		session.close();
		sf.close();
				
	}

}
