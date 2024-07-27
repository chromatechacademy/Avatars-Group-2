package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Academics_Module_Steps extends PageInitializer {

    @When("the user navigates to the Academics Module")
    public void the_user_navigates_to_the_academics_module() {
        CommonMethods.click(academicsModulePage.academicsModule);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules are displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_submodules_are_displayed(String expectedClassTimetableSubmoduleText, String expectedTeacherTimetableSubmoduleText, String expectedAssignClassTeacherSubmoduleText, String expectedPromoteStudentSubmoduleText, String expectedSubjectGroupSubmoduleText, String expectedSubjectsSubmoduleText, String expectedClassSubmoduleText, String expectedSectionsSubmoduleText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(academicsModulePage.classTimetableSubmodule.getText(), expectedClassTimetableSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.teacherTimetableSubmodule.getText(), expectedTeacherTimetableSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.assignClassTeacherSubmodule.getText(), expectedAssignClassTeacherSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.promoteStudentsSubmodule.getText(), expectedPromoteStudentSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.subjectGroupSubmodule.getText(), expectedSubjectGroupSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.subjectsSubmodule.getText(), expectedSubjectsSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.classSubmodule.getText(), expectedClassSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.sectionsSubmodule.getText(), expectedSectionsSubmoduleText);
    }
}