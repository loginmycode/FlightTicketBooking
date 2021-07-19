package com.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.dto.FlightBookingRequest;
import com.ticketbooking.dto.TicketBookingAcknowlegement;
import com.ticketbooking.service.FlightBookingService;

@RestController
public class TicketBookingController {

	@Autowired
	public FlightBookingService bookingService;
	@PostMapping("/bookticket")
	public TicketBookingAcknowlegement bookFlightTicket(@RequestBody FlightBookingRequest request)
	{
		return bookingService.bookTicket(request);
	}
}
