package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class AddExpensePage {

    public AddExpensePage() {
        PageFactory.initElements(driver, this);
    }

    //Expenses Module
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    //Add Expense Sub Module
    @FindBy(xpath = "//a[normalize-space()='Add Expense']//i[@class='fa fa-angle-double-right']")
    public WebElement addExpenseSubModule;

    //Expense Head drop down
    @FindBy(xpath = "//select[@id='exp_head_id']")
    public WebElement expenseHeadDropDown;

    //Name Text Box
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    //Invoice Number Text Box
    @FindBy(xpath = "//input[@id='invoice_no']")
    public WebElement invoiceNumberTextBox;

    //Calendar Picker
    @FindBy(xpath = "//input[@id='date']")
    public WebElement calendarPicker;

    // Amount Text Box
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTetBox;

    //Attach Document
    @FindBy(xpath = "//input[@id='documents']")
    public WebElement attachDocument;

//    //Save Button
//    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
//    public WebElement saveButton;
//
//    //Expense Displays
//    @FindBy(xpath = "//h3[normalize-space()='Expense List']")
//    public WebElement expenseDisplays;

//    //Remove Expense
//    @FindBy(xpath = "//tbody/tr[2]/td[1]/a[1]")
//    public WebElement removeExpense;

}