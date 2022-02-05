package com.cognixia.jump.react;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

@WebServlet("/ReactServlet")
public class ReactServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
		
		PrintWriter pw = response.getWriter();
		
		JSONObject obj = new JSONObject();
	      
	      obj.put("username", "eric");
	      obj.put("password", "password");
	      obj.put("userID", 2 );
	
	      PrintWriter out = response.getWriter();
	      response.setContentType("application/json");
	      response.setCharacterEncoding("UTF-8");
	      out.print(obj);
	      out.flush();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "*" );
		PrintWriter pw = response.getWriter();
		
      
	      JSONObject obj = new JSONObject();
	      
	      obj.put("username", "eric");
	      obj.put("password", "password");
	      obj.put("userID", 2 );
	
	      PrintWriter out = response.getWriter();
	      response.setContentType("application/json");
	      response.setCharacterEncoding("UTF-8");
	      out.print(obj);
	      out.flush();
	}
}
