Feature: Orange HRM Login Scenarios
	Scenario: Successful Login
	
// Given When And Then 
	Given I am on HRM Login Page
	When Enter username
	And Enter Password
	And click on Login button
	Then Verify we are on Home Page