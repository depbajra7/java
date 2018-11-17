package com.mypackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/student")
public class StudentService {

	@GET
	@Produces("application/json")
	public StudentDetails displayStudentInfo(@QueryParam("studentId") String id){
		int studentId = Integer.parseInt(id);
		System.out.println(studentId);
		StudentDetails student1 = new StudentDetails();
		student1.setAge(25);
		student1.setName("harry");
		student1.setId(studentId);
		return student1;
	}
	
	
	
	/*@POST
	public StudentDetails addStudent() {
		
	}*/
	
}
