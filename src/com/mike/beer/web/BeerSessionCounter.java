package com.mike.beer.web;

import javax.servlet.http.*;

public class BeerSessionCounter implements HttpSessionListener {

	static private int activeSessions;
	
	public static int getActiveSessions() {
		return activeSessions;
	}
	
	public void sessionCreated(HttpSessionEvent event) {
		activeSessions++;
	}
	
	public void sessionDestroyed(HttpSessionEvent event) {
		activeSessions--;
	}
}
