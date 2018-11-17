package com.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTable {
	
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		EmployeeTable e = new EmployeeTable();
		e.setEmpid(1);
		e.setName("john");
		e.setSalary(14000);
		
		/*AddressTable a = new AddressTable();
		a.setAddressid(1000);
		a.setStreet("hart");
		a.setState("new york");*/
		
		session.beginTransaction();
	
		session.save(e);
		session.getTransaction().commit();
		
		
		session.close();
		sf.close();
		
		
		
	
		
	}

}
