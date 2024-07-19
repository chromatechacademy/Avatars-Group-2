package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.HumanResourceModule;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human_Resource_module_Steps {

    HumanResourceModule humanResourceModule = new HumanResourceModule();

    @When("the user clicks on the Human Resource module")
    public void the_user_clicks_on_the_human_resource_module() {
        JavascriptMethods.scrollDown(200);
        CommonMethods.waitForClickability(humanResourceModule.humanResourceButton);
        humanResourceModule.humanResourceButton.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedStaffDirectoryText, String expectedStaffAttendanceText, String expectedPayrollText, String expectedApproveLeaveRequestText, String expectedApplyLeaveText, String expectedLeaveTypeText, String expectedTeachersRatingText, String expectedDepartmentText, String expectedDesignationText) {
        CommonMethods.assertEquals(humanResourceModule.staffDirectorySubModule.getText(), expectedStaffDirectoryText);
        CommonMethods.assertEquals(humanResourceModule.staffAttendanceSubModule.getText(), expectedStaffAttendanceText);
        CommonMethods.assertEquals(humanResourceModule.payrollSubModule.getText(), expectedPayrollText);
        CommonMethods.assertEquals(humanResourceModule.approveLeaveRequestSubModule.getText(), expectedApproveLeaveRequestText);
        CommonMethods.assertEquals(humanResourceModule.applyLeaveSubModule.getText(), expectedApplyLeaveText);
        CommonMethods.assertEquals(humanResourceModule.leaveTypeSubModule.getText(), expectedLeaveTypeText);
        CommonMethods.assertEquals(humanResourceModule.teachersRatingSubModule.getText(), expectedTeachersRatingText);
        CommonMethods.assertEquals(humanResourceModule.departmentSubModule.getText(), expectedDepartmentText);
        CommonMethods.assertEquals(humanResourceModule.designationSubModule.getText(), expectedDesignationText);
    }
}
