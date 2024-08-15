
Feature: feature to test google search functionality

	@smoke
  Scenario: Validate google search is working
    Given broswer is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
    
    @regression
    Scenario: Sample1
    Given
    When
    And
    Then
    
    @smoke @regression
    Scenario: Sample2
    Given
    When
    And
    Then
    
    @important @regression
    Scenario: Sample3
    Given
    When
    And
    Then

    
    