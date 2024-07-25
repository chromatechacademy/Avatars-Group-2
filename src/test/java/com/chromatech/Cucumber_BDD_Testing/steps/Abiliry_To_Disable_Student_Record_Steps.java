package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.AbilityToDisableStudentRecordPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Abiliry_To_Disable_Student_Record_Steps {

    AbilityToDisableStudentRecordPage abilityToDisableStudentRecordPage = new AbilityToDisableStudentRecordPage();

    @When("user clicks on Disable button and accepting alert {string}")
    public void user_clicks_on_disable_button_and_accepting_alert(String expectedAlertText) {
        CucumberLogUtils.logScreenShot();
        abilityToDisableStudentRecordPage.disableButton.click();
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
    }

    @When("selects {string} for Reason drop down")
    public void selects_for_reason_drop_down(String reasonText) {
        CommonMethods.selectDropDownValue(reasonText, abilityToDisableStudentRecordPage.reasonDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        CucumberLogUtils.logScreenShot();
        abilityToDisableStudentRecordPage.saveButton.click();
    }

    @Then("user clicks on Disabled Students sub module")
    public void user_clicks_on_disabled_students_sub_module() {
        CucumberLogUtils.logScreenShot();
        abilityToDisableStudentRecordPage.disabledStudentsSubmodule.click();
    }

}
