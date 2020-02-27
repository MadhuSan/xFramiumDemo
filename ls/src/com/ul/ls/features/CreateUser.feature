Feature: Create user

@functionaltest
  Scenario: Create a new user with all mandatory fields.
    Given User login to LS application
    And Navigate to administrator tools
    And Navigate to maintain people and security
    And Clickon add and select new user
    And enter mandatory fields for each page and click on next
    Then validate user created successfully message displayed
    Then click on Finish button
    Then search for the user created
