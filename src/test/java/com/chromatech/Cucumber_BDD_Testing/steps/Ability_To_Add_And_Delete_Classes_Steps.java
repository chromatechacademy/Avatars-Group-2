package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Classes_Steps extends PageInitializer {

    @When("user clicks on Academics module")
    public void user_clicks_on_academics_module() {
        StepsImplementation.user_clicks_on_academics_module();
    }

    @When("clicks on Class sub module")
    public void clicks_on_class_sub_module() {
        StepsImplementation.clicks_on_class_sub_module();
    }

    @When("delete the Class {string} if already existed")
    public void delete_the_class_if_already_existed(String savedClass){
        StepsImplementation.delete_the_class_if_already_existed(savedClass);
    }

    @When("enters {string} on Class text box")
    public void enters_on_class_text_box(String text) {
        StepsImplementation.enters_on_class_text_box(text);
    }

    @When("clicks on {string} check box")
    public void clicks_on_check_box(String section) {
        StepsImplementation.clicks_on_check_box(section);
    }

    @When("clicks save")
    public void clicks_save() {
        StepsImplementation.clicks_save();
    }

    @Then("record is saved {string}")
    public void record_is_saved(String expectedMessage) {
        StepsImplementation.record_is_saved(expectedMessage);
    }

    @When("user clicks on the delete button for the saved class {string} and accepts alert the record is deleted")
    public void user_clicks_on_the_delete_button_for_the_saved_class_and_accepts_alert_the_record_is_deleted(String savedClass) {
        StepsImplementation.user_clicks_on_the_delete_button_for_the_saved_class_and_accepts_alert_the_record_is_deleted(savedClass);
    }
}
