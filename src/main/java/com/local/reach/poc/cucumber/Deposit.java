package com.local.reach.poc.cucumber;

//import cucumber.runtime.PendingException;
import static org.junit.Assert.assertTrue;

import com.local.reach.poc.cucumber.vo.Account;
import com.local.reach.poc.cucumber.vo.User;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Deposit {
	
	private Account account;
	@Given("^a User has no money in their account")
	public void a_User_has_no_money_in_their_account() {
		User user = new User();
		account = new Account();
		account.setUser(user);
		account.setBalance(0);
		assertTrue("The balance is not zero.", account.getBalance() == 0);
	}

	@When("^(\\d+) is deposited in to the account")
	public void $_is_deposited_in_to_the_account(int arg1) {
		account.deposit(arg1);
	}

	@Then("^the balance should be ?(\\d+)")
	public void the_balance_should_be_$(double expectedBalance) {
		double currentBalance = account.getBalance();
	    assertTrue("The expected balance was £100, but actually was: " + currentBalance, currentBalance == expectedBalance);
	}

}

 