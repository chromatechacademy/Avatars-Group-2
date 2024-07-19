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
        CommonMethods.sleep(2000);
        humanResourceModule.humanResourceButton.click();
        CommonMethods.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String staffDirectorySubModule, String staffAttendanceSubModule, String payrollSubModule, String approveLeaveRequestSubModule, String applyLeaveSubModule, String leaveTypeSubModule, String teachersRatingSubModule, String departmentSubModule, String designationSubModule) {
        CommonMethods.assertEquals(humanResourceModule.staffDirectorySubModule.getText(), "Staff Directory");
        CommonMethods.assertEquals(humanResourceModule.staffAttendanceSubModule.getText(), "Staff Attendance");
        CommonMethods.assertEquals(humanResourceModule.payrollSubModule.getText(), "Payroll");
        CommonMethods.assertEquals(humanResourceModule.approveLeaveRequestSubModule.getText(), "Approve Leave Request");
        CommonMethods.assertEquals(humanResourceModule.applyLeaveSubModule.getText(), "Apply Leave");
        CommonMethods.assertEquals(humanResourceModule.leaveTypeSubModule.getText(), "Leave Type");
        CommonMethods.assertEquals(humanResourceModule.teachersRatingSubModule.getText(), "Teachers Rating");
        CommonMethods.assertEquals(humanResourceModule.departmentSubModule.getText(), "Department");
        CommonMethods.assertEquals(humanResourceModule.designationSubModule.getText(), "Designation");
    }
}
