package com.mypackage;

import java.io.IOException;

import javax.security.auth.login.Configuration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SignupServlet extends HttpServlet {

	@SuppressWarnings("deprecation")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("empname");
		String gender = req.getParameter("gender");
		String empsalary = req.getParameter("empsalary");		
		String empage = req.getParameter("empage");
		
		int salary = Integer.parseInt(empsalary);
		int age = Integer.parseInt(empage);
		
		
		org.hibernate.cfg.Configuration c = new org.hibernate.cfg.Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee rc = new Employee();
		rc.setName(name);
		rc.setGender(gender);
		rc.setSalary(salary);
		rc.setAge(age);
		
		session.beginTransaction();
		session.save(rc);
		session.getTransaction().commit();
		sf.close();
		session.close();
	}
}
