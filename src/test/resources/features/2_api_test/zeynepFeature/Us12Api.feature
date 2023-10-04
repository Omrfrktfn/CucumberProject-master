Feature: Vice dean assigns a lesson to teacher
  Scenario: New Vice dean successfully assigns a teacher to a lesson
    Given NEw prepare post request in order to add lesson to a teacher
    And NEW prepare lesson information to be sent to the teacher
    When New send the post request to add the lesson to the teacher
    Then New do assertions to verify lesson has assigned to the teacher