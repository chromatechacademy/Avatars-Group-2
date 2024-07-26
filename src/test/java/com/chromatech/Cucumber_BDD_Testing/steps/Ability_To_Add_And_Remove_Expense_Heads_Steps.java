package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.AbilityToAddAndRemoveExpenseHeadsPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Remove_Expense_Heads_Steps {

    AbilityToAddAndRemoveExpenseHeadsPage abilityToAddAndRemoveExpenseHeadsPage = new AbilityToAddAndRemoveExpenseHeadsPage();

    @Given("clicks on the Expense Head module")
    public void clicks_on_the_expense_head_module() {
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadSubmodule);
        CucumberLogUtils.logScreenShot();

    }

    @When("adds {string} to the Expense Head text box")
    public void adds_to_the_expense_head_text_box(String headBox) {
        CommonMethods.sendKeys(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadTextBox, headBox);
        CucumberLogUtils.logScreenShot();
    }

    @When("adds {string} to the Description text box")
    public void adds_to_the_description_text_box(String desc) {
        CommonMethods.sendKeys(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadDescription, desc);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks the Save button")
    public void clicks_the_save_button() {
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the Expense Head is successfully admitted {string}")
    public void the_expense_head_is_successfully_admitted(String expectedAlertSuccessText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(abilityToAddAndRemoveExpenseHeadsPage.actualAlertSuccessText.getText(), expectedAlertSuccessText);
    }

    @Then("the user deletes the Expense Head {string}")
    public void the_user_deletes_the_expense_head(String expenseHeadText) {
        JavascriptMethods.scrollIntoView(abilityToAddAndRemoveExpenseHeadsPage.dynamicLocatorDeleteExpenseText(expenseHeadText));
        CucumberLogUtils.logScreenShot();
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.dynamicLocatorDeleteExpenseText(expenseHeadText));
    }

    @Then("accepts alert {string}")
    public void accepts_alert(String expectedAlertText) {
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }
}