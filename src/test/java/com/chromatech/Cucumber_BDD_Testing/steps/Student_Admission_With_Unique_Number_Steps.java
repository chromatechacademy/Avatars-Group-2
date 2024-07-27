package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;

public class Student_Admission_With_Unique_Number_Steps extends PageInitializer {

    @Then("the user is given the message {string}")
    public void the_user_is_given_the_message(String expectedText) {
        StepsImplementation.the_user_is_given_the_message(expectedText);
    }
}