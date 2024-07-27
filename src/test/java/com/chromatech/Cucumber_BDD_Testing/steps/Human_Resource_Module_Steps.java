package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human_Resource_Module_Steps extends PageInitializer {

    @When("the user clicks on the Human Resource module")
    public void the_user_clicks_on_the_human_resource_module() {
        StepsImplementation.the_user_clicks_on_the_human_resource_module();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedStaffDirectoryText, String expectedStaffAttendanceText, String expectedPayrollText, String expectedApproveLeaveRequestText, String expectedApplyLeaveText, String expectedLeaveTypeText, String expectedTeachersRatingText, String expectedDepartmentText, String expectedDesignationText) {
        StepsImplementation.the_following_submodules_are_displayed(expectedStaffDirectoryText, expectedStaffAttendanceText, expectedPayrollText, expectedApproveLeaveRequestText, expectedApplyLeaveText, expectedLeaveTypeText, expectedTeachersRatingText, expectedDepartmentText, expectedDesignationText);
    }
}