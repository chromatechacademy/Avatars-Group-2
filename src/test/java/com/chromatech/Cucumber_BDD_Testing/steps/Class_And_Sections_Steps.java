package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Class_And_Sections_Steps extends PageInitializer {

    @When("user clicks on Class submodule")
    public void user_clicks_on_class_submodule() {
        StepsImplementation.user_clicks_on_class_submodule();
    }

    @When("adds a class {string}")
    public void adds_a_class(String cyberSecurityClassText) {
        StepsImplementation.adds_a_class(cyberSecurityClassText);
    }

    @When("clicks on Networking Fundamentals, Linux Fundamentals, CIA Triad, Penetration TestingEthical Hacking")
    public void clicks_on_networking_fundamentals_linux_fundamentals_cia_triad_penetration_testing_ethical_hacking() {
        StepsImplementation.clicks_on_networking_fundamentals_linux_fundamentals_cia_triad_penetration_testing_ethical_hacking();
    }

    @When("clicks on a Save button")
    public void clicks_on_a_save_button() {
        StepsImplementation.clicks_on_a_save_button();
    }

    @Then("the class is successfully saved {string}")
    public void the_class_is_successfully_saved(String expectedAlertSaveText) {
        StepsImplementation.the_class_is_successfully_saved(expectedAlertSaveText);
    }

    @Then("clicks on Testing Fundamentals, SDLC Methodologies, Selenium Test Automation, Cucumber Fundamentals, API Testing, Git GitHub, Java for Cool People, Mobile Test Automation, Accessibility Testing, Database Testing")
    public void clicks_on_testing_fundamentals_sdlc_methodologies_selenium_test_automation_cucumber_fundamentals_api_testing_git_git_hub_java_for_cool_people_mobile_test_automation_accessibility_testing_database_testing() {
        StepsImplementation.clicks_on_testing_fundamentals_sdlc_methodologies_selenium_test_automation_cucumber_fundamentals_api_testing_git_git_hub_java_for_cool_people_mobile_test_automation_accessibility_testing_database_testing();
    }

    @Then("the following sections for class SDET is displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_sections_for_class_sdet_is_displayed(String expectedDatabaseTestingText, String expectedTestingFundamentalsText, String expectedSDLCMethodologiesText, String expectedSeleniumTestAutomationText, String expectedCucumberFundamentalsText, String expectedAPITestingText, String expectedGitGitHubText, String expectedJavaForCoolPeopleText, String expectedMobileTestAutomationText, String expectedAccessibilityTestingText) {
        StepsImplementation.the_following_sections_for_class_sdet_is_displayed(expectedDatabaseTestingText, expectedTestingFundamentalsText, expectedSDLCMethodologiesText, expectedSeleniumTestAutomationText, expectedCucumberFundamentalsText, expectedAPITestingText, expectedGitGitHubText, expectedJavaForCoolPeopleText, expectedMobileTestAutomationText, expectedAccessibilityTestingText);
    }

    @Then("the following sections for class Cyber Security is displayed {string}, {string}, {string}, {string}")
    public void the_following_sections_for_class_cyber_security_is_displayed(String expectedPenetrationTestingEthicalHackingText, String expectedNetworkingFundamentalsText, String expectedLinuxFundamentalsText, String expectedCiaTriadText) {
        StepsImplementation.the_following_sections_for_class_cyber_security_is_displayed(expectedPenetrationTestingEthicalHackingText, expectedNetworkingFundamentalsText, expectedLinuxFundamentalsText, expectedCiaTriadText);
    }

    @Then("deletes the {string} class")
    public void deletes_the_class(String sdetClassText) {
        StepsImplementation.deletes_the_class(sdetClassText);
    }

    @Then("accepting Alert {string}")
    public void accepting_alert(String expectedAlertText) {
        StepsImplementation.accepting_alert(expectedAlertText);
    }

    @Then("deletes class the {string}")
    public void deletes_class_the(String cyberClassText) {
        StepsImplementation.deletes_class_the(cyberClassText);
    }

    @When("if the class {string} exists user clicks on the delete button and accepting alert")
    public void if_the_class_exists_user_clicks_on_the_delete_button_and_accepting_alert(String cyberSecurityText) {
        StepsImplementation.if_the_class_exists_user_clicks_on_the_delete_button_and_accepting_alert(cyberSecurityText);
    }

    @When("if the class {string} is exists user clicks on the delete button and accepting alert")
    public void if_the_class_is_exists_user_clicks_on_the_delete_button_and_accepting_alert(String sdetSecurityText) {
        StepsImplementation.if_the_class_is_exists_user_clicks_on_the_delete_button_and_accepting_alert(sdetSecurityText);
    }
}