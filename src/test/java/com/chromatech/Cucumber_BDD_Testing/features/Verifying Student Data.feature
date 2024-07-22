Feature: Verifying Student Data Scenario

  @Progression @AG2CP-27 @ira
  Scenario: Verifying Student Data Scenario
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
    And if the record admission number "9911" exists user clicks on the checkbox
    And if the unique admission number exists clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    And clicks on Student Admission sub module
    And enters Unique Admission Number "9911"
    And enters Roll Number "1234"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "Helen"
    And enters last name "Johnson"
    And selects "Female" from gender drop down
    And selects "09/12/1999" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "emma.johnson@gmail.com"
    And selects "07/17/2024" for Admission Date Calendar Day
    And upload Student picture "\src\main\resources\file\Emma.png"
    And selects "B+" from Blood Group drop down
    And selects "07/17/2024" for As on Date Calendar Day
    And enters phone number "3476290614"
    And enters a height "5.4"
    And enters a weight "105"
    And enters father name "Carl Johnson"
    And enters father phone number "347-982-8725"
    And enters father occupation "Doctor"
    And upload Father picture "\src\main\resources\file\Carl.png"
    And enters mother name "Rebecca Johnson"
    And enters mother phone number "348-926-9265"
    And enters mother email "rebecca.johnson@gmail.com"
    And enters mother occupation "Nurse"
    And upload Mother picture "\src\main\resources\file\Helen.png"
    And selects Mother radio button for If guardian is field
    And enters guardian address "1067 Madison Ave, New York, NY 10028"
    And clicks on Add More details
    And clicks on the checkbox If Guardian Address is Current Address
    And enters Bank Account Number "08154-39779-98765"
    And enters Bank Name "Chase"
    And enters IFSC Code "#8467"
    And enters National Identification Number "572-836-373-986"
    And enters Local Identification Number "#7788-8876-9877635864"
    And clicks radio button "Yes"
    And enters Previous School Details "Springfield Elementary School. 123 Main Street, Springfield, USA 12345."
    And enters a Note "We were in this school for 5 years.During our time at Springfield Elementary, we were continually impressed by the school’s dedication to academic excellence and its nurturing community."
    And enters first Title of document "Document one", "Document two", "Document three", "Document three".
    And uploads file one to Documents "\src\main\resources\file\Doc One.docx"
    And uploads file two to Documents "\src\main\resources\file\Doc Two.docx"
    And uploads file three to Documents "\src\main\resources\file\Doc Three.docx"
    And uploads file four to Documents "\src\main\resources\file\Doc Four.docx"
    And saves submission
    Then the student is successfully admitted "Record Saved Successfully"
    And clicks on Student Details sub module
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And clicks on the Search button
    And sends unique number to Search By Keyword text box "9911"
    Then all student data submitted with the record should display "9911", "Helen Johnson", "SDET(Cucumber Fundamentals)", "Carl Johnson", "09/12/1999", "Female", "Selenium", "3476290614", "5.4", "105"