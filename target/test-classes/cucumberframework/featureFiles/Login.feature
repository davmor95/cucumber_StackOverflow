Feature: Login into stackoverflow website
  I want to use this template to validate an existing user with their credentials

  Scenario: Login into stackoverflow website with valid credentials
    Given User navigates to stackoverflow website
    And User clicks on Log in button
    And User enters a valid username
    And User enters a valid password
    When User clicks on the Submit button
    Then User is taken to login page successfully
    
