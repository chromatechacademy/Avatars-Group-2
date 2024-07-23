Feature: Student Information Module

  @Regression @AG2CP-4 @Divyadivya11
  Scenario: Display submodules on Student Information Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the Student Information module
    Then the following submodules display:
      | Student Details    |
      | Student Admission  |
      | Disabled Students  |
      | Bulk Delete        |
      | Student Categories |
      | Student House      |
      | Disable Reason     |
