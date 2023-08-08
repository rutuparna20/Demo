
Feature: To Login to the Application
  
  Scenario: login to the application with valid credentials
    Given user launches the "URL"
    And user is entering the details in username & password field "ariana","abcd"
    And user clicking on Login button
    Then user logged in to the application