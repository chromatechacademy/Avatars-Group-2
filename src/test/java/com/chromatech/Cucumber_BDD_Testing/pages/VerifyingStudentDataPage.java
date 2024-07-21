package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class VerifyingStudentDataPage {

    public VerifyingStudentDataPage() {
        PageFactory.initElements(driver, this);
    }

    /*STUDENT DETAILS SUB MODULE*/
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

    /*STUDENT PHONE NUMBER*/
    @FindBy(xpath = "(//input[@name='custom_fields[students][1]'])[1]")
    public WebElement studentPhoneNumber;



















    /**
     * Returns the WebElement based on the dynamic xpath with index.
     *
     * @param number The dynamic value for xpath.
     * @return The WebElement matching the given dynamic xpath and index.
     */
    public static WebElement dynamicXpathByIndex(String number) {
        return driver.findElement(By.xpath("//td[text()='" + number + "']//parent::tr/td[1]"));
    }







}
