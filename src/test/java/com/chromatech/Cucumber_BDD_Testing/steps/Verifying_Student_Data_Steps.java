package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.VerifyingStudentDataPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.FrameworkConstants;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import static com.chromatech.Cucumber_BDD_Testing.appsCommon.Constants.*;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Verifying_Student_Data_Steps {

    VerifyingStudentDataPage verifyingStudentDataPage = new VerifyingStudentDataPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Then("clicks on Student Details sub module")
    public void clicks_on_student_details_sub_module() {
        CommonMethods.waitForClickability(verifyingStudentDataPage.studentDetailsSubModule);
        CommonMethods.click(verifyingStudentDataPage.studentDetailsSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters phone number {string}")
    public void enters_phone_number(String studentPhoneNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.studentPhoneNumber, studentPhoneNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Add More details")
    public void clicks_on_add_more_details() {
        CommonMethods.click(verifyingStudentDataPage.addMoreDetailsModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the checkbox If Guardian Address is Current Address")
    public void clicks_on_the_checkbox_if_guardian_address_is_current_address() {
        CommonMethods.click(verifyingStudentDataPage.currentAddressCheckBox);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Bank Account Number {string}")
    public void enters_bank_account_number(String bankAccountNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.bankAccountTextBox, bankAccountNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Bank Name {string}")
    public void enters_bank_name(String bankNameText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.bankNameBox, bankNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters IFSC Code {string}")
    public void enters_ifsc_code(String ifscCodeText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.ifscCodeBox, ifscCodeText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters National Identification Number {string}")
    public void enters_national_identification_number(String nationalIdentificationNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.nationalIdentificationNumberTextBox, nationalIdentificationNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Local Identification Number {string}")
    public void enters_local_identification_number(String localIdentificationNumberText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.localIdentificationNumberTextBox, localIdentificationNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks radio button {string}")
    public void clicks_radio_button(String radioButtonYesText) {
        CommonMethods.click(studentAdmissionPage.dynamicLocatorByText(radioButtonYesText));
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Previous School Details {string}")
    public void enters_previous_school_details(String schoolInformationText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.previousSchoolInformationTextBox, schoolInformationText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a Note {string}")
    public void enters_a_note(String noteText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.noteTextBox, noteText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters first Title of document {string}, {string}, {string}, {string}.")
    public void enters_first_title_of_document(String docOneText, String docTwoText, String docThreeText, String docFourText) {
        ArrayList<String> docs = new ArrayList<>();
        docs.add(docOneText);
        docs.add(docTwoText);
        docs.add(docThreeText);
        docs.add(docFourText);
        verifyingStudentDataPage.firstTitleTextBox.sendKeys(docs.get(0));
        verifyingStudentDataPage.secondTitleTextBox.sendKeys(docs.get(1));
        verifyingStudentDataPage.thirdTitleTextBox.sendKeys(docs.get(2));
        verifyingStudentDataPage.fourthTitleTextBox.sendKeys(docs.get(3));
        CucumberLogUtils.logScreenShot();
    }

    @When("uploads file one to Documents")
    public void uploads_file_one_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxOne, DOCUMENT_ONE_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @When("uploads file two to Documents")
    public void uploads_file_two_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxTwo, DOCUMENT_TWO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @When("uploads file three to Documents")
    public void uploads_file_three_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxThree, DOCUMENT_THREE_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @When("uploads file four to Documents")
    public void uploads_file_four_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxFour, DOCUMENT_FOUR_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @Then("sends unique number to Search By Keyword text box {string}")
    public void sends_unique_number_to_search_by_keyword_text_box(String uniqNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.searchByKeywordTextBox, uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload Mother picture")
    public void upload_mother_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.motherPhotoBox, MOTHER_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload Student picture")
    public void upload_student_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.studentPhotoBox, STUDENT_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload Father picture")
    public void upload_father_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.fatherPhotoBox, FATHER_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    @Then("all student data submitted with the record should display {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void all_student_data_submitted_with_the_record_should_display(String expectedUniqNumberText, String expectedNameText, String expectedClassText, String expectedFathersNameText, String expectedDateOfBirthText, String expectedGenderText, String expectedCategoryText, String expectedPhoneNumberText, String expectedHeightText, String expectedWeightText) {
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add(expectedUniqNumberText);
        dataList.add(expectedNameText);
        dataList.add(expectedClassText);
        dataList.add(expectedFathersNameText);
        dataList.add(expectedDateOfBirthText);
        dataList.add(expectedGenderText);
        dataList.add(expectedCategoryText);
        dataList.add(expectedPhoneNumberText);
        dataList.add(expectedHeightText);
        dataList.add(expectedWeightText);
        for (String expectedText : dataList) {
            List<WebElement> elements = verifyingStudentDataPage.dynamicLocator(expectedText);
            boolean found = false;
            for (WebElement element : elements) {
                if (element.getText().equals(expectedText)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new AssertionError("Expected text: " + expectedText + " not found on the webpage.");
            }
        }
        CucumberLogUtils.logScreenShot();
    }
}