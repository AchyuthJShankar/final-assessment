Feature:  HRM Login Test Case

Scenario: Verify user is able to login with valid username and password
	Given browser is open and app is in login page
	When user enters username and password
	Then homepage is displayed