package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeworkModule_Steps extends PageInitializer {

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_homework_module() {
        StepsImplementation.the_user_clicks_on_the_homework_module();
    }

    @Then("the following module displays: {string}")
    public void the_following_module_displays(String addHomeworkBtn) {
        StepsImplementation.the_following_module_displays(addHomeworkBtn);
    }
}