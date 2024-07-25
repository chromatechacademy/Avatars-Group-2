package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbilityToAddAndDeleteSectionsPage {

    public AbilityToAddAndDeleteSectionsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*ACADEMICS MODULE*/
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    /*SECTIONS SUB MODULE*/
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubmodule;

    /*SECTION NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='section']")
    public WebElement sectionNameTextBox;

    /*SAVE BUTTON*/
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /*RECORD SAVED TEXT*/
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement actualAlertSaveText;

    public static WebElement dynamicLocatorDelete(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("(//*[contains(text(),'" + text + "')]//parent::tr/td[2]/a/i)[2]"));
    }

//    ((//*[contains(text(),'New Section Test')]//parent::tr/td)[2]/a/i)[2]












}
