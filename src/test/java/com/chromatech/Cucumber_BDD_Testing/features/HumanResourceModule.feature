Feature: Human Resource module

# @Regression @AG2CP-9 @sasha
  Scenario: Human Resource Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the Human Resource module
    Then the following submodules are displayed: "Staff Directory", "Staff Attendance", "Payroll", "Approve Leave Request", "Apply Leave", "Leave Type", "Teachers Rating", "Department", "Designation"