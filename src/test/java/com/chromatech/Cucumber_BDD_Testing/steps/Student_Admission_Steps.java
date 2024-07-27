package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Admission_Steps extends PageInitializer {

    @When("user clicks on Student Information module")
    public void user_clicks_on_student_information_module() {
        StepsImplementation.user_clicks_on_student_information_module();
    }

    @When("clicks on Student Admission sub module")
    public void clicks_on_student_admission_sub_module() {
        StepsImplementation.clicks_on_student_admission_sub_module();
    }

    @When("enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String uniqNumber) {
        StepsImplementation.enters_unique_admission_number(uniqNumber);
    }

    @When("enters Roll Number {string}")
    public void enters_roll_number(String rollNumber) {
        StepsImplementation.enters_roll_number(rollNumber);
    }

    @When("selects {string} for class drop down")
    public void selects_for_class_drop_down(String classDropDownText) {
        StepsImplementation.selects_for_class_drop_down(classDropDownText);
    }

    @When("selects {string} for section drop down")
    public void selects_for_section_drop_down(String sectionDropDownText) {
        StepsImplementation.selects_for_section_drop_down(sectionDropDownText);
    }

    @When("enters first name {string}")
    public void enters_first_name(String firstNameText) {
        StepsImplementation.enters_first_name(firstNameText);
    }

    @When("enters last name {string}")
    public void enters_last_name(String lastNameText) {
        StepsImplementation.enters_last_name(lastNameText);
    }

    @When("selects {string} from gender drop down")
    public void selects_from_gender_drop_down(String genderDropDownText) {
        StepsImplementation.selects_from_gender_drop_down(genderDropDownText);
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String dateOfBirthText) {
        StepsImplementation.selects_for_date_of_birth_calendar(dateOfBirthText);
    }

    @When("selects {string} from category drop down")
    public void selects_from_category_drop_down(String categoryText) {
        StepsImplementation.selects_from_category_drop_down(categoryText);
    }

    @When("enters email {string}")
    public void enters_email(String emailText) {
        StepsImplementation.enters_email(emailText);
    }

    @When("selects {string} for Admission Date Calendar Day")
    public void selects_for_admission_date_calendar_day(String admissionDateText) {
        StepsImplementation.selects_for_admission_date_calendar_day(admissionDateText);
    }

    @When("selects {string} from Blood Group drop down")
    public void selects_from_blood_group_drop_down(String bloodGroupText) {
        StepsImplementation.selects_from_blood_group_drop_down(bloodGroupText);
    }

    @When("selects {string} for As on Date Calendar Day")
    public void selects_for_as_on_date_calendar_day(String asOnDateText) {
        StepsImplementation.selects_for_as_on_date_calendar_day(asOnDateText);
    }

    @When("enters a phone number {string}")
    public void enters_a_phone_number(String phoneNumberText) {
        StepsImplementation.enters_a_phone_number(phoneNumberText);
    }

    @When("enters a height {string}")
    public void enters_a_height(String heightText) {
        StepsImplementation.enters_a_height(heightText);
    }

    @When("enters a weight {string}")
    public void enters_a_weight(String weightText) {
        StepsImplementation.enters_a_weight(weightText);
    }

    @When("enters mother name {string}")
    public void enters_mother_name(String motherNameText) {
        StepsImplementation.enters_mother_name(motherNameText);
    }

    @When("enters mother phone number {string}")
    public void enters_mother_phone_number(String motherPhoneNumberText) {
        StepsImplementation.enters_mother_phone_number(motherPhoneNumberText);
    }

    @When("enters mother occupation {string}")
    public void enters_mother_occupation(String motherOccupationText) {
        StepsImplementation.enters_mother_occupation(motherOccupationText);
    }

    @When("selects Mother radio button for If guardian is field")
    public void selects_mother_radio_button_for_if_guardian_is_field() {
        StepsImplementation.selects_mother_radio_button_for_if_guardian_is_field();
    }

    @When("saves submission")
    public void saves_submission() {
        StepsImplementation.saves_submission();
    }

    @When("enters guardian address {string}")
    public void enters_guardian_address(String guardianAddressText) {
        StepsImplementation.enters_guardian_address(guardianAddressText);
    }

    @When("enters mother email {string}")
    public void enters_mother_email(String motherEmailText) {
        StepsImplementation.enters_mother_email(motherEmailText);
    }

    @When("enters father name {string}")
    public void enters_father_name(String fatherNameText) {
        StepsImplementation.enters_father_name(fatherNameText);
    }

    @When("enters father phone number {string}")
    public void enters_father_phone_number(String fatherPhoneNumberText) {
        StepsImplementation.enters_father_phone_number(fatherPhoneNumberText);
    }

    @When("enters father occupation {string}")
    public void enters_father_occupation(String fatherOccupationText) {
        StepsImplementation.enters_father_occupation(fatherOccupationText);
    }

    @Then("the student is successfully admitted {string}")
    public void the_student_is_successfully_admitted(String expectedAlertSuccessText) {
        StepsImplementation.the_student_is_successfully_admitted(expectedAlertSuccessText);
    }

    @When("the user is on the {string} page")
    public void the_user_is_on_the_page(String urlPage) {
        StepsImplementation.the_user_is_on_the_page(urlPage);
    }

    @Then("user clicks on the Bulk Delete submodule")
    public void user_clicks_on_the_bulk_delete_submodule() {
        StepsImplementation.user_clicks_on_the_bulk_delete_submodule();
    }

    @Then("selects {string} for the class drop-down")
    public void selects_for_the_class_drop_down(String sdetText) {
        StepsImplementation.selects_for_the_class_drop_down(sdetText);
    }

    @Then("selects {string} for the section drop-down")
    public void selects_for_the_section_drop_down(String cucumberFundamentalsText) {
        StepsImplementation.selects_for_the_section_drop_down(cucumberFundamentalsText);
    }

    @Then("clicks on the Search button")
    public void clicks_on_the_search_button() {
        StepsImplementation.clicks_on_the_search_button();
    }

    @When("clicks on the checkbox with the unique admission number {string}")
    public void clicks_on_the_checkbox_with_the_unique_admission_number(String uniqAdmissionNumber) {
        StepsImplementation.clicks_on_the_checkbox_with_the_unique_admission_number(uniqAdmissionNumber);
    }

    @When("clicks the Delete button and accepting alert {string}")
    public void clicks_the_delete_button_and_accepting_alert(String expectedAlertText) {
        StepsImplementation.clicks_the_delete_button_and_accepting_alert(expectedAlertText);
    }

    @When("if the record admission number {string} exists user clicks on the checkbox")
    public void if_the_record_admission_number_exists_user_clicks_on_the_checkbox(String admissionNumber) {
        StepsImplementation.if_the_record_admission_number_exists_user_clicks_on_the_checkbox(admissionNumber);
    }

    @When("if the unique admission number exists clicks the Delete button and accepting alert {string}")
    public void if_the_unique_admission_number_exists_clicks_the_delete_button_and_accepting_alert(String expectedAlertText) {
        StepsImplementation.if_the_unique_admission_number_exists_clicks_the_delete_button_and_accepting_alert(expectedAlertText);
    }
}
