package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Academics_Module_Steps extends PageInitializer {

    @When("the user navigates to the Academics Module")
    public void the_user_navigates_to_the_academics_module() {
        StepsImplementation.the_user_navigates_to_the_academics_module();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedClassTimetableSubmoduleText, String expectedTeacherTimetableSubmoduleText, String expectedAssignClassTeacherSubmoduleText, String expectedPromoteStudentSubmoduleText, String expectedSubjectGroupSubmoduleText, String expectedSubjectsSubmoduleText, String expectedClassSubmoduleText, String expectedSectionsSubmoduleText) {
        StepsImplementation.the_following_submodules_are_displayed(expectedClassTimetableSubmoduleText, expectedTeacherTimetableSubmoduleText, expectedAssignClassTeacherSubmoduleText, expectedPromoteStudentSubmoduleText, expectedSubjectGroupSubmoduleText, expectedSubjectsSubmoduleText, expectedClassSubmoduleText, expectedSectionsSubmoduleText);
    }
}