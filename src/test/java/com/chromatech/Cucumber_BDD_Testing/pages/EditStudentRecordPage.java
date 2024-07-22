package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class EditStudentRecordPage {

    public EditStudentRecordPage() {
        PageFactory.initElements(driver, this);
    }

    /*STUDENT DETAILS SUB MODULE*/
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

    /*SEARCH BY KEYWORD TEX BOX*/
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextbox;

    /*SEARCH BY KEYWORD BUTTON*/
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchByKeywordButton;

    /*EDIT BUTTON*/
    @FindBy(xpath = "//td[@class='pull-right']//i[@class='fa fa-pencil']")
    public WebElement editButton;

    /*SHOW BUTTON*/
    @FindBy(xpath = "//td[@class='pull-right']//i[@class='fa fa-reorder']")
    public WebElement showButton;

    /*LAST NAME ON STUDENT PAGE*/
    @FindBy(xpath = "//h3[normalize-space()='Stanislav Gamon']")
    public WebElement updatedLastName;

    /*EMAIL ON STUDENT PAGE*/
    @FindBy(xpath = "//td[normalize-space()='stanislav.gomon@gmail.com']")
    public WebElement updatedEmail;

    /*FATHER NAME ON STUDENT PAGE*/
    @FindBy(xpath = "//td[normalize-space()='Carlos']")
    public WebElement updatedFathersName;



    /**
     * Finds and returns the WebElement of the dynamic delete record locator based on the provided text.
     *
     * @param text the text to be searched for in the record locator
     * @return the WebElement that represents the delete record locator
     */
    public static WebElement dynamicLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]//parent::tr/td/input"));
    }
}
