package com.example.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Ticket {

	
	private int id;
	private String travels_name;
	private String from, to;
	
	Ticket(){}

	public Ticket(int id, String travels_name, String from, String to) {
		super();
		this.id = id;
		this.travels_name = travels_name;
		this.from = from;
		this.to = to;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravels_name() {
		return travels_name;
	}

	public void setTravels_name(String travels_name) {
		this.travels_name = travels_name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	
}
