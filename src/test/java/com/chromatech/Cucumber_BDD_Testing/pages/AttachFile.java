package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class AttachFile {
    public AttachFile(){PageFactory.initElements(driver,this);}

    //Attach File
    @FindBy(xpath = "//input[@id='documents']")
    public WebElement file;
}
