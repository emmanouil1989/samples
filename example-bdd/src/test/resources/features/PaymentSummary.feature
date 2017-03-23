@PaymentSummary
Feature: Payment Summary
	The summary page shows a summary of what the user will pay (first, subsequent payments)
	It allows the user to:
		submit to accept the payment schedule
		back to return to the previous screen
		cancel to end the process
		change payment type to end the process
	
Background:
	Given the user has successfully entered their bank details
	And the payment summary screen is shown

@PaymentSummaryProceeds
Scenario: The user is happy with the summary and proceeds
	When the submit button is pressed
	Then the done screen is shown
	
@Back
Scenario: The user wants to return to the previous screen
	When the back button is pressed
	Then the bank details screen is shown

@Cancel
Scenario: The user wants to cancel the process
	When the cancel link is pressed
	Then the test results screen is shown
	And a cancellation result code is shown

@ChangePaymentMethod	
Scenario: The user wants to change payment method
	When the change payment method link is pressed
	Then the test results screen is shown
	And a change payment method result code is shown