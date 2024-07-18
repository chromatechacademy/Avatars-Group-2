package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageInitializer {

    /**
     * THIS PAGE WILL BE USED TO INITIALIZE ALL
     * PAGE OBJECTS
     */


    public static void initializeAllPages() {
    }

    public PageInitializer() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*USERNAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;

    /*PASSWORD TEXT BOX*/
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /*SIGN IN BUTTON*/
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;
}