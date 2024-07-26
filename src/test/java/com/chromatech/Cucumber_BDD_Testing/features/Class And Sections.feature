Feature: Class and Sections Scenario

  @Progression @AG2CP-11 @ira
  Scenario: Class and Sections Scenario
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login/"
    When the user enters username "general@teacher.com" in username text box
    And enters password "123456" in the password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user clicks on Academics module
    And user clicks on Class submodule
    And adds a class "Cyber Security"
    And clicks on Networking Fundamentals, Linux Fundamentals, CIA Triad, Penetration TestingEthical Hacking
    And clicks on a Save button
    Then the class is successfully saved "Record Saved Successfully"
    And adds a class "SDET"
    And clicks on Testing Fundamentals, SDLC Methodologies, Selenium Test Automation, Cucumber Fundamentals, API Testing, Git GitHub, Java for Cool People, Mobile Test Automation, Accessibility Testing, Database Testing
    And clicks on a Save button
    Then the class is successfully saved "Record Saved Successfully"
    Then the following sections for class SDET is displayed "Database Testing", "Testing Fundamentals", "SDLC Methodologies", "Selenium Test Automation", "Cucumber Fundamentals", "API Testing", "Git/GitHub", "Java 11 for Cool People", "Mobile Test Automation", "Accessibility Testing"
    Then the following sections for class Cyber Security is displayed "Networking Fundamentals", "Linux Fundamentals", "CIA Triad", "Penetration Testing/Ethical Hacking"
