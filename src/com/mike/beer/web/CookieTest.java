package com.mike.beer.web;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTest extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		String name = request.getParameter("username");
		
		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("cookieResult.jsp");
		view.forward(request, response);
		
	}
}
