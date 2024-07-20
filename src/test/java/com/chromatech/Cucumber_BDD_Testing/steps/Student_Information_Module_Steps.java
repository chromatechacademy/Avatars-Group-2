package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentInformationModulePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Student_Information_Module_Steps {

    StudentInformationModulePage studentInformationModulePage = new StudentInformationModulePage();

    @Given("a CTSMS user is on the dashboard page {string}")
    public void a_CTMS_user_is_on_the_dashboard_page(String url) {
        driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    @When("the user clicks on the Student Information module")
    public void the_user_clicks_on_the_student_information_module() {
        CommonMethods.click(studentInformationModulePage.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following submodules display:")
    public void the_following_submodules_display(List<String> expectedSubmodules) {
        List<String> actualSubmodules = studentInformationModulePage.getStudentSubModulesText();
        for (int i = 0; i < expectedSubmodules.size(); i++) {
            String expectedSubModuleText = expectedSubmodules.get(i);
            String actualSubModuleText = actualSubmodules.get(i);
            CommonMethods.assertEquals(actualSubModuleText, expectedSubModuleText);
        }
        CucumberLogUtils.logScreenShot();
    }
}
