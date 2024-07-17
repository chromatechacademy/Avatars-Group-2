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

    /*STUDENT INFORMATION MODULE*/
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /*STUDENT ADMISSION SUB MODULE*/
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubModule;

    /*ADMISSION TEXT BOX*/
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionTextBox;

    /*ROLL NUMBER TEXT BOX*/
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    /*CLASS DROP DOWN*/
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /*SECTION DROP DOWN*/
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    /*FIRST NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /*LAST NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    /*GENDER DROP DOWN*/
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /*DATE OF BIRTH DAY PICKER*/
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthDayPicker;

    /*CATEGORY DROP DOWN*/
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    /*EMAIL TEXT BOX*/
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    /*ADMISSION DATE DAY PICKER*/
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateDayPicker;


}