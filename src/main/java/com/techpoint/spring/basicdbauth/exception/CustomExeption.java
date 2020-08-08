package com.techpoint.spring.basicdbauth.exception;

import java.util.Date;

public class CustomExeption extends Exception {
	private String message;
	private Date date;
	private Character type;
	
	
	public CustomExeption(String message,Date date,Character type) {
		super(message);
		this.message = message;
		this.date = date;
		this.type = type;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CustomExeption [message=" + message + ", date=" + date + ", type=" + type + "]";
	}
	
	
	
}
