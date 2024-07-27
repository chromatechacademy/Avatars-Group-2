package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Add_Delete_Classes_Steps extends PageInitializer {

    @When("user clicks on Academics module")
    public void user_clicks_on_academics_module() {
        addDeleteClassesPage.academicsModule.click();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Class sub module")
    public void clicks_on_class_sub_module() {
        JavascriptMethods.scrollIntoView(addDeleteClassesPage.classSubModule);
        addDeleteClassesPage.classSubModule.click();
        CucumberLogUtils.logScreenShot();
    }

    @When("delete the Class {string} if already existed")
    public void delete_the_class_if_already_existed(String savedClass){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isElementPresent = (Boolean) js.executeScript(
                "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue !== null;",
                addDeleteClassesPage.savedClassXpath(savedClass)
        );
        if (isElementPresent) {
            WebElement deleteButton = (WebElement) js.executeScript(
                    "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;",
                    addDeleteClassesPage.savedClassXpath(savedClass)
            );
            deleteButton.click();
            CommonMethods.acceptAlert();
            CucumberLogUtils.logScreenShot();
        } else {
            System.out.println("Class " + savedClass + " does not exist, so no need to delete.");
        }
        CucumberLogUtils.logScreenShot();
    }

    @When("enters {string} on Class text box")
    public void enters_on_class_text_box(String text) {
        CommonMethods.sendKeys(addDeleteClassesPage.classTextBox, text);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on {string} check box")
    public void clicks_on_check_box(String section) {
        addDeleteClassesPage.sectionCheckBox(section).click();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks save")
    public void clicks_save() {
        JavascriptMethods.scrollIntoView(addDeleteClassesPage.saveButton);
        addDeleteClassesPage.saveButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("record is saved {string}")
    public void record_is_saved(String expectedMessage) {
        CommonMethods.assertEquals(addDeleteClassesPage.recordSavedMessage.getText(), expectedMessage);
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on the delete button for the saved class {string} and accepts alert the record is deleted")
    public void user_clicks_on_the_delete_button_for_the_saved_class_and_accepts_alert_the_record_is_deleted(String savedClass) {
        addDeleteClassesPage.deleteButton(savedClass).click();
        CommonMethods.assertEquals(CommonMethods.getAlertText(),"Delete Confirm?");
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }
}
