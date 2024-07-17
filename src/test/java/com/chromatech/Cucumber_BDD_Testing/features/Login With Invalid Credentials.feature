Feature: User Logs In With Invalid Credentials Scenario

  @Smoke
  Scenario: User Log In Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "private@teacher.com" in username text box
    And enters password "654321" in the password text box
    And clicks on Sign In button
    Then user cannot Log in "Invalid Username or Password"