package com.local.reach.poc.cucumber.vo;


public class Account {
	private User user;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public void deposit(int amount){
		balance +=amount;
	}
	
}
