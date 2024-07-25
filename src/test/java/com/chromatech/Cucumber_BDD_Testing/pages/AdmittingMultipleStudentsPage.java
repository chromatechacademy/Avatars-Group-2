package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class AdmittingMultipleStudentsPage {

    public AdmittingMultipleStudentsPage() {
        PageFactory.initElements(driver, this);
    }
}