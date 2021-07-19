package com.ticketbooking.dto;

import com.ticketbooking.entity.PassengerInfo;

public class TicketBookingAcknowlegement {

	private String status;
	private double totalfare;
	private String pnrNo;
	private PassengerInfo passengerinfo;
	public TicketBookingAcknowlegement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketBookingAcknowlegement(String status, double totalfare, String pnrNo, PassengerInfo passengerinfo) {
		super();
		this.status = status;
		this.totalfare = totalfare;
		this.pnrNo = pnrNo;
		this.passengerinfo = passengerinfo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalfare() {
		return totalfare;
	}
	public void setTotalfare(double totalfare) {
		this.totalfare = totalfare;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
	public PassengerInfo getPassengerinfo() {
		return passengerinfo;
	}
	public void setPassengerinfo(PassengerInfo passengerinfo) {
		this.passengerinfo = passengerinfo;
	}
	
	
}
