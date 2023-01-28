Feature: This is an Appointment feature file


@Appointment
  Scenario: Verify after clicking the link, the page should display so that we make an Appointment
    Given Launch the application<"URL">
    When The appointment link should be available on the login page
    And Click the appointment link
    Then Verify after clicking the link the page should display so that we make an Appointment
