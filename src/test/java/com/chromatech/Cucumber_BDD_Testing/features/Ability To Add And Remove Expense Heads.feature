Feature: Ability To Add And Remove Expense Heads

  @Progression @AG2CP-26 @bennett
  Scenario: Ability To Add And Remove Expense Heads
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Expenses module
    And clicks on the Expense Head module
    And adds "Software" to the Expense Head text box
    And adds "Selenium" to the Description text box
    And clicks the Save button
    Then the Expense Head is successfully admitted "Record Saved Successfully"
    Then the user deletes the Expense Head "Software"
    And accepts alert "Delete Confirm?"