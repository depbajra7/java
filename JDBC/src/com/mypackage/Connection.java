package com.mypackage;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

	public static void main(String[] args){
		java.sql.Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			Statement st = conn.createStatement();
			/*ResultSet rset = st.executeQuery("select * from employeerecord");
		
			while (rset.next()) {
				int employeeid = rset.getInt("empid");
				String empname = rset.getString("name");
				System.out.print(employeeid + " " + empname);
				System.out.println();
			
			}
			 */
			/*int rowsUpdated = st.executeUpdate("insert into employeerecord values(1111,'dep','20000','male',1,23,1)");
			System.out.println(rowsUpdated + " rows updated");*/
		
			/*int rowsUpdated = st.executeUpdate("update employeerecord set salary = 50000 where empid = 1111");
			System.out.println(rowsUpdated + " rows were updated");*/
		
			/*int rowsUpdated = st.executeUpdate("delete from employeerecord where empid = 1111");
			System.out.println(rowsUpdated + " rows were updated");*/
		
			ResultSet rset = st.executeQuery("select e.empid, e.name, a.state from employeerecord e join employeeaddress a on e.addressid = a.addressid");
		
			while (rset.next()) {
				int emplid = rset.getInt("empid");
				String name = rset.getString("name");
				String state = rset.getString("state");
				System.out.print(emplid);
				System.out.print(name);
				System.out.print(state);
				System.out.println();
			}
		}
		catch (Exception e) {
			System.out.println("exception caught");
			
		}
		finally {
			try {
				conn.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				
				System.out.println("connection not closed");
			}
		}
	}

}
