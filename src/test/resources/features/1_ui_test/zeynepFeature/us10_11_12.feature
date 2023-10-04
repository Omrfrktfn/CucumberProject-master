
Feature: US10-US11-US12 Vice Dean should be able to create lesson programme and make updates

  Background:User goes to the site and logs in as vise dean
  Scenario: TC01 Vice dean creates a lesson programme
    Given user goes to homepage of the site
    Then user logs in as vice dean
    And user waits for 2 seconds
    Then user clicks on lesson program
    And user waits for 2 seconds
    And user chooses a lesson from ddm
    And user chooses an education term from ddm
    And user chooses a day from the drop down menu
    Then user chooses start and stop time




  #Scenario: TC02 (US11) Vice Dean should be able to see the lesson programme and make updates and adjustments on it
    And user clicks on submit button to create the lesson
    And user waits for 2 seconds
    Then user checks if the created lesson is in the lesson program list
    And user waits for 2 seconds

  #Scenario: TC03 (US12)  Vice Dean should be able to assign lessons to teachers
    Then user goes to lesson program assignment list and check if the creates lesson is listed
    And user clicks on the lesson on the assignment list
    And user waits for 2 seconds
    Then user scrolls down the page and click to choose the teacher from choose the teacher section
    And user clicks on submit button and Lesson Added to Teacher message appears at the top of the page
    And user closes the driver


    
