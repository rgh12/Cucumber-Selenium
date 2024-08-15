Feature: check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario: check logout link
    
    When user clicks on performance link
    Then My Trackers link is displayed

  Scenario: verify quick launch toolbar is present
    
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
