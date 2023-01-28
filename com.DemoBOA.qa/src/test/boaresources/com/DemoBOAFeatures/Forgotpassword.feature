Feature: This is a forgot ID & Password feature file

@ForgotID

  Scenario: Verify after clicking the link, the Forgot ID password page should display
    Given Launch the application<"URL">
    When Click the Forgot ID password link
    Then Verify after clicking the link, the Forgot ID password page should be display
