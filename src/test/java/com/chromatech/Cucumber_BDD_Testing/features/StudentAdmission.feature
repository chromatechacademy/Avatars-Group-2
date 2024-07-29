Feature: Student Admission Scenario

  @Regression @AG2CP-12 @ira
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

  @Regression @AG2CP-19 @yuriy
  Scenario Outline: Admitting Multiple Students Scenario
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
    And if the record admission number "<Unique Number>" exists user clicks on the checkbox
    And if the unique admission number exists clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    And clicks on Student Admission sub module
    And enters Unique Admission Number "<Unique Number>"
    And enters Roll Number "<Unique Roll Number>"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "<First Name>"
    And enters last name "<Last Name>"
    And selects "<Gender>" from gender drop down
    And selects "<Date Of Birth>" for Date of Birth Calendar
    And selects "Selenium" from category drop down
    And enters email "<Student Email>"
    And selects "<Admission Date>" for Admission Date Calendar Day
    And selects "<Blood Type>" from Blood Group drop down
    And selects "<Date Calendar>" for As on Date Calendar Day
    And enters a height "<Height>"
    And enters a weight "<Weight>"
    And enters father name "<Father's Name>"
    And enters father phone number "<Father's Phone Number>"
    And enters father occupation "<Father's Occupation>"
    And enters mother name "<Mother's Name>"
    And enters mother phone number "<Mother's Phone Number>"
    And enters mother email "<Mother's Email>"
    And enters mother occupation "<Mother's Occupation>"
    And selects Mother radio button for If guardian is field
    And enters guardian address "<Mother's Address>"
    And saves submission
    Then the student is successfully admitted "Record Saved Successfully"
    And user clicks on the Bulk Delete submodule
    And selects "SDET" for the class drop-down
    And selects "Cucumber Fundamentals" for the section drop-down
    And clicks on the Search button
    When the user is on the "https://mexil.it/chroma/student/bulkdelete" page
    And clicks on the checkbox with the unique admission number "<Unique Number>"
    And clicks the Delete button and accepting alert "Are you sure you want to delete this?"
    Examples:
      | Unique Number | Unique Roll Number | First Name | Last Name | Gender | Date Of Birth | Student Email            | Admission Date | Blood Type | Date Calendar | Height | Weight | Father's Name | Father's Phone Number | Father's Occupation | Mother's Name | Mother's Phone Number | Mother's Email           | Mother's Occupation | Mother's Address                   |
      | 00001         | 987                | Olivia     | Smith     | Female | 01/07/1999    | olivia.smith@gmail.com   | 01/17/2021     | A+         | 01/17/2021    | 5'9    | 150    | Steve         | 337-453-0974          | Doctor              | Grace         | 347-875-8642          | grace.smith@gmail.com    | Lawyer              | 340 Maple Street, Springfield, IL  |
      | 0002          | 765                | Mason      | Martinez  | Male   | 04/03/2002    | mason.martinez@gmail.com | 09/23/2024     | O-         | 09/23/2024    | 6'6    | 120    | Chris         | 360-765-9756          | Teacher             | Chloe         | 336-864-9753          | chloe.martinez@gmail.com | Police Officer      | 459 Oak Avenue, Denver, CO 80203   |
      | 0003          | 432                | Harper     | Davis     | Female | 09/12/1988    | harper.davis@gmail.com   | 12/29/2023     | B-         | 12/29/2023    | 5'4    | 130    | Michael       | 347-862-0516          | Plumber             | Lily          | 347-824-0268          | lily.davis@gmail.com     | Nurse               | 915 Pine  Road, Austin, TX 78701   |
      | 0004          | 545                | Jenny      | Brown     | Female | 10/10/1998    | jenny.brown@gmail.com    | 04/04/2014     | AB+        | 11/10/2020    | 5'5    | 110    | Nick          | 656-834-2332          | Manager             | Kate          | 676-348-2543          | kate.1332@gmail.com      | Salesman            | 344 Myrtle Ave, New York, NY 11385 |
      | 0005          | 131                | Bobby      | Kale      | Male   | 08/11/1977    | bobby.kale@yahoo.com     | 08/10/2023     | A-         | 06/01/2018    | 6'3    | 160    | Daniel        | 744-545-1290          | Driver              | Sarah         | 454-812-0972          | sarahBright@aol.com      | Teacher             | 18 First Street, Monsey NY 16110   |
      | 0006          | 365                | Mike       | Goldberg  | Male   | 02/02/1964    | mikeGoldberg@post.net    | 11/03/2024     | A+         | 07/10/2020    | 6'11   | 170    | Martin        | 767-212-5609          | Dentist             | Rachel        | 444-512-3487          | rachel1977@gmail.com     | Carpenter           | 643 Trump Ave, Charlotte, NC       |
      | 0007          | 254                | Amelia     | Brooks    | Female | 04/22/2003    | amelia.brooks@gmail.com  | 07/21/2018     | AB-        | 02/01/2018    | 5'6    | 135    | Henry         | 219-494-0398          | Engineer            | Elizabeth     | 229-492-4486          | liz.brooks@gmail.com     | Novelist            | 173 Rose Court, Nashville, TN      |
      | 0008          | 349                | James      | Anderson  | Male   | 03/11/1997    | james.anderson@yahoo.com | 08/08/2017     | O+         | 03/12/2019    | 5'11   | 185    | Thomas        | 429-485-3938          | Photographer        | Diana         | 179-302-3498          | diana.cook@gmail.com     | Bookkeeper          | 541 Lake Drive, Seattle, WA        |
      | 0010          | 528                | William    | Evans     | Male   | 09/04/1992    | william.evans@aol.com    | 02/24/2015     | A-         | 06/23/2016    | 6'2    | 190    | Daniel        | 579-123-6578          | Electrician         | Nicole        | 249-816-3264          | nicole.evans@yahoo.com   | Real Estate Agent   | 915 Elm Street, Las Vegas, NV      |
      | 0011          | 028                | Chris      | Bernie    | Male   | 10/08/1977    | chris.bernie@aol.com     | 11/20/2014     | B+         | 02/18/2021    | 5'5    | 146    | Keith         | 766-923-7454          | Mechanic            | Rebecca       | 744-154-7002          | rebecca.ber@yahoo.com    | Astronaut           | 1 King's Plaza, Albany, NY         |