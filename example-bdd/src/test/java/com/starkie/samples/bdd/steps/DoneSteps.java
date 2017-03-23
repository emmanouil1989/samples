package com.starkie.samples.bdd.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.starkie.samples.bdd.utils.Navigation;

import cucumber.api.java8.En;

/**
 * Steps class for the summary screen
 * @author luke.starkie
 */
public class DoneSteps implements En {

	public DoneSteps(@Autowired Navigation navigation) {
		Given("^the user has completed the payment process$", () -> {
			navigation.paymentProcessCompleted();
		});
		When("^the finish button is pressed$", () -> {
			navigation.whenIFinish();
		});
		When("^the finish2 button is pressed$", () -> {
			navigation.whenIFinishBottom();
		});
		Then("^the message code should be \"([^\"]*)\"$", (String arg1) -> {
			navigation.responseCode(arg1);
		});
		Then("^the response code should be \"([^\"]*)\"$", (String arg1) -> {
			navigation.messageCode(arg1);
		});
	}
}