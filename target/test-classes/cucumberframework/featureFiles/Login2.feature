Feature: Login into stackoverflow website2
  I want to use this template to validate an existing user with their credentials2

  Scenario: Login into stackoverflow website with valid credentials2 
    Given User navigates to stackoverflow website2 
    And User clicks on Log in button2 
    And User enters a valid username2 
    And User enters a valid password2 
    When User clicks on the Submit button2 
    Then User is taken to login page successfully2 
    
