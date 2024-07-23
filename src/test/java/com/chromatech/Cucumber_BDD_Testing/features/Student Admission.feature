Feature: Student Admission Scenario

  @Smoke @AG2CP-12 @ira
  Scenario: Student Admission Scenario
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
    And if the record admission number "007" exists user clicks on the checkbox
    And if the unique admission number exists clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    And clicks on Student Admission sub module
    And enters Unique Admission Number "007"
    And enters Roll Number "1233"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Emma"
    And enters last name "Johnson"
    And selects "Female" from gender drop down
    And selects "09/12/1999" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "emma.johnson@gmail.com"
    And selects "07/17/2024" for Admission Date Calendar Day
    And selects "B+" from Blood Group drop down
    And selects "07/17/2024" for As on Date Calendar Day
    And enters a height "5'4"
    And enters a weight "105"
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
    Then the student is successfully admitted "Record Saved Successfully"
    And user clicks on the Bulk Delete submodule
    And selects "SDET" for the class drop-down
    And selects "Cucumber Fundamentals" for the section drop-down
    And clicks on the Search button
    When the user is on the "https://mexil.it/chroma/student/bulkdelete" page
    And clicks on the checkbox with the unique admission number "007"
    And clicks the Delete button and accepting alert "Are you sure you want to delete this?"