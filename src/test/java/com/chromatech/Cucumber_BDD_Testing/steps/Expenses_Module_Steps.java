package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.ExpensesModulePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class Expenses_Module_Steps {

    ExpensesModulePage expensesModule = new ExpensesModulePage();

    @Then("the following submodules are displayed: {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedAddExpenseText, String expectedSearchExpenseText, String expectedExpenseHeadText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(expensesModule.addExpenseSubmodule.getText(), expectedAddExpenseText);
        CommonMethods.assertEquals(expensesModule.searchExpenseSubmodule.getText(), expectedSearchExpenseText);
        CommonMethods.assertEquals(expensesModule.expenseHeadSubmodule.getText(), expectedExpenseHeadText);
    }
}