package com.local.reach.poc.cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber"})
//@Cucumber.Options(glue={""})
public class DepositTest {
	
/*	Deposit deposit;
	
	public void setup() {
		deposit = new Deposit();
	}
	
	public void teardown() {
		deposit = null;
	}
	
	
	@Test
	public void testDepositFunctionality(){
		deposit.a_User_has_no_money_in_their_account();
		deposit.$_is_deposited_in_to_the_account(20);
		deposit.the_balance_should_be_$(20);
	}*/
}
