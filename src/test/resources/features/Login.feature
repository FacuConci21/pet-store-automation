
  @FailLogin
  Feature: Login Functionality
    As a user I wish to login

  Scenario: Error Login
    Given on the main page
    When a user enters the values "SheldonCooper" y "123456789"
    Then the login fails