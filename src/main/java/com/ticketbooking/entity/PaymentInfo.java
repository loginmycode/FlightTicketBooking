package com.ticketbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="PAYMENT_INFO")
public class PaymentInfo {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String paymentId;
	private String accointNo;
	private double amount;
	private String cardType;
	private Long PassanerId;
	
	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentInfo(String paymentId, String accointNo, double amount, String cardType, Long passanerId) {
		super();
		this.paymentId = paymentId;
		this.accointNo = accointNo;
		this.amount = amount;
		this.cardType = cardType;
		PassanerId = passanerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getAccointNo() {
		return accointNo;
	}
	public void setAccointNo(String accointNo) {
		this.accointNo = accointNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Long getPassanerId() {
		return PassanerId;
	}
	public void setPassanerId(Long passanerId) {
		PassanerId = passanerId;
	}
	
	
	
	
}
