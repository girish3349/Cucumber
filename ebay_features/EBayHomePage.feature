Feature: EBay Home Page Scenarios

  @P1 @Test
  Scenario: Advanced Search Link
    Given I am on EBay Home Page
    When I click on Advanced link
    Then I navigate to Advanced Search page

  @P2 @setCookies
  Scenario: Advanced Search Link
    Given I am on EBay Home Page
    When I Search for 'Iphone 13'
    Then Verify atlease 1000 items are present

  @P3 @setCookies
  Scenario: Advanced Search Link
    Given I am on EBay Home Page
    When I Search for 'Toy cars'
    Then Verify atlease 100 items are present

  @P44 @setCookies
  Scenario: Advanced Search Link
    Given I am on EBay Home Page
    When I Search for 'Toy cars' in 'Baby' category
    Then Verify atlease 100 items are present

  @P320 @setCookies
  Scenario Outline: Home Page links
    Given I am on EBay Home Page
    When I clikc on "<link>"
    Then I Validate that page nagivates to "<url>" and title contains "<title>"

    Examples: 
      | link        | url                                                            | title       |
      | Motors      | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334 | eBay Motors |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124               | Electronics |
      | Toys        | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497             | Toys        |
