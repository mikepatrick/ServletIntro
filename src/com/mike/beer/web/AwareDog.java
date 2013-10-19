package com.mike.beer.web;
import javax.servlet.http.*;

public class AwareDog extends Dog implements HttpSessionBindingListener {

	public AwareDog(String breed) {
		super(breed);
	}

	public void valueBound(HttpSessionBindingEvent event) {
		// Dog is aware he is in (being added to) a session.
		
	}
	
	public void valueUnbound(HttpSessionBindingEvent event) {
		// Dog knows he is being removed from a session
	}
}
