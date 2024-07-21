package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.StudentAdmissionWithUniqueNumberPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class Student_Admission_with_Unique_Number_Steps {

    StudentAdmissionWithUniqueNumberPage studentAdmissionWithUniqueNumberPage = new StudentAdmissionWithUniqueNumberPage();

    @Then("the user is given the message {string}")
    public void the_user_is_given_the_message(String expectedText) {
        CommonMethods.assertEquals(studentAdmissionWithUniqueNumberPage.actualText.getText(), expectedText);
        CucumberLogUtils.logScreenShot();
    }
}