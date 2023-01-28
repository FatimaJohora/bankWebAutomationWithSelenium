Feature: This is a Security and help feature file

  @Security
  Scenario: Verify after clicking the link, Security & Help window should display
  
    Given Launch the application<"URL">
    When Click  the security  Help link
    Then Verify after clicking the link, Security Help window should display
