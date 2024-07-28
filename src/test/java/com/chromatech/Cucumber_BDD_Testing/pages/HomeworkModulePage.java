package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeworkModulePage {

    public HomeworkModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* HOMEWORK BUTTON */
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeworkBtn;

    /* ADD HOMEWORK BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement addHomeworkBtn;
}