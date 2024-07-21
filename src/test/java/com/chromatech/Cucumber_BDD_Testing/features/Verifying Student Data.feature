Feature: Verifying Student Data Scenario

  @Regression @AG2CP-27 @ira
  Scenario: Verifying Student Data Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Student Information module
    And clicks on Student Admission sub module
    And enters Unique Admission Number "911"
    And enters Roll Number "1233"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Helen"
    And enters last name "Johnson"
    And selects "Female" from gender drop down
    And selects "09/12/1999" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "emma.johnson@gmail.com"
    And selects "07/17/2024" for Admission Date Calendar Day
    And selects "B+" from Blood Group drop down
    And selects "07/17/2024" for As on Date Calendar Day
    And enters phone number "347-629-0614"
    And enters a height "5'4"
    And enters a weight "105"
    And enters father name "Carl Johnson"
    And enters father phone number "347-982-8725"
    And enters father occupation "Doctor"
    And enters mother name "Rebecca Johnson"
    And enters mother phone number "348-926-9265"
    And enters mother email "rebecca.johnson@gmail.com"
    And enters mother occupation "Nurse"
    And selects Mother radio button for If guardian is field
    And enters guardian address "1067 Madison Ave, New York, NY 10028"
















#    And saves submission
#    Then the student is successfully admitted "Record Saved Successfully"
#    And clicks on Student Details sub module
#    And selects "SDET" for class drop down
#    And selects "Cucumber Fundamentals" for section drop down
#    And clicks on the Search button
#    Then all student data submitted with the record should display "911", "Helen Johnson", "SDET(Cucumber Fundamentals)", "Carl", "09/12/1999", "Female", "Selenium", "5'4", "105"