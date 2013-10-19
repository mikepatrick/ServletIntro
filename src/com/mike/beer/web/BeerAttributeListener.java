package com.mike.beer.web;

import javax.servlet.http.*;

public class BeerAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent event) {
		
		// Get the name and value of the attribute that triggered this event
		String name = event.getName();
		Object value = event.getValue();
		
		//Check tomcat/logs/catalina.log for this output
		System.out.println("Attribute added: " + name + ": " + value);
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		
		//Check tomcat/logs/catalina.log for this output
		System.out.println("Attribute removed: " + name + ": " + value);		
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		
		//Check tomcat/logs/catalina.log for this output
		System.out.println("Attribute replaced: " + name + ": " + value);		
	}	
}
