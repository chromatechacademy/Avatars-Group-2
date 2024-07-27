package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Remove_Expense_Heads_Steps extends PageInitializer {

    @Given("clicks on the Expense Head module")
    public void clicks_on_the_expense_head_module() {
        StepsImplementation.clicks_on_the_expense_head_module();
    }

    @When("adds {string} to the Expense Head text box")
    public void adds_to_the_expense_head_text_box(String headBox) {
        StepsImplementation.adds_to_the_expense_head_text_box(headBox);
    }

    @When("adds {string} to the Description text box")
    public void adds_to_the_description_text_box(String desc) {
        StepsImplementation.adds_to_the_description_text_box(desc);
    }

    @When("clicks the Save button")
    public void clicks_the_save_button() {
        StepsImplementation.clicks_the_save_button();
    }

    @Then("the Expense Head is successfully admitted {string}")
    public void the_expense_head_is_successfully_admitted(String expectedAlertSuccessText) {
        StepsImplementation.the_expense_head_is_successfully_admitted(expectedAlertSuccessText);
    }

    @Then("the user deletes the Expense Head {string}")
    public void the_user_deletes_the_expense_head(String expenseHeadText) {
        StepsImplementation.the_user_deletes_the_expense_head(expenseHeadText);
    }

    @Then("accepts alert {string}")
    public void accepts_alert(String expectedAlertText) {
        StepsImplementation.accepts_alert(expectedAlertText);
    }
}