Feature: Ebay Advanced Search Page

  @P34
  Scenario: Ebay Logo on Advanced Search Page
    Given I am on Ebay Advanced Search Page
    When I Click on EBay Logo
    Then I am navigated to EBay Home Page

  @P32 @setCookies
  Scenario: Advanced search on item
    Given I am on Ebay Advanced Search Page
    When i Adv search on an Item
      | keyword   | exclude     | min | max |
      | iphone 11 | refurbished | 300 | 900 |
