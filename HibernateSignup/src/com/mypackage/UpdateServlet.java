package com.mypackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empid = req.getParameter("id");
		String name = req.getParameter("empname");
		String gender = req.getParameter("gender");
		String empsalary = req.getParameter("empsalary");		
		String empage = req.getParameter("empage");
		
		int id = Integer.parseInt(empid);
		int salary = Integer.parseInt(empsalary);
		int age = Integer.parseInt(empage);
		
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Employee updemp = new Employee();
		session.beginTransaction();
		updemp.setId(id);
		updemp.setName(name);
		updemp.setGender(gender);
		updemp.setSalary(salary);
		updemp.setAge(age);
		
		session.update(updemp);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
