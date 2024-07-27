package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Expense_Steps extends PageInitializer {

    @When("user clicks on Expenses module")
    public void user_clicks_on_expenses_module() {
        StepsImplementation.user_clicks_on_expenses_module();
    }

    @When("clicks on Add Expense sub module")
    public void clicks_on_add_expense_sub_module() {
        StepsImplementation.clicks_on_add_expense_sub_module();
    }

    @When("selects {string} for expense head drop down")
    public void selects_for_expense_head_drop_down(String expenseHeadText) {
        StepsImplementation.selects_for_expense_head_drop_down(expenseHeadText);
    }

    @When("enters name {string}")
    public void enters_name(String nameText) {
        StepsImplementation.enters_name(nameText);
    }

    @When("enters invoice number {string}")
    public void enters_invoice_number(String invoiceNumberText) {
        StepsImplementation.enters_invoice_number(invoiceNumberText);
    }

    @When("selects {string} for Date Calendar Day")
    public void selects_for_date_calendar_day(String calendarPickerText) {
        StepsImplementation.selects_for_date_calendar_day(calendarPickerText);
    }

    @When("enters amount {string}")
    public void enters_amount(String amountText) {
        StepsImplementation.enters_amount(amountText);
    }

    @When("attach file")
    public void attach_document() {
        StepsImplementation.attach_document();
    }

    @When("enters description {string}")
    public void enters_description(String descriptionText) {
        StepsImplementation.enters_description(descriptionText);
    }

    @When("user saves application")
    public void user_saves_application() {
        StepsImplementation.user_saves_application();
    }

    @Then("the expense displays as expected  {string}, {string}, {string}, {string},  {string}")
    public void the_expense_displays_as_expected(String expectedNameText, String expectedInvoiceNumberText, String expectedDateText, String expectedExpenseHeadText, String expectedAmountText) {
        StepsImplementation.the_expense_displays_as_expected(expectedNameText, expectedInvoiceNumberText, expectedDateText, expectedExpenseHeadText, expectedAmountText);
    }

    @Then("the expense can then be removed")
    public void the_expense_can_then_be_removed() {
        StepsImplementation.the_expense_can_then_be_removed();
    }
}