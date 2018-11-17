package com.mypackage;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/student")
public class StudentService {
	
	
	@GET
	@Produces("application/json")
	public Student displayStudentInfo(@QueryParam("studentId") String id) {
		int studentId = Integer.parseInt(id);
		Student s = new Student();
		s.setAge(20);
		s.setId(studentId);
		s.setName("harry");
		return s;
	}
	
	@POST
	@Consumes("application/json") //information is injected using postman in json format.
	public void createStudent(Student student2) {
		System.out.println(student2.getId());
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
	}
	
	@DELETE
	@Path("/delete")
	public void deleteStudent(@QueryParam("studentId") String id) {
		System.out.println("student number " + id + " has been deleted");
	}	 

}
