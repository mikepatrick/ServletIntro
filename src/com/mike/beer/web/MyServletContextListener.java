package com.mike.beer.web;
import javax.servlet.*;


public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		// Initialize database connection
		// Store it as a context attribute
		// Use a Dog object to illustrate:
		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);
		
	}
	public void contextDestroyed(ServletContextEvent event) {
		// Close the database connection
	}
}
