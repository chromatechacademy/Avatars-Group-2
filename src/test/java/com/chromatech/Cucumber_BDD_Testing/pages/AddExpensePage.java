package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AddExpensePage {

    public AddExpensePage() {
        PageFactory.initElements(driver, this);
    }

    /* EXPENSES MODULE */
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    /* ADD EXPENSE SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Add Expense']//i[@class='fa fa-angle-double-right']")
    public WebElement addExpenseSubModule;

    /* EXPENSE HEAD DROP DOWN */
    @FindBy(xpath = "//select[@id='exp_head_id']")
    public WebElement expenseHeadDropDown;

    /* NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    /* INVOICE NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='invoice_no']")
    public WebElement invoiceNumberTextBox;

    /* CALENDER PICKER */
    @FindBy(xpath = "//input[@id='date']")
    public WebElement calendarPicker;

    /* AMOUNT TEXT BOX */
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTextBox;

    /* ATTACH FILE */
    @FindBy(xpath = "//input[@id='documents']")
    public WebElement file;

    /* DESCRIPTION BOX */
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* REMOVE EXPENSE */
    @FindBy(xpath = "//td[text()='54321']/following-sibling::td[4]/a[3]")
    public WebElement removeExpense;
}