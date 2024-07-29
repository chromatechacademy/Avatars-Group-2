Feature: Fees Collection Module

  @Regression @AG2CP-5 @yuriy @Progression
  Scenario: Display submodules on Fees Collection Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on Fees Collection module
    Then the following submodules displays
      | Collect Fees        |
      | Search Fees Payment |
      | Search Due Fees     |
      | Fees Master         |
      | Fees Group          |
      | Fees Type           |
      | Fees Discount       |
      | Fees Carry Forward  |
      | Fees Reminder       |