package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.StudentAdmissionPage;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.VerifyingStudentDataPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;

public class Verifying_Student_Data_Steps {

VerifyingStudentDataPage verifyingStudentDataPage = new VerifyingStudentDataPage();
StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

//    @Then("clicks on Student Details sub module")
//    public void clicks_on_student_details_sub_module() {
//      CommonMethods.wait
//        CommonMethods.click(verifyingStudentDataPage.studentDetailsSubmodule);
//        CommonMethods.sleep(3000);
//    }

    @Then("clicks on {string} sub module")
    public void clicks_on_sub_module(String studentDetailsText) {
//    CommonMethods.waitForThePresenceOfEl(studentAdmissionPage.dynamicLocator(studentDetailsText);
//    CommonMethods.click(studentAdmissionPage.dynamicLocator(studentDetailsText));


        CommonMethods.waitForThePresenceOfEl("//li[@class='active']//a[normalize-space()='Student Details']",);
    CucumberLogUtils.logScreenShot();
    CommonMethods.sleep(3000);


    }
}
