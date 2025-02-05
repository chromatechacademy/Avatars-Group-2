package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class VerifyingStudentDataPage {

    public VerifyingStudentDataPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* STUDENT DETAILS SUB MODULE */
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

    /* STUDENT PHONE NUMBER */
    @FindBy(xpath = "(//input[@name='custom_fields[students][1]'])[1]")
    public WebElement studentPhoneNumber;

    /* ADD MORE DETAILS MODULE */
    @FindBy(xpath = "//a[normalize-space()='Add More Details']")
    public WebElement addMoreDetailsModule;

    /* IF GUARDIAN ADDRESS IS CURRENT ADDRESS CHECK BOX */
    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement currentAddressCheckBox;

    /* BANK ACCOUNT TEXT BOX */
    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountTextBox;

    /* BANK NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameBox;

    /* IFSC CODE TEXT BOX */
    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement ifscCodeBox;

    /* NATIONAL IDENTIFICATION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIdentificationNumberTextBox;

    /* LOCAL IDENTIFICATION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIdentificationNumberTextBox;

    /* PREVIOUS SCHOOL INFORMATION TEXT BOX */
    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolInformationTextBox;

    /* NOTE TEXT BOX */
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    /* STUDENT PHOTO BOX */
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhotoBox;

    /* FATHER PHOTO BOX */
    @FindBy(xpath = "(//input[@id='file'])[2]")
    public WebElement fatherPhotoBox;

    /* MOTHER PHOTO BOX */
    @FindBy(xpath = "(//input[@id='file'])[3]")
    public WebElement motherPhotoBox;

    /* DOCUMENT BOX 1 */
    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement documentBoxOne;

    /* DOCUMENT BOX 2 */
    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement documentBoxTwo;

    /* DOCUMENT BOX 3 */
    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement documentBoxThree;

    /* DOCUMENT BOX 4 */
    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement documentBoxFour;

    /* SEARCH BY KEYWORD TEXT BOX */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    /* LOCATOR FOR THE FIRST DOCUMENT TITLE TEXT BOX */
    @FindBy(xpath = "//input[@name='first_title']")
    public WebElement firstTitleTextBox;

    /* LOCATOR FOR THE SECOND DOCUMENT TITLE TEXT BOX */
    @FindBy(xpath = "//input[@name='second_title']")
    public WebElement secondTitleTextBox;

    /* LOCATOR FOR THE THIRD DOCUMENT TITLE TEXT BOX */
    @FindBy(xpath = "//input[@name='fourth_title']")
    public WebElement thirdTitleTextBox;

    /* LOCATOR FOR THE FOURTH DOCUMENT TITLE TEXT BOX */
    @FindBy(xpath = "//input[@name='fifth_title']")
    public WebElement fourthTitleTextBox;

    /**
     * Finds and returns the dynamic locator for the student details based on the given text value.
     *
     * @param text the text value to be matched with the element text using contains()
     * @return the list of WebElements
     */
    public List<WebElement> dynamicLocator(String text) {
        return driver.findElements(By.xpath("//*[contains(text(),\"" + text + "\")]"));
    }
}