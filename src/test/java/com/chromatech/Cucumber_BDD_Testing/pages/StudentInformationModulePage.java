package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
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

    /**
     * Retrieves the text of all student sub-module elements.
     *
     * @return a list of strings containing the text of each student sub-module.
     */
    public List<String> getStudentSubModulesText() {
        List<String> texts = new ArrayList<>();
        for (WebElement element : studentSubModules) {
            texts.add(element.getText());
        }
        return texts;
    }
}
