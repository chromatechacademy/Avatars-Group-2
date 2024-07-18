package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(driver, this);
    }

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

    /*BLOOD GROUP DROP DOWN*/
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    /*AS ON DATE DAY PICKER*/
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement asOnDateDayPicker;

    /*PHONE NUMBER TEXT BOX*/
    @FindBy(xpath = "(//input[@id='custom_fields[students][1]'])[1]")
    public WebElement phoneNumberTextBox;

    /*HEIGHT TEXT BOX*/
    @FindBy(xpath = "(//input[@id='custom_fields[students][2]'])[1]")
    public WebElement heightTextBox;

    /*WEIGHT TEXT BOX*/
    @FindBy(xpath = "(//input[@id='custom_fields[students][3]'])[1]")
    public WebElement weightTextBox;

    /*MOTHER NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    /*MOTHER PHONE NUMBER TEXT BOX*/
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneNumberTextBox;

    /*MOTHER OCCUPATION TEXT BOX*/
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    /*RADIO BUTTON MOTHER*/
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement radioButtonMother;

    /*GUARDIAN ADDRESS TEXT BOX*/
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    /*SAVE BUTTON*/
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /*MOTHER EMAIL TEXT BOX*/
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement motherEmailTextbox;

    /*FATHER NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextbox;

    /*FATHER PHONE NUMBER TEXT BOX*/
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneNumberTextbox;

    /*FATHER OCCUPATION TEXT BOX*/
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextbox;

    /*ALERT SUCCSESS TEXT*/
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement actualAlertSuccsessText;
}