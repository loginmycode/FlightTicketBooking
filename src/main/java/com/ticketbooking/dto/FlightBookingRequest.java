package com.ticketbooking.dto;

import com.ticketbooking.entity.PassengerInfo;
import com.ticketbooking.entity.PaymentInfo;


public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	private PaymentInfo paymentinfo;
	public FlightBookingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentinfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentinfo = paymentinfo;
	}
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}
	public void setPaymentinfo(PaymentInfo paymentinfo) {
		this.paymentinfo = paymentinfo;
	}
	
	
	
}
