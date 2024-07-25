Feature: Ability to add and delete sections Scenario

  @Regression @AG2CP-17 @ira
  Scenario: Ability to add and delete sections Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Academics module
    And user clicks on Sections submodule
    And if the section "New Section Test" exists user clicks on the delete button and accepting alert
    And adds a section "New Section Test"
    And clicks on the Save button
    Then section is successfully saved "Record Saved Successfully"
    And user is deleting the section "New Section Test"
    And accepting alert "Delete Confirm?"