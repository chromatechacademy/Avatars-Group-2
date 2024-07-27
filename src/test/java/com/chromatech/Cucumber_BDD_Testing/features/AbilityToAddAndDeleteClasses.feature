Feature: Adding and Deleting Classes Scenario

  @Regression @AG2CP-18 @Divyadivya11
  Scenario: Adding and Deleting Classes Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Academics module
    And clicks on Class sub module
    And delete the Class "Selenium Group 2" if already existed
    And enters "Selenium Group 2" on Class text box
    And clicks on "Selenium Test Automation" check box
    And clicks save
    Then record is saved "Record Saved Successfully"
    When user clicks on the delete button for the saved class "Selenium Group 2" and accepts alert the record is deleted
