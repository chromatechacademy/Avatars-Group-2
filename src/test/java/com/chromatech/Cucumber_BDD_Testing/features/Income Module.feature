Feature: Income Module Scenario

  @Regression @AG2CP-6 @olga
  Scenario: Income Module Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Income module
    Then the following submodules are displayed:"Add Income", "Search Income", "Income Head"