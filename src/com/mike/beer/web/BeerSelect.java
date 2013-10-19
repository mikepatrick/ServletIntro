package com.mike.beer.web;

import javax.servlet.*;
import javax.servlet.http.*;

import com.mike.beer.model.BeerExpert;

import java.io.*;
import java.util.List;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");
//		out.println("<br>Got beer color " + c + "<br>");
		
		BeerExpert advisor = new BeerExpert();
		List<String> advice = advisor.getBrands(c);
		
//		for(String s : advice){
//			out.println("We recommend " + s + "<br>");
//		}

		request.setAttribute("styles", advice);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		view.forward(request, response);
		
	}
}
