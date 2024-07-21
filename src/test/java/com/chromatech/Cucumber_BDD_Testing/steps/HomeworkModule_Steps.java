package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.HomeworkModulePage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeworkModule_Steps {

    HomeworkModulePage homeworkModulePage = new HomeworkModulePage();

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_homework_module() {
        homeworkModulePage.homeworkBtn.click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the following module displays: {string}")
    public void the_following_module_displays(String addHomeworkBtn) {
        CommonMethods.assertEquals(homeworkModulePage.addHomeworkBtn.getText(), addHomeworkBtn);
        CucumberLogUtils.logScreenShot();
    }
}