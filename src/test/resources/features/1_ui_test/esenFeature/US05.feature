@esen
Feature: US005 Dean Management

  Background:Navigate to Dean Management Menu
    Given user goes to Management on Schools homepage
    Then Click on Login button
    And Enter your Username,Password and login
    And waits for 2 seconds
    And clicks on Menu
    And clicks on Dean Management
    And waits for 2 seconds

  Scenario: TC001 Admin can see details of deans

    And verifies that "name section" is seen
    And verifies that "gender section" is seen
    And verifies that "phone number section" is seen
    And verifies that "SSN section" is seen
    And verifies that "username section" is seen
    And closes the page

  Scenario: TC002 Admin can update deans data
    And clicks on edit button
    And changes name,surname,birthplace,gender,date of birth,phone number,SSN,username,password fields
    And clicks on Submit button for edition
    Then verifies "Dean updated Successful" text is seen
    And closes the page
