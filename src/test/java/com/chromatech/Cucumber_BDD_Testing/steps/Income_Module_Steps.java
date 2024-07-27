package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Income_Module_Steps extends PageInitializer {

    @When("user clicks on Income module")
    public void user_clicks_on_income_module() {
        CommonMethods.click(incomeModulePage.incomeModule);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules are displayed:{string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedAddIncomeText, String expectedSearchIncomeText, String expectedIncomeHeadText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(incomeModulePage.addIncomeSubmodule.getText(), expectedAddIncomeText);
        CommonMethods.assertEquals(incomeModulePage.searchIncomeSubmodule.getText(), expectedSearchIncomeText);
        CommonMethods.assertEquals(incomeModulePage.incomeHeadSubmodule.getText(), expectedIncomeHeadText);
    }
}