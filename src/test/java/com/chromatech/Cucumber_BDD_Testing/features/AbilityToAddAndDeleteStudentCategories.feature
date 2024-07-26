Feature: Ability To Add And Delete Student Categories

  @Regression @AG2CP-20 @sasha
  Scenario: Ability To Add And Delete Student Categories
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When a CTSMS user navigates to the Student Information module
    And navigates to the Student Categories submodule
    When adding and saving a new Student Category "Oleksandra"
    Then the Student Category is saved "Record Saved Successfully"
    And the user is also able to delete the Student Category and accepting alert  "Delete Confirm?"