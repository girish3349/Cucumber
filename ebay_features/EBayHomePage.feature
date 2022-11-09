Feature: EBay Home Page Scenarios

@P1
	Scenario: Advanced Search Link

		Given I am on EBay Home Page
		When I click on Advanced link
		Then I navigate to Advanced Search page

@P2
	Scenario: Advanced Search Link
		Given I am on EBay Home Page
		When I Search for 'Iphone 13'
		Then Verify atlease 1000 items are present		
		
@P3
	Scenario: Advanced Search Link
		Given I am on EBay Home Page
		When I Search for 'Toy cars'
		Then Verify atlease 100 items are present	
		
@P44
	Scenario: Advanced Search Link
		Given I am on EBay Home Page
		When I Search for 'Toy cars' in 'Baby' category 
		Then Verify atlease 100 items are present	