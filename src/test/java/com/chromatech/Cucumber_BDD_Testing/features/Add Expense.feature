Feature: Adding Expenses Scenario

  @Regression @AG2CP-28 @olga
  Scenario: Adding Expenses Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Expenses module
    And clicks on Add Expense sub module
    And selects "Hello" for expense head drop down
    And enters name "Mary"
    And enters invoice number "54321"
    And selects "07/01/2024" for Date Calendar Day
    And enters amount "$1500.00"
    And attach file
    And enters description "Tuition payment"
    And user saves application
    Then the expense displays as expected "Hello", "Mary", "54321", "07/01/2024", "$1500.00", "Tuition payment"
#    And the expense can then be removed
