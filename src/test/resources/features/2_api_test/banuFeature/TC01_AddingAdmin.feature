Feature: US22 Admin Added Test

  Background: US22 all steps
    Given kullanici "baseUrl" sayfasina gider
    And User clicks the Login section
    And User enters given infos and login
      | email          | password      |
      | Team12Admin    | Team12Admin   |
    And Sees "Add Admin" title

  Scenario Outline: TC01 Admin Added Positive Scenario
    And User enters the required infos and add "<Date Of Birth>", "<Phone>"
    And User enters total Ssn number first 3 digit and 2 digit and add 4 digits with a '-' sign after the third and fifth digits
    Then Sees "Admin Saved" admin saved alert
    And User closed the page
    Examples:
      | Date Of Birth | Phone        |
      | 09/08/1990    | 123-456-8985 |