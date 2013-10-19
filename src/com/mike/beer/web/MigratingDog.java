package com.mike.beer.web;

import javax.servlet.http.*;
import java.io.*;

public class MigratingDog extends AwareDog implements HttpSessionActivationListener, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606511754326254467L;

	public MigratingDog(String breed) {
		super(breed);
	}
	
	public void sessionWillPassivate(HttpSessionEvent event) {
		// Make any non-serializable fields ready to survive a move to a new VM.
	}
	
	public void sessionDidActivate(HttpSessionEvent event) {
		// Code to restore fields - inverse of sessionWillPassivate()
	}

	
}
