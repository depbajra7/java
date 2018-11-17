package com.mypackage;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/calculate")
public class Calculator {
	
	@GET	//For get methods, always use PathParam or QueryParam
	@Path("/add/{first}/{second}")
	public String add(@PathParam("first")String a, @PathParam("second")String b) { 
		int firstVal = Integer.parseInt(a);
		int secondVal = Integer.parseInt(b);
		int result = firstVal + secondVal;
		return String.valueOf(result);
		
	}
	
	@GET	
	@Path("/subtract/{first}/{second}")
	public String subtract(@PathParam("first")String a, @PathParam("second")String b) {
		int firstVal = Integer.parseInt(a);
		int secondVal = Integer.parseInt(b);
		int result = firstVal - secondVal; 
		return String.valueOf(result);
		
	}
	
	@GET	
	@Path("/multiply") //use QueryParam if path is not supplied as /multiply/{first}/{second}
	public String multiply(@QueryParam("pahilo")String a, @QueryParam("dosro")String b) {
		int firstVal = Integer.parseInt(a);
		int secondVal = Integer.parseInt(b);
		int result = firstVal * secondVal;
		return String.valueOf(result);
	}
	
	@POST	
	@Path("/divide") //if form is used to input data, use form params.
	public String division(@FormParam("first")String a, @FormParam("second")String b) {
		int firstVal = Integer.parseInt(a);
		int secondVal = Integer.parseInt(b);
		int result = firstVal / secondVal;
		return String.valueOf(result);
	}

}
