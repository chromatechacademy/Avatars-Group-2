package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentInformationModulePage {

    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* COMMON PATH FOR ALL STUDENT SUB MODULES */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a")
    public List<WebElement> studentSubModules;

    public StudentInformationModulePage() {
        PageFactory.initElements(driver, this);
    }
}
