@Done
Feature: Done
	The done screen informs the user they have completed the process
	It allows the user to:
		finish (via 2 buttons)
	
Background:
	Given the user has completed the payment process
	And the done screen is shown

@Finish
Scenario: The user finishes the process with the top finish button
	When the finish button is pressed
	Then the test results screen is shown
	And the message code should be "0"
	And the response code should be "null"
	
Scenario: The user finishes the process with the bottom finish button
	When the finish2 button is pressed
	Then the test results screen is shown
	And the message code should be "0"
	And the response code should be "null"