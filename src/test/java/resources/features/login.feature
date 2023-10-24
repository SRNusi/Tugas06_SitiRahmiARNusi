Feature: Login Page Sauce Demo

@OnlyOneTime
  Scenario: Successful login
    Given Login page of Saucedemo
    When User input valid username
    And Input valid password
    And Click login button
    Then User can login successfully

  Scenario: Unsuccessful login
    Given Login page of Saucedemo
    When User input valid username
    And Input invalid password
    And Click login button
    Then User get error message





