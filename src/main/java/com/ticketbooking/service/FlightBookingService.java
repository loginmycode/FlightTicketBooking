package com.ticketbooking.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.dto.FlightBookingRequest;
import com.ticketbooking.dto.TicketBookingAcknowlegement;
import com.ticketbooking.entity.PassengerInfo;
import com.ticketbooking.entity.PaymentInfo;
import com.ticketbooking.repo.PassengerRepo;
import com.ticketbooking.repo.PaymentRepo;
import com.ticketbooking.utils.PaymentUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private PaymentRepo paymentRepo;
	public TicketBookingAcknowlegement bookTicket(FlightBookingRequest request)
	{
		PassengerInfo passengerinfo=request.getPassengerInfo();
		passengerinfo=passengerRepo.save(passengerinfo);
		
		PaymentInfo paymentinfo=request.getPaymentinfo();
		
		PaymentUtils.validateCreditLimit(paymentinfo.getAccointNo(), paymentinfo.getAmount());
		paymentinfo.setPassanerId(passengerinfo.getId());
		paymentinfo.setAmount(passengerinfo.getFare());
		paymentRepo.save(paymentinfo);
		return new TicketBookingAcknowlegement("SUCCESS",passengerinfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerinfo);
	}
}
