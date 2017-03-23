@BankDetails
Feature: Enter bank details for car tax

Background:
	Given the user has successfully entered their personal details
	And the bank details screen is shown

Scenario: The user enters their personal details successfully
	When valid bank details are entered
	And and the continue button is clicked
	Then the payment summary screen is shown