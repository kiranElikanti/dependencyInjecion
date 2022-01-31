package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private String customerName;
	private int customerId;
	@Autowired
	private Technologies techDetails;
	private String customerEmail;
	private int CustomerPhoneNumber;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}
        public void display() {
        	System.out.println("customer object created");
        	techDetails.tech();
        }
}
