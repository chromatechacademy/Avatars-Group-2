package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.VerifyingStudentDataPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class Verifying_Student_Data_Steps {

    VerifyingStudentDataPage verifyingStudentDataPage = new VerifyingStudentDataPage();

    @Then("clicks on Student Details sub module")
    public void clicks_on_student_details_sub_module() {
        CommonMethods.click(verifyingStudentDataPage.studentDetailsSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters phone number {string}")
    public void enters_phone_number(String studentPhoneNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.studentPhoneNumber, studentPhoneNumber);
        CucumberLogUtils.logScreenShot();
    }



















    @Then("all student data submitted with the record should display {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void all_student_data_submitted_with_the_record_should_display(String expectedUniqNumberText, String expectedNameText, String expectedClassText, String expectedFathersNameText, String expectedDateOfBirthText, String expectedGenderText, String expectedCategoryText, String expectedHeightText, String expectedWeightText) {
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add(expectedUniqNumberText);
        dataList.add(expectedNameText);
        dataList.add(expectedClassText);
        dataList.add(expectedFathersNameText);
        dataList.add(expectedDateOfBirthText);
        dataList.add(expectedGenderText);
        dataList.add(expectedCategoryText);
        dataList.add(expectedHeightText);
        dataList.add(expectedWeightText);

//        List<WebElement> studentDataList = studentAdmissionPage.dynamicLocator("//td[contains(text(),'" + dataList.get(0) + "')]");
//        for (WebElement element : studentDataList) {
//            String actualText = element.getText();
//            CommonMethods.assertTrue(dataList.contains(actualText));
//        }


    }
}