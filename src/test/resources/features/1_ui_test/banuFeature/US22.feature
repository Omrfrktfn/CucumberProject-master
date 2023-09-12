@all1 @all
Feature: US22 Admin Added Test

  Background: US22 all steps
    Given user "baseUrl" goes to the home page
    And User clicks the Login section
    And User enters given infos and login
      | email          | password      |
      | Team12Admin    | Team12Admin   |
    And Sees "Add Admin" title

@a1
  Scenario Outline: TC01 Admin Added Positive Scenario
    And User enters the required infos and add "<Date Of Birth>", "<Phone>"
    And User enters total Ssn number first 3 digit and 2 digit and add 4 digits with a '-' sign after the third and fifth digits
    Then Sees "Admin Saved" admin saved alert
    And User closed the page
    Examples:
      | Date Of Birth | Phone        |
      | 09/08/1990    | 123-456-8985 |

@a2
  Scenario: TC02 Admin Added Negative Scenario
    And User selects the Gender
    And Sees "Required" under Name section
    And Sees "Required" under Surname section
    And Sees "Required" under Birth Place section
    And Sees "Required" under Date Of Birth section
    And Sees "Required" under Phone section
    And Sees "Required" under Ssn section
    And Sees "Required" under User Name section
    And Sees "Enter your password" under Password section
    And User closed the page

@a3
  Scenario Outline: TC03 Admin Added Negative Scenario for Ssn
    And User enters the required infos and add "<Date Of Birth>", "<Phone>"
    And User enters total Ssn number first 3 digit and 2 digit and add 3 digits with a '-' sign after the third and fifth digits
    Then Sees the "Minimum 11 character" Alert under Ssn section
    And User clear the Ssn section
    Then User enters Ssn number first 3 digit and 2 digit and add 4 digits with a ' ' gap after the third and fifth digits
    Then Sees "Please enter valid SSN number" Please enter valid SSN alert
    And User closed the page
    Examples:
       | Date Of Birth | Phone        |
       | 06/04/2000    | 675-465-4563 |


@a4
  Scenario Outline: TC04 Admin Added Negative Scenario for Ssn
    And User enters the required infos and add "<Date Of Birth>", "<Phone>"
    And User enters total Ssn number first 3 digit and 2 digit and add 3 digits plus one letter with a '-' sign after the third and fifth digits
    Then Sees "Please enter valid SSN number" Please enter valid SSN alert
    And User closed the page
    Examples:
      | Date Of Birth | Phone        |
      | 06/04/2000    | 675-465-4563 |


  @a5
  Scenario Outline: TC05 Admin Added Negative Scenario for Gender
    And User enters the required info with "<Date Of Birth>" except gender
    And User enters total Ssn number first 3 digit and 2 digit and add 4 digits plus one letter with a '-' sign after the third and fifth digits
    Then Not see "Admin Saved" alert
    And User closed the page
    Examples:
      | Date Of Birth |
      | 09/08/1990    |

