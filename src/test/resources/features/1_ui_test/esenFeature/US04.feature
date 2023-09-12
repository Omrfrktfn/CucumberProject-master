@US04
Feature: US004 Admin Can Add a Dean

  Background:Navigate to Dean Management Menu
    Given user goes to Management on Schools homepage
    Then user clicks on login button and logins as admin
    And waits for 2 seconds
    And clicks on Menu
    And clicks on Dean Management
    And waits for 2 seconds

  Scenario: TC001 Admin can add a dean
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC002 Admin can't add a Dean with blank “first name”field
    And doesn't enter name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC003 Admin can't add a Dean with blank “surname” field
    Then enters name
    And doesn't enter surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC004 Admin can't add a Dean with blank “birth place”field
    Then enters name
    And enters surname
    And doesn't enter birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC005 Admin can't add a Dean without selecting gender
    Then enters name
    And enters surname
    And enters birth place
    And doesn't select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC006 Admin can't add a Dean with blank “date of birth” field
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And doesn't enter date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page


  Scenario: TC007 Admin can't add a Dean with blank “phone number” field
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And doesn't enter phone number
    And enters SSN Number "valid"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC008 Admin can't add a Dean with blank “SSN number” field
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And doesn't enter SSN Number
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC009 Admin can't add a Dean with blank “username” field
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And doesn't enter username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC010 Admin can't add a Dean with blank “password” field
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And doesn't enter password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page


  Scenario: TC011 Admin can't add a Dean with inappropriate password
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "valid"
    And enters a username
    And enters password with "lowercase and numbers"
    And waits for 1 seconds
    And verifies "One uppercase character" password warning is seen
    And enters password with "uppercase and numbers"
    And waits for 1 seconds
    And verifies "One lowercase character" password warning is seen
    And enters password with "lowercase and uppercase"
    And waits for 1 seconds
    And verifies "One number" password warning is seen
    And enters password with "less than 8 characters"
    And waits for 1 seconds
    And verifies "At least 8 characters" password warning is seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC012 Admin can't add a Dean with inappropriate SSN
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "without - after 3rd digit"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Please enter valid SSN number" text is seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC013 Admin can't add a Dean with inappropriate SSN
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "without - after 5th digit"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Please enter valid SSN number" text is seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC014 Admin can't add a Dean with inappropriate SSN
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "more than 9 characters"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Please enter valid SSN number" text is seen
    And waits for 2 seconds
    And closes the page

  Scenario: TC015 Admin can't add a Dean with inappropriate SSN
    Then enters name
    And enters surname
    And enters birth place
    And select gender
    And enters date of birth
    And enters phone number
    And enters SSN Number "less than 9 characters"
    And enters a username
    And enters suitable password
    And user clicks on submit button to add
    And verifies "Dean Saved" text is not seen
    And waits for 2 seconds
    And closes the page




