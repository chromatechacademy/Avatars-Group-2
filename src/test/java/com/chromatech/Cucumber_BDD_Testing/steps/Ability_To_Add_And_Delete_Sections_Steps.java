package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Sections_Steps extends PageInitializer {

    @When("user click on the Academics module")
    public void user_click_on_academics_module() {
        StepsImplementation.user_click_on_academics_module();
    }

    @When("user clicks on Sections submodule")
    public void user_clicks_on_sections_submodule() {
        StepsImplementation.user_clicks_on_sections_submodule();
    }

    @When("adds a section {string}")
    public void adds_a_section(String newSectionNameText) {
        StepsImplementation.adds_a_section(newSectionNameText);
    }

    @When("clicks on the Save button")
    public void clicks_on_the_save_button() {
        StepsImplementation.clicks_on_the_save_button();
    }

    @Then("section is successfully saved {string}")
    public void section_is_successfully_saved(String expectedAlertSaveText) {
        StepsImplementation.section_is_successfully_saved(expectedAlertSaveText);
    }

    @Then("user is deleting the section {string}")
    public void user_is_deleting_the_section(String sectionNameDelete) {
        StepsImplementation.user_is_deleting_the_section(sectionNameDelete);
    }

    @Then("accept alert {string}")
    public void accept_alert(String expectedAlertText) {
        StepsImplementation.accept_alert(expectedAlertText);
    }

    @When("if the section {string} exists user clicks on the delete button and accepting alert")
    public void if_the_section_exists_user_clicks_on_the_delete_button_and_accepting_alert(String sectionNameDeleteText) {
        StepsImplementation.if_the_section_exists_user_clicks_on_the_delete_button_and_accepting_alert(sectionNameDeleteText);
    }
}