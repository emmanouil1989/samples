package com.starkie.samples.bdd.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.starkie.samples.bdd.utils.Navigation;

import cucumber.api.java8.En;

/**
 * 
 * @author luke.starkie
 */
public class EnterUserDetailsSteps implements En {
	
	public EnterUserDetailsSteps(@Autowired Navigation navigation) {
		Given("^a browser window is open showing the test harness page$", () -> {
			navigation.loadTestHarnessPage();
		});
		Given("^the user enter valid data and clicks submit$", () -> {
			navigation.submitTestHarnessPage();
		});
		Then("^the enter details screen is shown$", () -> {
			navigation.theEnterDetailsScreenIsShown();
		});
		When("^user details are entered$", () -> {
			navigation.enterUserDetails();
		});
		When("^the continue button is pressed$", () -> {
			navigation.whenIContinueOnEnterDetailsPage();
		});
		Then("^the bank details screen is shown$", () -> {
			navigation.theBankScreenIsShown();
		});
		When("^the find my address button is pressed$", () -> {
			navigation.whenIFindMyAddress();
		});
		Then("^the users full address is populated$", () -> {
			navigation.thenMyAddressIsPopulated();
		});
		When("^user details are entered with a missing email address$", () -> {
			navigation.enterIncompleteUserDetails();
		});
		Then("^an error message is shown for the email field$", () -> {
			navigation.errorMessageShown("email");
		});
	}
}