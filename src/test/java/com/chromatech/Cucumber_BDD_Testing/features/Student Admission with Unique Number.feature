Feature: Student Admission with Unique Number Scenario

  @Regression @AG2CP-13 @bennett @Progression
  Scenario: Student Admission with Unique Number Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Student Information module
    And user clicks on the Bulk Delete submodule
    And selects "SDET" for the class drop-down
    And selects "Cucumber Fundamentals" for the section drop-down
    And clicks on the Search button
    When the user is on the "https://mexil.it/chroma/student/bulkdelete" page
    And if the record admission number "313" exists user clicks on the checkbox
    And if the unique admission number exists clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    And clicks on Student Admission sub module
    And enters Unique Admission Number "313"
    And enters Roll Number "32"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Drew"
    And enters last name "Peacock"
    And selects "Male" from gender drop down
    And selects "09/12/1976" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "Drew.Peacock.com"
    And selects "10/17/2024" for Admission Date Calendar Day
    And selects "O-" from Blood Group drop down
    And selects "07/17/2024" for As on Date Calendar Day
    And enters a height "6'4"
    And enters a weight "205"
    And enters father name "Joseph"
    And enters father phone number "518-965-5590"
    And enters father occupation "General"
    And enters mother name "Ann"
    And enters mother phone number "518-874-9280"
    And enters mother email "ann.peacock@gmail.com"
    And enters mother occupation "Teacher"
    And selects Mother radio button for If guardian is field
    And enters guardian address "1017 Graham Ave, New York, NY 10021"
    And saves submission
    Then the student is successfully admitted "Record Saved Successfully"
    And enters Unique Admission Number "313"
    And enters Roll Number "444"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Ben"
    And enters last name "Tenison"
    And selects "Male" from gender drop down
    And selects "09/12/1995" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "him.horton@gmail.com"
    And selects "07/17/2024" for Admission Date Calendar Day
    And selects "B+" from Blood Group drop down
    And selects "07/17/2024" for As on Date Calendar Day
    And enters a height "7'4"
    And enters a weight "280"
    And enters father name "Carl"
    And enters father phone number "347-982-8725"
    And enters father occupation "Doctor"
    And enters mother name "Rebecca"
    And enters mother phone number "348-926-9265"
    And enters mother email "rebecca.johnson@gmail.com"
    And enters mother occupation "Nurse"
    And selects Mother radio button for If guardian is field
    And enters guardian address "1067 Madison Ave, New York, NY 10028"
    And saves submission
    Then the user is given the message "The Admission No field must contain a unique value."
    And user clicks on the Bulk Delete submodule
    And selects "SDET" for the class drop-down
    And selects "Cucumber Fundamentals" for the section drop-down
    And clicks on the Search button
    When the user is on the "https://mexil.it/chroma/student/bulkdelete" page
    And clicks on the checkbox with the unique admission number "313"
    And clicks the Delete button and accepting alert "Are you sure you want to delete this?"