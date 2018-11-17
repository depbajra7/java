package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConnect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		java.sql.Connection connt = null;
		

		try {
			String id = req.getParameter("empid");
			int emid = Integer.parseInt(id);
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			connt = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement ps = connt.prepareStatement("select name, salary from employeerecord where empid=:emid " );
			ps.setInt(1, emid);
			ResultSet reset = ps.executeQuery();
			
			
			// stmt = connt.createStatement();
			
			//ResultSet reset = stmt.executeQuery("select empid, salary from employeerecord where empid = " + emid);

			List<DetailsOfEmployee> list1 = new ArrayList<DetailsOfEmployee>();

			while (reset.next()) {

				
				int salary = reset.getInt("salary");
				
				String name = reset.getString("name");
				

				DetailsOfEmployee employeedetails = new DetailsOfEmployee();

				
				employeedetails.setName(name);
				
				employeedetails.setSalary(salary);
				

				list1.add(employeedetails);
			}

			PrintWriter pw = resp.getWriter();

			pw.println("<html>");
			pw.println("<body>");
			pw.println("<table border = \"1\">");
			pw.println("<tr>");
			pw.println(
					"<th> employee name</th><th>salary</th>");
			for (int i = 0; i < list1.size(); i++) {
				DetailsOfEmployee empdetails = list1.get(i);
				pw.println("<tr>");
				
				pw.println("<td>" + empdetails.getName() + "</td>");
				pw.println("<td>" + empdetails.getSalary() + "</td>");
				
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {

			try {
				connt.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("connection not closed");
			}
		}

	}

}
