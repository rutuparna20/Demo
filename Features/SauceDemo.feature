
Feature: To Validate the application
  
Background: To Login to the Application

    Given user launches the "https://www.saucedemo.com"
    And user is entering the details in username and password field "standard_user","secret_sauce"
    And user clicking on Login button
    Then user logged in to the application

  Scenario: validating the application end to end
   
    When user selecting an item 
    And user validating the name of the product and price
    Then user  adding it to the cart
    Then user is filling the datails in shopping section "ariana","absd","23456"
    And user should be able to navigate to the next page
    
    
   