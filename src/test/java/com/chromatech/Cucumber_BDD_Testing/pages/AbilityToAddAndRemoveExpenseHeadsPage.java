package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AbilityToAddAndRemoveExpenseHeadsPage {

    public AbilityToAddAndRemoveExpenseHeadsPage() {
        PageFactory.initElements(driver, this);
    }

    //Expense Head Submodule
    @FindBy(xpath = "//a[normalize-space()='Expense Head']//i[@class='fa fa-angle-double-right']")
    public WebElement expenseHeadSubmodule;

    //Expense Head Text Box
    @FindBy(xpath = "//input[@name='expensehead']")
    public WebElement expenseHeadTextBox;

    //Expense Head Description text box
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement expenseHeadDescription;

    //Save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    // Alert Success text
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement actualAlertSuccessText;

    /**
     * Finds and returns a WebElement that contains the specified text using a dynamic XPath locator.
     *
     * @param text The text to search for in the WebElement.
     * @return The WebElement that contains the specified text.
     */
    public static WebElement dynamicLocatorDeleteExpenseText(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("(//*[contains(text(),'" + text + "')]//parent::td/following-sibling::td/a)[2]"));
    }
}