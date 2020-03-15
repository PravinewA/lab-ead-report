package com.pravinewa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHello extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>" + "hello" + "</h1>");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		pw.println("First Name" + firstName + " Last Name " + lastName);
	}

}
