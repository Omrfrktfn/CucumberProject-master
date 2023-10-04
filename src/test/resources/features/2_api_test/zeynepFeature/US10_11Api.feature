Feature: Vice Dean should be able to create a lesson program
  Scenario: Vice Dean successfully creates a lesson program
    Given Prepare post request in order to add a lesson
    And Prepare the lesson information to be sent
    When Send post request to add a lesson
    Then Do assertion to verify the details of the lesson
    And Created lesson will be deleted from the lesson program list

