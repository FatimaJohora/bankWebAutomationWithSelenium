Feature: This is a logging button feature


@LogInBtn
  Scenario: Verify the login button should be clickable
  
    Given Launch the application<"URL">
    When The login button is on the login field
    Then Verify the login button should be clickable
