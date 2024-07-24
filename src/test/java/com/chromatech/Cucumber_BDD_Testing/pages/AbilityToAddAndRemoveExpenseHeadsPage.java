package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AbilityToAddAndRemoveExpenseHeadsPage {

    public AbilityToAddAndRemoveExpenseHeadsPage() {
        PageFactory.initElements(driver, this);
    }

        //Expense Head Submodule
        @FindBy(xpath = "//a[normalize-space()='Expense Head']//i[@class='fa fa-angle-double-right']")
    public WebElement expenseHeadSubmodule;

    }

