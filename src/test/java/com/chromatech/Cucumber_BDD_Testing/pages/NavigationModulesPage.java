package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationModulesPage {

public NavigationModulesPage() {
    PageFactory.initElements(WebDriverUtils.driver, this);
}
    /* STUDENT INFORMATION */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* FEES COLLECTION */
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    /* INCOME */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    /* EXPENSES */
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

    /* ACADEMICS */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    /* HUMAN RESOURCE */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    /* HOMEWORK */
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeworkModule;

    /* REPORTS */
    @FindBy(xpath = "//span[normalize-space()='Reports']")
    public WebElement reportsModule;
}