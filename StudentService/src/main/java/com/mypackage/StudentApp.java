package com.mypackage;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class StudentApp {
	public static void main(String[] args) throws Exception {
	
		//int studentId = Integer.parseInt(id);
		
		HttpGet obj = new HttpGet("http://localhost:8080/StudentService/student?studentId=456");
		obj.setHeader("Accept","application/json");
		DefaultHttpClient client = new DefaultHttpClient();
		
		CloseableHttpResponse response = client.execute(obj);
		HttpEntity entity = response.getEntity();
		String respn = EntityUtils.toString(entity);
		System.out.println(respn);
	}
}
