package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AddDeleteClassesPage {

    public  AddDeleteClassesPage() {
        PageFactory.initElements(driver, this);
    }

    //ACADEMICS MODULE
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    //CLASS SUB MODULE
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubModule;

    //CLASS TEXT BOX
    @FindBy(xpath = "//input[@id='class']")
    public WebElement classTextBox;

    //SECTION TEXT BOX
    public WebElement sectionCheckBox(String section) {
        return driver.findElement(By.xpath("//label[contains(normalize-space(), '" + section + "' )]"));
    }

    //SAVE BUTTON
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    //SAVED MESSAGE
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement recordSavedMessage;

    // DELETE BUTTON
    public WebElement deleteButton(String savedClass) {
        return driver.findElement(By.xpath("//td[normalize-space(text())='" + savedClass + "']/following-sibling::td//a[@title='Delete']"));
    }

    // SAVED CLASS XPATH
    public String savedClassXpath(String savedClass) {
        return "//td[normalize-space(text())='" + savedClass + "']/following-sibling::td//a[@title='Delete']";
    }
}
