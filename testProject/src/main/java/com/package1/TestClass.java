package com.package1;

public class TestClass {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Employee e = new Employee();
		e.setEmpid(4);
		e.setName("Claire");
		e.setSalary(5400);
		
		session.save(e);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}
