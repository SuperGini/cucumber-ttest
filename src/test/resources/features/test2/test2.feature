Feature: Just testing

  Scenario Outline: Admin Page login
    Given User is trying to login
    When  User enters application with <Username> and password <password>
    Then  Home Page is displayed at the end
    Examples:
    |Username|password|
    |gigel   |123     |
    |ionel   |456     |
