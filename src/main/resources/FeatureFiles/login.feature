Feature: Login Functionality of the Application

  Scenario: Validate login functionality with valid credentials
    Given user is on login page
    When user enters valid username and password
    And user clicks the login Button
    Then user should be navigated to homepage

  Scenario: Validate login page url
    Given user is on login page
    When user gets the page url

  Scenario: Validate login page title
    Given user is on login page
    When user gets the page title