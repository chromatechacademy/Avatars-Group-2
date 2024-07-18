package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class Login_Steps {

    PageInitializer pageInitializer = new PageInitializer();

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page (String url) {
        WebDriverUtils.setUp();
        WebDriverUtils.driver.get(url);
    }
    @When("the user enters{string} in udername text box")
    public void the_user_enters_username_in_udername_text_box(String usernameText){
        pageInitializer.usernameTextBox.sendKeys(usernameText);
        CommonMethods.waitForVisibility(pageInitializer.usernameTextBox);
        CommonMethods.sendKeys(pageInitializer.usernameTextBox, usernameText);
    }

}
