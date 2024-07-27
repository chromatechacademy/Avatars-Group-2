package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesModulePage {

    public ExpensesModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* ADD EXPENSE SUBMODULE */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Add Expense']")
    public WebElement addExpenseSubmodule;

    /* SEARCH EXPENSE SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseSubmodule;

    /* EXPENSE HEAD SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement expenseHeadSubmodule;
}