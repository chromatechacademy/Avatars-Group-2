Feature: Navigation Module

  @Regression @AG2CP-3 @yuriy
  Scenario: Display submodules on Fees Collection Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    Then the following modules are displayed
      | Student Information |
      | Fees Collection     |
      | Income              |
      | Expenses            |
      | Academics           |
      | Fees Type           |
      | Human Resource      |
      | Homework            |
      | Reports             |