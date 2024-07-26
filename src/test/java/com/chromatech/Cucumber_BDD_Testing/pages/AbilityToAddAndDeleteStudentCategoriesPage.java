package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbilityToAddAndDeleteStudentCategoriesPage {

    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* STUDENT CATEGORIES SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategoriesSubModule;

    /* CATEGORY TEXT BOX */
    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryTextBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* ALERT SUCCESS MESSAGE */
    @FindBy(xpath = "//*[contains(text(),'Record Saved Successfully')]")
    public WebElement actualSuccessMessage;

    /* DELETE BUTTON */
    @FindBy(xpath = "//*[contains(text(),'Oleksandra')]/following-sibling::td[2]/a[2]")
    public WebElement deleteButton;

     public AbilityToAddAndDeleteStudentCategoriesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}