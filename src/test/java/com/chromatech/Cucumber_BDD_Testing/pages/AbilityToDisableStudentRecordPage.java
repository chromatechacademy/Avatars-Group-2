package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AbilityToDisableStudentRecordPage {

    public AbilityToDisableStudentRecordPage() {
        PageFactory.initElements(driver, this);
    }

    /*DISABLE BUTTON*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableButton;

    /*REASON DROP DOWN*/
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement reasonDropDown;

    /*SAVE BUTTON*/
    @FindBy(xpath = "//button[@data-loading-text=\"<i class='fa fa-spinner fa-spin '></i> Please wait\"]")
    public WebElement saveButton;

    /*DISABLED STUDENTS SUBMODULE*/
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentsSubmodule;

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
