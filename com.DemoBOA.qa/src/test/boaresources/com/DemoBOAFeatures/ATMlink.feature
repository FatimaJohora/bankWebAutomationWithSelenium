Feature: This is a ATM link creation feature


  @ATMLink
  Scenario: Verify after clicking the link, the page should display so that we search closest financial center or ATM
  
    Given Launch the application<"URL">
    When Your closest financial center or ATM link will display on the login page
    And Click the closest financial center or ATM link
    Then Verify after clicking the link, the page should display so that we search closest financial center or ATM
