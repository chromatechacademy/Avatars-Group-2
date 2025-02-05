package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeModulePage {

    public IncomeModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* INCOME MODULE */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    /* ADD INCOME SUBMODULE */
    @FindBy(xpath = "//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[3]/ul[1]/li[1]/a[1]")
    public WebElement addIncomeSubmodule;

    /* SEARCH INCOME SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement searchIncomeSubmodule;

    /* INCOME HEAD SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement incomeHeadSubmodule;
}