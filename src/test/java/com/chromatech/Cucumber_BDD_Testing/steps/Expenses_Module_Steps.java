package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;

public class Expenses_Module_Steps extends PageInitializer {

    @Then("the following submodules are displayed: {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedAddExpenseText, String expectedSearchExpenseText, String expectedExpenseHeadText) {
        StepsImplementation.the_following_submodules_are_displayed(expectedAddExpenseText, expectedSearchExpenseText, expectedExpenseHeadText);
    }
}