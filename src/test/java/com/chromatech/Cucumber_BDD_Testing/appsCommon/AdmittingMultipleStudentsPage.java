package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class VerifyingStudentDataPage {

    public VerifyingStudentDataPage() {
        PageFactory.initElements(driver, this);
    }

    /*STUDENT DETAILS SUBMODULE*/
    @FindBy(xpath = "//li[@class='active']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubmodule;
}
