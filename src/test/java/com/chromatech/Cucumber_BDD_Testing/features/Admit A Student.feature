Feature: Admit A Student With A Unique Admission Number Scenario

  @Regression
  Scenario: Admit A Student With A Unique Admission Number
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Student Information module
    And clicks on Student Admission sub module
    And enters Unique Admission Number "007"
    And enters Roll Number "123"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Emma"
    And enters last name "Johnson"
    And selects "Female" from gender drop down
    And selects "09/12/1999" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "emma.johnson@gmail.com"
    And selects "07/17/2024" for Admission Date Calendar Day








#    And enters father name "<Father Name>"
#    And selects Father radio button for If guardian is field
#    And enters guardian phone number "<Guardian Phone Number>"
#    And saves submission
#    Then test account is reset with admission number "<Admission Number>", class "SDET", section "Cucumber Fundamentals"





#    Given a CTSMS user is logged in to the Student Admission page
#    When the user fills out all required fields with a unique admission number
#    Then the student is successfully admitted