Feature: HRM Employee Search Testcase

Scenario: Verify user is able to login with valid username and password
	Given browser is open and app is in login page
	When user enters username and password
	Then homepage is displayed
	
	Scenario: Search for an Employee
	Given navigated to search page
	When given proper name
	Then employee information can be found
	