package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;

public class Login_With_Invalid_Credentials_Steps extends PageInitializer {

    @Then("user cannot Log in {string}")
    public void user_cannot_log_in(String expectedText) {
        StepsImplementation.user_cannot_log_in(expectedText);
    }
}