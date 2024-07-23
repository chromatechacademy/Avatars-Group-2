package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
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

    /*ADMISSION DATE PICKER*/
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDatePicker;

    /*BLOOD GROUP DROP DOWN*/
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    /*AS ON DATE PICKER*/
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement asOnDatePicker;

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

    /*ALERT SUCCESS TEXT*/
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement actualAlertSuccessText;

    /*BULK DELETE SUB MODULE*/
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    /*CLASS DROP DOWN*/
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDownBox;

    /*SECTION DROP DOWN*/
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDownBox;

    /*SEARCH BUTTON*/
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /*DELETE BUTTON*/
    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    /**
     * Find and return a WebElement using a dynamic locator based on the given text.
     *
     * @param text the text to be matched with the element text using contains()
     * @return the WebElement matching the dynamic locator
     */
    public static WebElement dynamicLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]//parent::tr/td/input"));
    }

    public WebElement findElementInTable(String text) {
        String dynamicXpath = "//*[contains(text(),'" + text + "')]//parent::tr/td";
        WebElement element = driver.findElement(By.xpath(dynamicXpath));
        return element;
    }

    public static WebElement dynamicLocatorByText(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /**
     * Finds and returns the dynamic locator for a checkbox based on the given text value.
     *
     * @param text the text value to be matched with the element text using contains()
     * @return the dynamic locator for the checkbox
     */
    public static String dynamicLocatorCheckBox(String text) {
        return "//*[contains(text(),'" + text + "')]//parent::tr/td/input";
    }

//    public static WebElement dynamicLocatorByText(String text) {
//        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
//    }
}