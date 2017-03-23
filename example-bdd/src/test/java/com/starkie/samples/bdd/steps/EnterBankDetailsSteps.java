package com.starkie.samples.bdd.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.starkie.samples.bdd.utils.Navigation;

import cucumber.api.java8.En;

/**
 * 
 * @author luke.starkie
 */
public class EnterBankDetailsSteps implements En {
	
	public EnterBankDetailsSteps(@Autowired Navigation navigation) {
		Given("^the user has successfully entered their personal details$", () -> {
			navigation.personalDetailsHaveBeenEntered();
		});
		When("^valid bank details are entered$", () -> {
			navigation.enterValidBankDetails();
		});
		When("^and the continue button is clicked$", () -> {
			navigation.whenIContinueOnBankPage();
		});
		Then("^the payment summary screen is shown$", () -> {
			navigation.thePaymentScreenIsShown();
		});
	}
}