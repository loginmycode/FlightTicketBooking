package com.ticketbooking.utils;

import java.util.HashMap;
import java.util.Map;

import com.ticketbooking.exception.InSufficientBalance;

public class PaymentUtils {

	private static Map<String, Double> paymentmap= new HashMap<String,Double>();
	
	static
	{
		paymentmap.put("acc1", 10000.0);
		paymentmap.put("acc2", 9000.0);
		paymentmap.put("acc3", 14000.0);
		paymentmap.put("acc4", 13000.0);
		paymentmap.put("acc5", 20000.0);
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount)
	{
		if(paidAmount>paymentmap.get(accNo))
		{
			throw new InSufficientBalance("There is no sufficent balance account to book the ticket");
		}
		else
		{
			return true;
		}
	}
}
