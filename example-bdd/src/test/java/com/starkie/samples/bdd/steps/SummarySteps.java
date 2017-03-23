package com.starkie.samples.bdd.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.starkie.samples.bdd.utils.Navigation;

import cucumber.api.java8.En;

/**
 * Steps class for the summary screen
 * @author luke.starkie
 */
public class SummarySteps implements En {

	public SummarySteps(@Autowired Navigation navigation) {
		Given("^the user has successfully entered their bank details$", () -> {
			navigation.bankDetailsHaveBeenEntered();
		});
		When("^the submit button is pressed$", () -> {
			navigation.whenISubmitPaymentSummary();
		});
		Then("^the done screen is shown$", () -> {
			navigation.theDoneScreenIsShown();
		});
		When("^the back button is pressed$", () -> {
			navigation.whenIBackPaymentSummary();
		});
		When("^the cancel link is pressed$", () -> {
			navigation.whenICancelPaymentSummary();
		});
		When("^the change payment method link is pressed$", () -> {
			navigation.whenIChangePaymentMethodPaymentSummary();
		});
		Then("^the test results screen is shown$", () -> {
			navigation.theTestResultsScreenIsShown();
		});
		Then("^a cancellation result code is shown$", () -> {
			navigation.cancellationResponse();
		});
		Then("^a change payment method result code is shown$", () -> {
			navigation.changePaymenyMethodResponse();
		});
	}
}