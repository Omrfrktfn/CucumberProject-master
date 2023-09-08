@all2 @all
Feature: US24 Admin Teacher oluşturabilmeli
  Background: Ana Sayfaya Gider
    Given kullanici "baseUrl" sayfasina gider
    And User clicks the Login section
    And User enters given infos and login
      | email          | password      |
      | Team12Admin    | Team12Admin   |
    And Sees "Hi", "Team12Admin"
    And User click the menu and select Teacher Management in the menu
    And Sees "Add Teacher" header


  @s1
  Scenario Outline: TC01 Admin Teacher oluşturabilmeli Positive Scenario
    And User selects the choosen lessons and enters the "<Date Of Birth>" and given infos
    Then see the box of Is Advisor Teacher is able to click.
    And Seen Teacher saved alert
    And User closed the page
    Examples:
      | Date Of Birth |
      | 18/04/2000    |

  @s2
  Scenario Outline: TC02 Admin Teacher oluşturabilmeli Negative Scenario
    And User not select the choosen lessons and enters the "<Date Of Birth>" and given infos and submit
    And Sees Error:Lesson Programs not found alert
    And User closed the page
    Examples:
      | Date Of Birth |
      | 09/08/1990    |


  @s3
  Scenario: TC03 Admin Teacher oluşturabilmeli Negative Scenario for all except the choosen Lessons section
    And User selects the choosen lessons
    And Sees "Required" under Name section
    And Sees "Required" under Surname section
    And Sees "Required" under Birth Place section
    And Sees "Required" under Email section
    And Sees "Required" under Phone section
    And Sees "Required" under Date Of Birth section
    And Sees "Required" under Ssn section
    And Sees "Required" under User Name section
    And Sees "Enter your password" under Password section
    And User closed the page


  @s4
  Scenario Outline: TC04 Admin Teacher oluşturabilmeli Negative Scenario for Ssn
    And User selects the choosen lessons
    And User enters required info until the "<Date Of Birth>"
    And Enter 3, 2 and 3 total eight digits with a '-' sign after the third and fifth digits
    Then Sees the "Minimum 11 character (XXX-XX-XXXX)" Alert under Ssn section
    And User clear the Ssn section
    Then User enters Ssn number first 3 digit and 2 digit and add 4 digits with a ' ' gap after the third and fifth digits
    And User enters User Name, Password and submit
    Then Sees "Please enter valid SSN number" Please enter valid SSN alert
    And User closed the page
    Examples:
      | Date Of Birth |
      | 09/08/1990    |


  @s5
 Scenario Outline: TC05 Admin Teacher oluşturabilmeli Negative Scenario for Ssn and Password
    And User selects the choosen lessons and enters the "<Date Of Birth>" and given infos except password
    And User enters the "<Password1>" At least eight charakter and must contain uppercase letters, lowercase letters
    Then Sees "One number" One number alert
    And User clear the Password box
    And User enters the "<Password2>" At least eight charakter and must contain uppercase letters and numbers
    Then Sees "One lowercase character" One lowercase character alert
    And User clear the Password box
    And User enters the "<Password3>" At least eight charakter and must contain lowercase letters and numbers
    Then Sees "One uppercase character" One uppercase character alert
    And User clear the Password box
    And User enters the "<Password>" At least eight charakter and must contain uppercase letters, lowercase letters and numbers and submit
    And Seen Teacher saved alert
    And User closed the page
    Examples:
       | Date Of Birth  | Password  | Password1 | Password2 | Password3 |
       | 09/08/1990     | Jmarker90 | Jmarkerss | JMARKER90 | jmarker90 |






