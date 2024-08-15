Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser1 is open
    And user on login page
    When user enter <username> and <password>
    And click on login button
    Then user navigates to Home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin12  |
      | Admin    | admin1   |
