package com.mypackage1;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RecordCreation {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee e = new Employee();
		e.setEmpid(1);
		e.setName("John");
		e.setSalary(1000);
		
		session.beginTransaction();
		session.save(e);
		
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
