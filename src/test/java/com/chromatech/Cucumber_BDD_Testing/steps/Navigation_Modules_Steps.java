package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class Navigation_Modules_Steps extends PageInitializer {

    @Then("the following modules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_are_displayed(String expectedStudentInformationText, String expectedFeesCollectionText, String expectedIncomeText, String expectedExpensesText, String expectedAcademicsText, String expectedHumanResourceText, String expectedHomeworkText, String expectedReportsText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(navigationModulesPage.studentInformationModule.getText(), expectedStudentInformationText);
        CommonMethods.assertEquals(navigationModulesPage.feesCollectionModule.getText(), expectedFeesCollectionText);
        CommonMethods.assertEquals(navigationModulesPage.incomeModule.getText(), expectedIncomeText);
        CommonMethods.assertEquals(navigationModulesPage.expensesModule.getText(), expectedExpensesText);
        CommonMethods.assertEquals(navigationModulesPage.academicsModule.getText(), expectedAcademicsText);
        CommonMethods.assertEquals(navigationModulesPage.humanResourceModule.getText(), expectedHumanResourceText);
        CommonMethods.assertEquals(navigationModulesPage.homeworkModule.getText(), expectedHomeworkText);
        CommonMethods.assertEquals(navigationModulesPage.reportsModule.getText(), expectedReportsText);
    }



}