Feature:  User Logs In Scenario

  @Smoke
  Scenario: User Log in Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "" in username text box

