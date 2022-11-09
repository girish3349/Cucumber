Feature: EBay Home Page Scenarios

@P1
	Scenario: Advanced Search Link

		Given I am on EBay Home Page
		When I click on Advanced link
		Then I navigate to Advanced Search page

@P2
		Scenario: Advanced Search Link
		Given I am on EBay Home Page
		When I Search for Iphone 13
		Then Verify atlease 1000 items are present		