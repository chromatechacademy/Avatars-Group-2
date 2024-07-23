Feature: User Logs In Scenario

 @Smoke @AG2CP-1 @bennett
  Scenario: Valid Credentials Login Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"

 @Smoke @AG2CP-2 @yuriy
  Scenario: Invalid Credentials Login Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123667" in the password text box
    And clicks on Sign In button
    Then user cannot Log in "Invalid Username or Password"

