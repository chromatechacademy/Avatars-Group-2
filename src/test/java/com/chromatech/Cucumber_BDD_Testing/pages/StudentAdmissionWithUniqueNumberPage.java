package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionWithUniqueNumberPage {

    public StudentAdmissionWithUniqueNumberPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    //*ACTUAL TEXT*//
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement actualText;
}