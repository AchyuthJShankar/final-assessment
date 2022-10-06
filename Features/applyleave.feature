Feature: HRM Leave application Testcase

Scenario: Verify user is able to login with valid username and password
	Given browser is open and app is in login page
	When user enters username and password
	Then homepage is displayed
	
	Scenario: Apply for Leave
	Given navigated to leave page
	When given proper information
	Then user can apply for leave
	
