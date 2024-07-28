Feature:  Ability to disable and enable student records

  @Regression @AG2CP-15 @AG2CP-16 @anna
  Scenario:  Ability to disable and enable student records
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
    And if the record admission number "400" exists user clicks on the checkbox
    And if the unique admission number exists clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    And clicks on Student Admission sub module
    And enters Unique Admission Number "400"
    And enters Roll Number "12334"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Stanislav"
    And enters last name "Gomon"
    And selects "Male" from gender drop down
    And selects "09/12/1999" for Date of Birth Calendar
    And enters email "stan.gomon@gmail.com"
    And selects "07/21/2024" for Admission Date Calendar Day
    And selects "07/17/2024" for As on Date Calendar Day
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
    Then user clicks on the Student Details submodule
    And user enters unique admission number "400" in Search by Keyword text box
    And user clicks on the Search button
    And user clicks on show btn
    And user clicks on Disable button and accepting alert "Are you sure you want to disable this record."
    And selects "TestDisableReason" for Reason drop down
    And user clicks on Save button
    Then user clicks on Disabled Students sub module
    And user enters unique admission number "400" in Search by Keyword text box
    And user clicks on the Search button
    And user clicks on show btn
    And user clicks on Enable button and accepting alert "Are you sure? you want to enable this record"
    And user clicks on the Bulk Delete submodule
    And selects "SDET" for the class drop-down
    And selects "Cucumber Fundamentals" for the section drop-down
    And clicks on the Search button
    When the user is on the "https://mexil.it/chroma/student/bulkdelete" page
    And clicks on the checkbox with the unique admission number "400"
    And clicks the Delete button and accepting alert "Are you sure you want to delete this?"