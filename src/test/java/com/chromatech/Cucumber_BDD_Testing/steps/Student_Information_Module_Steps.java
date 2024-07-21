package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentInformationModulePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class Student_Information_Module_Steps {

    StudentInformationModulePage studentInformationModulePage = new StudentInformationModulePage();

    @When("the user clicks on the Student Information module")
    public void the_user_clicks_on_the_student_information_module() {
        CommonMethods.click(studentInformationModulePage.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules display:")
    public void the_following_submodules_display(List<String> expectedSubmodules) {
        CucumberLogUtils.logScreenShot();
        List<String> actualSubmodules = studentInformationModulePage.getStudentSubModulesText();
        for (int i = 0; i < expectedSubmodules.size(); i++) {
            String expectedSubModuleText = expectedSubmodules.get(i);
            String actualSubModuleText = actualSubmodules.get(i);
            CommonMethods.assertEquals(actualSubModuleText, expectedSubModuleText);
        }
    }
}
