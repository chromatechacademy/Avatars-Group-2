package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.ClassAndSectionsPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Class_And_Sections_Steps {

    ClassAndSectionsPage classAndSectionsPage = new ClassAndSectionsPage();

    @When("user clicks on Class submodule")
    public void user_clicks_on_class_submodule() {
        CommonMethods.click(classAndSectionsPage.classSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("adds a class {string}")
    public void adds_a_class(String cyberSecurityClassText) {
        CommonMethods.sendKeys(classAndSectionsPage.cyberSecurityClass, cyberSecurityClassText);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Networking Fundamentals, Linux Fundamentals, CIA Triad, Penetration TestingEthical Hacking")
    public void clicks_on_networking_fundamentals_linux_fundamentals_cia_triad_penetration_testing_ethical_hacking() {
        ArrayList<WebElement> checkboxes = new ArrayList<>();
        checkboxes.add(classAndSectionsPage.networkingFundamentalsCheckbox);
        checkboxes.add(classAndSectionsPage.linuxFundamentalsCheckbox);
        checkboxes.add(classAndSectionsPage.ciaTriadCheckbox);
        checkboxes.add(classAndSectionsPage.penetrationTestingEthicalHackingCheckbox);
        for (WebElement checkbox : checkboxes) {
            CommonMethods.click(checkbox);
        }
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on a Save button")
    public void clicks_on_a_save_button() {
        CommonMethods.click(classAndSectionsPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the class is successfully saved {string}")
    public void the_class_is_successfully_saved(String expectedAlertSaveText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(classAndSectionsPage.actualAlertSaveText.getText(), expectedAlertSaveText);
    }

    @Then("clicks on Testing Fundamentals, SDLC Methodologies, Selenium Test Automation, Cucumber Fundamentals, API Testing, Git GitHub, Java for Cool People, Mobile Test Automation, Accessibility Testing, Database Testing")
    public void clicks_on_testing_fundamentals_sdlc_methodologies_selenium_test_automation_cucumber_fundamentals_api_testing_git_git_hub_java_for_cool_people_mobile_test_automation_accessibility_testing_database_testing() {
        ArrayList<WebElement> checkBoxes = new ArrayList<>();
        for(int i = 3; i<= 12; i++){
            List<WebElement> checkbox = driver.findElements(By.xpath("((//*[contains(text(),'Sections')])[2]/following-sibling::div/label/input)[" + i + "]"));
            checkBoxes.addAll(checkbox);
        }
        for (WebElement cb : checkBoxes) {
            CommonMethods.click(cb);
        }
        CucumberLogUtils.logScreenShot();
    }

//    @Then("the following sections for class SDET is displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
//    public void the_following_sections_for_class_sdet_is_displayed(String expectedDatabaseTestingText, String expectedTestingFundamentalsText, String expectedSDLCMethodologiesText, String expectedSeleniumTestAutomationText, String expectedCucumberFundamentalsText, String expectedAPITestingText, String expectedGitGitHubText, String expectedJavaForCoolPeopleText, String expectedMobileTestAutomationText, String expectedAccessibilityTestingText) {
//        ArrayList<String> expectedText = new ArrayList<>();
//        expectedText.add(expectedDatabaseTestingText);
//        expectedText.add(expectedTestingFundamentalsText);
//        expectedText.add(expectedSDLCMethodologiesText);
//        expectedText.add(expectedSeleniumTestAutomationText);
//        expectedText.add(expectedCucumberFundamentalsText);
//        expectedText.add(expectedAPITestingText);
//        expectedText.add(expectedGitGitHubText);
//        expectedText.add(expectedJavaForCoolPeopleText);
//        expectedText.add(expectedMobileTestAutomationText);
//        expectedText.add(expectedAccessibilityTestingText);
//        ArrayList<String> actualText = new ArrayList<>();
//        for(int i =0; i<=5;i++){
//            List<WebElement> pathActualTexts = driver.findElements(By.xpath("(//*[contains(text(),'Cyber Security')]/following-sibling::td/div)[" + i + "]"));
//            actualText.addAll(pathActualTexts);
//        }
//        CommonMethods.assertEquals(actualText,expectedText);
//        CommonMethods.assertEquals(actualText.size(),expectedText.size());
//    }

    @Then("the following sections for class SDET is displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_sections_for_class_sdet_is_displayed(String expectedDatabaseTestingText, String expectedTestingFundamentalsText, String expectedSDLCMethodologiesText, String expectedSeleniumTestAutomationText, String expectedCucumberFundamentalsText, String expectedAPITestingText, String expectedGitGitHubText, String expectedJavaForCoolPeopleText, String expectedMobileTestAutomationText, String expectedAccessibilityTestingText) {
        ArrayList<String> expectedText = new ArrayList<>();
        expectedText.add(expectedDatabaseTestingText);
        expectedText.add(expectedTestingFundamentalsText);
        expectedText.add(expectedSDLCMethodologiesText);
        expectedText.add(expectedSeleniumTestAutomationText);
        expectedText.add(expectedCucumberFundamentalsText);
        expectedText.add(expectedAPITestingText);
        expectedText.add(expectedGitGitHubText);
        expectedText.add(expectedJavaForCoolPeopleText);
        expectedText.add(expectedMobileTestAutomationText);
        expectedText.add(expectedAccessibilityTestingText);
        ArrayList<String> actualText = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            WebElement pathActualTexts = driver.findElement(By.xpath("(//*[contains(text(),'SDET')]/following-sibling::td/div)[" + i + "]"));
            actualText.add(pathActualTexts.getText());
        }
        Assert.assertEquals(actualText, expectedText);
        Assert.assertEquals(actualText.size(), expectedText.size());
    }

    @Then("the following sections for class Cyber Security is displayed {string}, {string}, {string}, {string}")
    public void the_following_sections_for_class_cyber_security_is_displayed(String expectedNetworkingFundamentalsText, String expectedLinuxFundamentalsText, String expectedCIATriadText, String expectedPenetrationTestingEthicalHackingText) {
        ArrayList<String> expectedText = new ArrayList<>();
        expectedText.add(expectedNetworkingFundamentalsText);
        expectedText.add(expectedLinuxFundamentalsText);
        expectedText.add(expectedCIATriadText);
        expectedText.add(expectedPenetrationTestingEthicalHackingText);
        ArrayList<String> actualText = new ArrayList<>();


    }



//    @Then("the following sections for class Cyber Security is displayed {string}, {string}, {string}, {string}")
//    public void the_following_sections_for_class_cyber_security_is_displayed(String expectedNetworkingFundamentalsText, String expectedLinuxFundamentalsText, String expectedCIATriadText, String expectedPenetrationTestingEthicalHackingText) {
//        ArrayList<String> expectedText = new ArrayList<>();
//        expectedText.add(expectedNetworkingFundamentalsText);
//        expectedText.add(expectedLinuxFundamentalsText);
//        expectedText.add(expectedCIATriadText);
//        expectedText.add(expectedPenetrationTestingEthicalHackingText);
//        ArrayList<String> actualText = new ArrayList<>();
//        for(int i = 1; i <= 4; i++){
//            WebElement pathActualTexts = driver.findElement(By.xpath("(//*[contains(text(),'Cyber Security')]/following-sibling::td/div)[" + i + "]"));
//            actualText.add(pathActualTexts.getText());
//        }
//        Assert.assertEquals(actualText, expectedText);
//        Assert.assertEquals(actualText.size(), expectedText.size());
//    }



}
