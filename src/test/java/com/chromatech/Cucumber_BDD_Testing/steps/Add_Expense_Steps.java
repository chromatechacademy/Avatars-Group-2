package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import static com.chromatech.Cucumber_BDD_Testing.appsCommon.Constants.SCREENSHOT;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Add_Expense_Steps extends PageInitializer {

    @When("user clicks on Expenses module")
    public void user_clicks_on_expenses_module() {
        CommonMethods.click(addExpensePage.expensesModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Add Expense sub module")
    public void clicks_on_add_expense_sub_module() {
        CommonMethods.click(addExpensePage.addExpenseSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for expense head drop down")
    public void selects_for_expense_head_drop_down(String expenseHeadText) {
        CommonMethods.selectDropDownValue(expenseHeadText, addExpensePage.expenseHeadDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters name {string}")
    public void enters_name(String nameText) {
        CommonMethods.sendKeys(addExpensePage.nameTextBox, nameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters invoice number {string}")
    public void enters_invoice_number(String invoiceNumberText) {
        CommonMethods.sendKeys(addExpensePage.invoiceNumberTextBox, invoiceNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for Date Calendar Day")
    public void selects_for_date_calendar_day(String calendarPickerText) {
        JavascriptMethods.selectDateByJS(addExpensePage.calendarPicker, calendarPickerText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters amount {string}")
    public void enters_amount(String amountText) {
        CommonMethods.sendKeys(addExpensePage.amountTextBox, amountText);
        CucumberLogUtils.logScreenShot();
    }

    @When("attach file")
    public void attach_document() {
        CommonMethods.sendKeys(addExpensePage.file, SCREENSHOT);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters description {string}")
    public void enters_description(String descriptionText) {
        CommonMethods.sendKeys(addExpensePage.descriptionBox, descriptionText);
        CucumberLogUtils.logScreenShot();
    }

    @When("user saves application")
    public void user_saves_application() {
        CommonMethods.click(addExpensePage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the expense displays as expected  {string}, {string}, {string}, {string},  {string}")
    public void the_expense_displays_as_expected(String expectedNameText, String expectedInvoiceNumberText, String expectedDateText, String expectedExpenseHeadText, String expectedAmountText) {
        ArrayList<String> expenseData = new ArrayList<>();
        expenseData.add(expectedNameText);
        expenseData.add(expectedInvoiceNumberText);
        expenseData.add(expectedDateText);
        expenseData.add(expectedExpenseHeadText);
        expenseData.add(expectedAmountText);

        for (int i = 0; i < expenseData.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//tr/td[text()='" + expectedInvoiceNumberText + "']//parent::tr/td[" + (i + 1) + "]"));
            CucumberLogUtils.logScreenShot();
            CommonMethods.assertEquals(element.getText(), expenseData.get(i));
        }
    }

    @Then("the expense can then be removed")
    public void the_expense_can_then_be_removed() {
        CommonMethods.click(addExpensePage.removeExpense);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }
}