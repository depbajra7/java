package com.mypackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class ProcessInfo extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("studentId");
		//int studentId = Integer.parseInt(id);
		
		HttpGet obj = new HttpGet("http://localhost:8080/StudentService/student?studentId="+id);
		obj.setHeader("Accept","application/json");
		DefaultHttpClient client = new DefaultHttpClient();
		
		CloseableHttpResponse response = client.execute(obj);
		HttpEntity entity = response.getEntity();
		String respn = EntityUtils.toString(entity);
		System.out.println(respn);
		
		
		
		
		
		
	}
}
