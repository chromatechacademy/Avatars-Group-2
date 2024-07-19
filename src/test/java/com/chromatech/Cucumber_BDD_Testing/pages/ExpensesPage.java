package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpensesPage {

    //Expense Head Drop Down
    @FindBy(xpath = "//select[@id='exp_head_id']")
    public WebElement expenceDropDown;

    //Name Text Box
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    //Invoice Number Text Box
    @FindBy(xpath = "//input[@id='invoice_no']")
    public WebElement invoiceNumberTextBox;

    //Date Picker
    @FindBy(xpath = "")


    //Amount Text Box
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amountTextBox;
}
