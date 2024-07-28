package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Ability_To_Disable_And_Enable_Student_Record_Steps extends PageInitializer {

    @When("user clicks on Disable button and accepting alert {string}")
    public void user_clicks_on_disable_button_and_accepting_alert(String expectedAlertText) {
        StepsImplementation.user_clicks_on_disable_button_and_accepting_alert(expectedAlertText);
    }

    @When("selects {string} for Reason drop down")
    public void selects_for_reason_drop_down(String reasonText) {
        StepsImplementation.selects_for_reason_drop_down(reasonText);
    }

    @When("user clicks on Save button")
    public void user_clicks_on_save_button() {
        StepsImplementation.user_clicks_on_save_button();
    }

    @Then("user clicks on Disabled Students sub module")
    public void user_clicks_on_disabled_students_sub_module() {
        StepsImplementation.user_clicks_on_disabled_students_sub_module();
    }

    @When("user clicks on Enable button and accepting alert {string}")
    public void user_clicks_on_enable_button_and_accepting_alert(String expectedAlertText) {
        StepsImplementation.user_clicks_on_enable_button_and_accepting_alert(expectedAlertText);
    }
}