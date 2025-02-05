package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class Student_Information_Module_Steps extends PageInitializer {

    @When("the user clicks on the Student Information module")
    public void the_user_clicks_on_the_student_information_module() {
        StepsImplementation.the_user_clicks_on_the_student_information_module();
    }

    @Then("the following submodules display:")
    public void the_following_submodules_display(List<String> expectedSubmodules) {
        StepsImplementation.the_following_submodules_display(expectedSubmodules);
    }
}