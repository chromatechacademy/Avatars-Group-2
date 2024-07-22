package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class VerifyingStudentDataPage {

    public VerifyingStudentDataPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*STUDENT DETAILS SUB MODULE*/
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

    /*STUDENT PHONE NUMBER*/
    @FindBy(xpath = "(//input[@name='custom_fields[students][1]'])[1]")
    public WebElement studentPhoneNumber;

    /*ADD MORE DETAILS MODULE*/
    @FindBy(xpath = "//a[normalize-space()='Add More Details']")
    public WebElement addMoreDetailsModule;

    /*IF GUARDIAN ADDRESS IS CURRENT ADDRESS CHECK BOX*/
    @FindBy(xpath = "//input[@id='autofill_current_address']")
    public WebElement currentAddressCheckBox;

    /*BANK ACCOUNT TEXT BOX*/
    @FindBy(xpath = "//input[@id='bank_account_no']")
    public WebElement bankAccountTextBox;

    /*BANK NAME TEXT BOX*/
    @FindBy(xpath = "//input[@id='bank_name']")
    public WebElement bankNameBox;

    /*IFSC CODE TEXT BOX*/
    @FindBy(xpath = "//input[@id='ifsc_code']")
    public WebElement ifscCodeBox;

    /*NATIONAL IDENTIFICATION NUMBER TEXT BOX*/
    @FindBy(xpath = "//input[@id='adhar_no']")
    public WebElement nationalIdentificationNumberTextBox;

    /*LOCAL IDENTIFICATION NUMBER TEXT BOX*/
    @FindBy(xpath = "//input[@id='samagra_id']")
    public WebElement localIdentificationNumberTextBox;

    /*PREVIOUS SCHOOL INFORMATION TEXT BOX*/
    @FindBy(xpath = "//textarea[@name='previous_school']")
    public WebElement previousSchoolInformationTextBox;

    /*NOTE TEXT BOX*/
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    /*STUDENT PHOTO BOX*/
    @FindBy(xpath = "(//input[@id='file'])[1]")
    public WebElement studentPhotoBox;

    /*FATHER PHOTO BOX*/
    @FindBy(xpath = "(//input[@id='file'])[2]")
    public WebElement fatherPhotoBox;

    /*MOTHER PHOTO BOX*/
    @FindBy(xpath = "(//input[@id='file'])[3]")
    public WebElement motherPhotoBox;

    /*DOCUMENT BOX 1*/
    @FindBy(xpath = "//input[@name='first_doc']")
    public WebElement documentBoxOne;

    /*DOCUMENT BOX 2*/
    @FindBy(xpath = "//input[@name='second_doc']")
    public WebElement documentBoxTwo;

    /*DOCUMENT BOX 3*/
    @FindBy(xpath = "//input[@name='fourth_doc']")
    public WebElement documentBoxThree;

    /*DOCUMENT BOX 4*/
    @FindBy(xpath = "//input[@name='fifth_doc']")
    public WebElement documentBoxFour;

    /*SEARCH BY KEYWORD TEXT BOX*/
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    public static String locatorForFile(String file){
        return System.getProperty("user.dir")+ file;
    }

    public List<WebElement> dynamicLocator(String text) {
        return driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /**
     * Sends text to four documents.
     *
     * @param docOneText   The text to be sent to the first document.
     * @param docTwoText   The text to be sent to the second document.
     * @param docThreeText The text to be sent to the third document.
     * @param docFourText  The text to be sent to the fourth document.
     */
    public static void sendTextToFourDocuments(String docOneText, String doxTwoText, String docThreeText, String docFourText) {
        ArrayList<String> docs = new ArrayList<>();
        docs.add(docOneText);
        docs.add(doxTwoText);
        docs.add(docThreeText);
        docs.add(docFourText);
        for (int i = 0; i < docs.size(); i++) {
            WebElement textBox = driver.findElement(By.xpath("(//input[contains(@name,'title')])[" + (i + 1) + "]"));
            textBox.sendKeys(docs.get(i));
        }
    }
}