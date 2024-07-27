package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
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

public class Verifying_Student_Data_Steps extends PageInitializer {

    @Then("clicks on Student Details sub module")
    public void clicks_on_student_details_sub_module() {
        StepsImplementation.clicks_on_student_details_sub_module();
    }

    @When("enters phone number {string}")
    public void enters_phone_number(String studentPhoneNumber) {
        StepsImplementation.enters_phone_number(studentPhoneNumber);
    }

    @When("clicks on Add More details")
    public void clicks_on_add_more_details() {
        StepsImplementation.clicks_on_add_more_details();
    }

    @When("clicks on the checkbox If Guardian Address is Current Address")
    public void clicks_on_the_checkbox_if_guardian_address_is_current_address() {
        StepsImplementation.clicks_on_the_checkbox_if_guardian_address_is_current_address();
    }

    @When("enters Bank Account Number {string}")
    public void enters_bank_account_number(String bankAccountNumber) {
        StepsImplementation.enters_bank_account_number(bankAccountNumber);
    }

    @When("enters Bank Name {string}")
    public void enters_bank_name(String bankNameText) {
        StepsImplementation.enters_bank_name(bankNameText);
    }

    @When("enters IFSC Code {string}")
    public void enters_ifsc_code(String ifscCodeText) {
        StepsImplementation.enters_ifsc_code(ifscCodeText);
    }

    @When("enters National Identification Number {string}")
    public void enters_national_identification_number(String nationalIdentificationNumber) {
        StepsImplementation.enters_national_identification_number(nationalIdentificationNumber);
    }

    @When("enters Local Identification Number {string}")
    public void enters_local_identification_number(String localIdentificationNumberText) {
        StepsImplementation.enters_local_identification_number(localIdentificationNumberText);
    }

    @When("clicks radio button {string}")
    public void clicks_radio_button(String radioButtonYesText) {
        StepsImplementation.clicks_radio_button(radioButtonYesText);
    }

    @When("enters Previous School Details {string}")
    public void enters_previous_school_details(String schoolInformationText) {
        StepsImplementation.enters_previous_school_details(schoolInformationText);
    }

    @When("enters a Note {string}")
    public void enters_a_note(String noteText) {
        StepsImplementation.enters_a_note(noteText);
    }

    @When("enters first Title of document {string}, {string}, {string}, {string}.")
    public void enters_first_title_of_document(String docOneText, String docTwoText, String docThreeText, String docFourText) {
        StepsImplementation.enters_first_title_of_document(docOneText, docTwoText, docThreeText, docFourText);
    }

    @When("uploads file one to Documents")
    public void uploads_file_one_to_Documents() {
        StepsImplementation.uploads_file_one_to_Documents();
    }

    @When("uploads file two to Documents")
    public void uploads_file_two_to_Documents() {
        StepsImplementation.uploads_file_two_to_Documents();
    }

    @When("uploads file three to Documents")
    public void uploads_file_three_to_Documents() {
        StepsImplementation.uploads_file_three_to_Documents();
    }

    @When("uploads file four to Documents")
    public void uploads_file_four_to_Documents() {
        StepsImplementation.uploads_file_four_to_Documents();
    }

    @Then("sends unique number to Search By Keyword text box {string}")
    public void sends_unique_number_to_search_by_keyword_text_box(String uniqNumber) {
        StepsImplementation.sends_unique_number_to_search_by_keyword_text_box(uniqNumber);
    }

    @When("upload Mother picture")
    public void upload_mother_picture() {
        StepsImplementation.upload_mother_picture();
    }

    @When("upload Student picture")
    public void upload_student_picture() {
        StepsImplementation.upload_student_picture();
    }

    @When("upload Father picture")
    public void upload_father_picture() {
        StepsImplementation.upload_father_picture();
    }

    @Then("all student data submitted with the record should display {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void all_student_data_submitted_with_the_record_should_display(String expectedUniqNumberText, String expectedNameText, String expectedClassText, String expectedFathersNameText, String expectedDateOfBirthText, String expectedGenderText, String expectedCategoryText, String expectedPhoneNumberText, String expectedHeightText, String expectedWeightText) {
        StepsImplementation.all_student_data_submitted_with_the_record_should_display(expectedUniqNumberText, expectedNameText, expectedClassText, expectedFathersNameText, expectedDateOfBirthText, expectedGenderText, expectedCategoryText, expectedPhoneNumberText, expectedHeightText, expectedWeightText);
    }
}