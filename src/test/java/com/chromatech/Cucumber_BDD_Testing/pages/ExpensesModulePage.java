package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesModulePage {

    public ExpensesModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    //Add Expense Submodule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Add Expense']")
    public WebElement addExpenseSubmodule;

    //Search Expense Submodule
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseSubmodule;

    //Expense Head Submodule
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement expenseHeadSubmodule;
}
