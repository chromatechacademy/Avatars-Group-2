package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class NavigationModulePage {

    public NavigationModulePage() {
        PageFactory.initElements(driver, this);

        /* STUDENT INFORMATION */
        @FindBy(xpath = "//span[normalize-space()='Student Information']")
        public WebElement


                /* FEES COLLECTION */
        @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
        public WebElement


                /* INCOME */
        @FindBy(xpath = "//span[normalize-space()='Income']")
        public WebElement


                /* EXPENSES */
        @FindBy(xpath = "//span[normalize-space()='Expenses']")
        public WebElement


                /* ACADEMICS */
        @FindBy(xpath = "//span[normalize-space()='Academics']")
        public WebElement


                /* HUMAN RESOURCE */
        @FindBy(xpath = "//span[normalize-space()='Human Resource']")
        public WebElement


                /* HOMEWORK */
        @FindBy(xpath = "//span[normalize-space()='Homework']")
        public WebElement


                /* REPORTS */
        @FindBy(xpath = "//span[normalize-space()='Reports']")
        public WebElement

    }
}
