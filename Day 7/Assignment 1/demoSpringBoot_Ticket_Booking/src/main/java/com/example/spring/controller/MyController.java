package com.example.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Ticket;
import com.example.spring.service.TicketService;

@RestController
public class MyController {
	
	@Autowired
	TicketService tickService;
	
	@GetMapping("/getTickets")
	public ResponseEntity getTickets()
	{
		List<Ticket> allTicks = tickService.getTickets();
		return new ResponseEntity<>(allTicks,HttpStatus.OK);
	}

	@PostMapping("/bookTickets")
	public Ticket bookTicket(@RequestBody Ticket tick){
		return tickService.addTicket(tick);
	}
	
	@DeleteMapping("/cancelTicket/{id}")
	public ResponseEntity<String> cancelTicket(@PathVariable("id") int id){
		System.out.println("Ticket with ID = " + id + "...");
		int k = tickService.deleteTicket(id);
		return new ResponseEntity<>("Ticket has been cancelled! " + k , HttpStatus.OK);
	}
	
}

