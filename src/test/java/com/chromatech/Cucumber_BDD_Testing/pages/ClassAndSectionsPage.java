package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
     * Finds and returns a WebElement using a dynamic locator based on the index.
     * The method searches for an input element located after the text "Sections" and its following sibling div.
     * The index parameter specifies the position of the input element to be found.
     *
     * @param number the index of the input element to be found
     * @return the WebElement representing the input element at the specified index
     */
    public static WebElement dynamicLocatorByIndex(Integer number) {
        return WebDriverUtils.driver.findElement(By.xpath("((//*[contains(text(),'Sections')])[2]/following-sibling::div/label/input)[" + number + "]"));
    }






//Cyber Security
//  (//*[contains(text(),'Cyber Security')]/following-sibling::td/div)[1]


//SDET
// (//*[contains(text(),'SDET')]/following-sibling::td/div)[1]
}
