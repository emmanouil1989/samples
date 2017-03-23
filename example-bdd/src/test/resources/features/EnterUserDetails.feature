@UserDetails
Feature: Enter user details for car tax
	Customer need to be able to enter their personal details.
	This includes name, address, email and date of birth.
	
Background:
	Given a browser window is open showing the test harness page
	And the user enter valid data and clicks submit
	And the enter details screen is shown

@enterDetailsSuccessfully
Scenario: The user enters their personal details successfully
	When user details are entered
	And the continue button is pressed
	Then the bank details screen is shown

Scenario: The user enters their personal details using the address lookup feature
	When user details are entered
	And the find my address button is pressed
	Then the enter details screen is shown
	And the users full address is populated
	
Scenario: The user enters their personal details that results in a screen error message displayed
	When user details are entered with a missing email address
	And the continue button is pressed
	Then the enter details screen is shown
	And an error message is shown for the email field