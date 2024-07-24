package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.AbilityToAddAndRemoveExpenseHeadsPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Given;

public class Ability_To_Add_And_Remove_Expense_Heads_Steps {

    AbilityToAddAndRemoveExpenseHeadsPage abilityToAddAndRemoveExpenseHeadsPage = new AbilityToAddAndRemoveExpenseHeadsPage();

    @Given("clicks on the Expense Head module")
    public void i_am_on_the_ability_to_add_and_remove_expense_heads_page() {
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadSubmodule);


    }
}
