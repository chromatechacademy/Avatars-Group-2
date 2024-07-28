package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class ClassAndSectionsPage {

    public ClassAndSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /*CLASS SUBMODULE*/
    @FindBy(xpath = "(//*[contains(text(),'Class')])[4]")
    public WebElement classSubModule;

    /*CYBER SECURITY*/
    @FindBy(xpath = "//input[@id='class']")
    public WebElement cyberSecurityClass;

    /*NETWORKING FUNDAMENTALS CHECKBOX*/
    @FindBy(xpath = "//input[@value='306']")
    public WebElement networkingFundamentalsCheckbox;

    /*LINUX FUNDAMENTALS CHECKBOX*/
    @FindBy(xpath = "//input[@value='307']")
    public WebElement linuxFundamentalsCheckbox;

    /*CIA TRIAD CHECKBOX*/
    @FindBy(xpath = "//input[@value='308']")
    public WebElement ciaTriadCheckbox;

    /*PENETRATION TESTING/ETHICAL HACKING CHECKBOX*/
    @FindBy(xpath = "//input[@value='24']")
    public WebElement penetrationTestingEthicalHackingCheckbox;

    /*SAVE BUTTON*/
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /*ACTUAL ALERT SAVE TEXT*/
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement actualAlertSaveText;

    /**
     * Finds a WebElement in a table to delete based on the given text.
     *
     * @param text the text to search for in the table
     * @return the WebElement to delete
     */
    public WebElement findElementInTableDelete(String text) {
        String dynamicXpath = "//*[contains(text(),'" + text + "')]/following-sibling::td/following-sibling::td/a/following-sibling::a/i";
        WebElement element = driver.findElement(By.xpath(dynamicXpath));
        return element;
    }
}