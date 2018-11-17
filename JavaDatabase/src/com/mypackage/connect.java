package com.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {

	/*
	 * public static void main(String[] args) throws Exception{
	 * 
	 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection conn =
	 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system",
	 * "system"); Statement stmt = conn.createStatement(); ResultSet rs =
	 * stmt.executeQuery("select * from employeerecord"); while(rs.next()) { int
	 * empId = rs.getInt("empid"); String empName = rs.getString("name");
	 * 
	 * int salary = rs.getInt("salary"); System.out.println("employee id is" +
	 * empId); System.out.println("salary is" + salary);
	 * System.out.println("Name is" + empName); } } }
	 */

	public static void main(String[] args) {
		try {
			Class.forName("java");

		} catch (ClassNotFoundException e) {

		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
		} catch (SQLException e) {
		}
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

		} catch (SQLException e) {

		}
		int numberInserted = 0;
		try {
			numberInserted = stmt.executeUpdate("delete from employee where empid in(1,2,3)");
			System.out.println(numberInserted);
		} catch (SQLException e) {

		}
		
	}
}





