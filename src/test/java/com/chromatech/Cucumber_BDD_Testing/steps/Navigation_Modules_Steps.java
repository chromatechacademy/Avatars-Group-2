package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;

public class Navigation_Modules_Steps extends PageInitializer {

    @Then("the following modules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_are_displayed(String expectedStudentInformationText, String expectedFeesCollectionText, String expectedIncomeText, String expectedExpensesText, String expectedAcademicsText, String expectedHumanResourceText, String expectedHomeworkText, String expectedReportsText) {
        StepsImplementation.the_following_modules_are_displayed(expectedStudentInformationText, expectedFeesCollectionText, expectedIncomeText, expectedExpensesText, expectedAcademicsText, expectedHumanResourceText, expectedHomeworkText, expectedReportsText);
    }
}