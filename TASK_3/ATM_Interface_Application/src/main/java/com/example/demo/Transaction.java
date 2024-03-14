package com.example.demo;

import java.sql.Date;
//import java.util.Date

public class Transaction {
	 private String type;
	    private double amount;
	    private Date date;
	    private String userId;
	    private double balance;

	    public Transaction(String type, double amount) {
	        this.type = type;
	        this.amount = amount;
	        this.userId = userId;
	        //this.date = new Date();
	        this.date = new Date(System.currentTimeMillis()); // Instantiate Date with current time

	    }
	    
	    
	    public double getBalance() {
			return balance;
		}

		public String getUserId() {
			return userId;
		}

		public String getType() {
	        return type;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public Date getDate() {
	        return date;
	    }

}
