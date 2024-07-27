package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* USERNAME TEXT BOX */
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextBox;

    /* PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* SIGN IN BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /* ALERT MESSAGE */
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement actualText;
}