package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
//@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	//String name=request.getParameter("uname");
		HttpSession session=request.getSession(true);
		String name=(String)session.getAttribute("name");
		out.println("<h1>Welcome "+name+ "</h1>");
	
	
	}

	

}
