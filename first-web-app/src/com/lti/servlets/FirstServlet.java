package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 
//@WebServlet("/FirstServlet")*/
public class FirstServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		PrintWriter out=response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>First Servlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h2>Welcome "+uname+"</h2>");
//		out.println("</body>");
//		out.println("</html>");
		
		if(uname.equals("prachi")&&password.equals("prachi")) {
			RequestDispatcher rd= request.getRequestDispatcher("/welcome");
			
			HttpSession session=request.getSession();
			session.setAttribute("name", uname);
			rd.forward(request, response);
		}
		else {
			out.println("Sorry incorrect");
			out.println("Tyr again");
			out.println("Everyone Hiiii");
			RequestDispatcher rd= request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		

	
	}


}
