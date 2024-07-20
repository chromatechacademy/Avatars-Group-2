package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeworkModule {
    public HomeworkModule() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*Homework Button*/
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeworkBtn;

    /*Add Homework Button*/
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement addHomeworkBtn;
}