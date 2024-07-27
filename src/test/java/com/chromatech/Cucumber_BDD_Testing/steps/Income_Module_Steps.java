package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Income_Module_Steps extends PageInitializer {

    @When("user clicks on Income module")
    public void user_clicks_on_income_module() {
        StepsImplementation.user_clicks_on_income_module();
    }

    @Then("the following submodules displayed:{string}, {string}, {string}")
    public void the_following_submodules_displayed(String expectedAddIncomeText, String expectedSearchIncomeText, String expectedIncomeHeadText) {
        StepsImplementation.the_following_submodules_displayed(expectedAddIncomeText, expectedSearchIncomeText, expectedIncomeHeadText);
    }
}