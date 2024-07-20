package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.LoginPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class Login_With_Invalid_Credentials_Steps {

    LoginPage loginPage = new LoginPage();

    @Then("user cannot Log in {string}")
    public void user_cannot_log_in(String expectedText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(loginPage.actualText.getText(), expectedText);
    }
}