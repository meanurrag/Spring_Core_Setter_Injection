package com.ranjan.beans;

import java.util.Date;

public class WishMessageGenerator {

	//HAS-A relation (supporting composition or Injection)
	private Date date;
	
	//0 param constructor
	public WishMessageGenerator() {
		
		System.out.println("WishMessageGenerator, 0-Param Constructor");
	}
	
	//setter method
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	//business logic
	public String generateMessage(String user) {
		
		//get current hour of the day
		int hour = date.getHours();  //gives 0 to 23
		if(hour<12) 
			return "Good Morning"+user;
		else if(hour<16)
			return "Good Afternoon"+user;
		else if(hour<20)
			return "Good Evening"+user;
		else
			return "Good Night"+user;
	}
}
