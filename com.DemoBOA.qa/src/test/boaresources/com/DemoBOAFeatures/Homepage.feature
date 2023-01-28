Feature: This is BOA homepage feature file


  Scenario: Verify the Login functionality with invalid credentials  is not successful
    Given Launch the application<"URL">
    When Enter an invalid user Id
    When Enter an invalid password
    And Click the Login button
    Then Verify user can not log in successfully

@Login
  Scenario: Verify an error message should display with an invalid log in
    Given Launch the application<"URL">
    When Enter an invalid user Id
    When Enter an invalid password
    And Click the Login button
    Then Verify an error message should display with an invalid log in
