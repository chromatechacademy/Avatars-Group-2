package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_Student_Record_Steps extends PageInitializer {

    @Then("user clicks on the Student Details submodule")
    public void user_clicks_on_the_student_details_submodule() {
        StepsImplementation.user_clicks_on_the_student_details_submodule();
    }

    @Then("user enters unique admission number {string} in Search by Keyword text box")
    public void user_enters_unique_admission_number_in_search_by_keyword_text_box(String searchByKeywordTex) {
        StepsImplementation.user_enters_unique_admission_number_in_search_by_keyword_text_box(searchByKeywordTex);
    }

    @When("user clicks on the Search button")
    public void user_clicks_on_the_search_button() {
        StepsImplementation.user_clicks_on_the_search_button();
    }

    @When("user clicks on edit btn")
    public void user_clicks_on_edit_btn() {
        StepsImplementation.user_clicks_on_edit_btn();
    }

    @When("user clicks on show btn")
    public void user_clicks_on_show_btn() {
        StepsImplementation.user_clicks_on_show_btn();
    }

    @When("user is on the Student page checks updated data {string}, {string}, {string}")
    public void user_is_on_the_student_page_checks_updated_data(String updatedLastNameExp, String updatedEmailExp, String updatedFathersNameExp) {
        StepsImplementation.user_is_on_the_student_page_checks_updated_data(updatedLastNameExp, updatedEmailExp, updatedFathersNameExp);
    }
}