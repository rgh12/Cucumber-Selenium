Feature: check login functionality

  Scenario: check login
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario: check login
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to home page
