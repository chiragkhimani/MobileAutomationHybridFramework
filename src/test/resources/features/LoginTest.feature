Feature: Test Login Functionality

  Scenario: Verify user can login with valid credentials
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen

  Scenario: Verify user can logout
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    When user click on home burger menu
    And click on logout link
    Then verify user is on login screen

  Scenario: Verify user see error for the locked our user
    Given user open application
    Then verify user is on login screen
    When user login with username "locked_out_user" and password "secret_sauce"
    Then verify locked out user error message is displayed
      | Sorry, this user has been locked out. |


