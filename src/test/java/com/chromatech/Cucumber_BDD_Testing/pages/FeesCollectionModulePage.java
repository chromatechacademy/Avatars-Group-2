package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class FeesCollectionModulePage {

    /* FEES COLLECTION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    /* COMMON PATH FOR ALL FEES COLLECTION SUBMODULES */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a")
    public List<WebElement> feesCollectionModules;

    public FeesCollectionModulePage() {
        PageFactory.initElements(driver, this);
    }
}
