package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.AbilityToAddAndDeleteSectionsPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Add_And_Delete_Sections_Steps {

    AbilityToAddAndDeleteSectionsPage abilityToAddAndDeleteSectionsPage = new AbilityToAddAndDeleteSectionsPage();
    private boolean isDeleteClicked = false;

    @When("user clicks on Academics module")
    public void user_clicks_on_academics_module() {
        CommonMethods.click(abilityToAddAndDeleteSectionsPage.academicsModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on Sections submodule")
    public void user_clicks_on_sections_submodule() {
        CommonMethods.click(abilityToAddAndDeleteSectionsPage.sectionsSubmodule);
        CucumberLogUtils.logScreenShot();
    }

    @When("adds a section {string}")
    public void adds_a_section(String newSectionNameText) {
        CommonMethods.sendKeys(abilityToAddAndDeleteSectionsPage.sectionNameTextBox, newSectionNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the Save button")
    public void clicks_on_the_save_button() {
        CommonMethods.click(abilityToAddAndDeleteSectionsPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @Then("section is successfully saved {string}")
    public void section_is_successfully_saved(String expectedAlertSaveText) {
        CommonMethods.assertEquals(abilityToAddAndDeleteSectionsPage.actualAlertSaveText.getText(), expectedAlertSaveText);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user is deleting the section {string}")
    public void user_is_deleting_the_section(String sectionNameDelete) {
        JavascriptMethods.scrollIntoView(abilityToAddAndDeleteSectionsPage.dynamicLocatorDelete(sectionNameDelete));
        CucumberLogUtils.logScreenShot();
     CommonMethods.click(abilityToAddAndDeleteSectionsPage.dynamicLocatorDelete(sectionNameDelete));
    }

    @Then("accepting alert {string}")
    public void accepting_alert(String expectedAlertText) {
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }

    @When("if the section {string} exists user clicks on the delete button and accepting alert")
    public void if_the_section_exists_user_clicks_on_the_delete_button_and_accepting_alert(String sectionNameDeleteText) {
        List<WebElement> names = driver.findElements(By.xpath("//tbody/tr"));
        for(WebElement name : names){
            List<WebElement> rows = name.findElements(By.tagName("tr"));
            for(WebElement row : rows){
                if (name.getText().equals(sectionNameDeleteText)) {
                    CommonMethods.click(abilityToAddAndDeleteSectionsPage.dynamicLocatorDelete(sectionNameDeleteText));
                    CommonMethods.acceptAlert();
                    return;
                }
            }
            System.out.println("* * * SECTION " + sectionNameDeleteText + "DOESNT EXIST * * *");
        }
    }




}