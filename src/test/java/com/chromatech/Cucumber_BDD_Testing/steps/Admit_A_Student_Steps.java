package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admit_A_Student_Steps {

    PageInitializer pageInitializer = new PageInitializer();

    @When("user clicks on Student Information module")
    public void user_clicks_on_student_information_module() {
        CommonMethods.click(pageInitializer.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Student Admission sub module")
    public void clicks_on_student_admission_sub_module() {
        CommonMethods.click(pageInitializer.studentAdmissionSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String uniqNumber) {
        CommonMethods.sendKeys(pageInitializer.admissionTextBox, uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Roll Number {string}")
    public void enters_roll_number(String rollNumber) {
        CommonMethods.sendKeys(pageInitializer.rollNumberTextBox, rollNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for class drop down")
    public void selects_for_class_drop_down(String classDropDownText) {
        CommonMethods.selectDropDownValue(classDropDownText, pageInitializer.classDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for section drop down")
    public void selects_for_section_drop_down(String sectionDropDownText) {
        CommonMethods.selectDropDownValue(sectionDropDownText, pageInitializer.sectionDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters first name {string}")
    public void enters_first_name(String firstNameText) {
        CommonMethods.sendKeys(pageInitializer.firstNameTextBox, firstNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters last name {string}")
    public void enters_last_name(String lastNameText) {
        CommonMethods.sendKeys(pageInitializer.lastNameTextBox, lastNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from gender drop down")
    public void selects_from_gender_drop_down(String genderDropDownText) {
        CommonMethods.selectDropDownValue(genderDropDownText, pageInitializer.genderDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String dateOfBirthText) {
        JavascriptMethods.selectDateByJS(pageInitializer.dateOfBirthDayPicker, dateOfBirthText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from category drop down")
    public void selects_from_category_drop_down(String categoryText) {
        CommonMethods.selectDropDownValue(categoryText, pageInitializer.categoryDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters email {string}")
    public void enters_email(String emailText) {
        CommonMethods.sendKeys(pageInitializer.emailTextBox, emailText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for Admission Date Calendar Day")
    public void selects_for_admission_date_calendar_day(String admissionDateText) {
        JavascriptMethods.selectDateByJS(pageInitializer.admissionDateDayPicker, admissionDateText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from Blood Group drop down")
    public void selects_from_blood_group_drop_down(String bloodGroupText) {
        CommonMethods.selectDropDownValue(bloodGroupText, pageInitializer.bloodGroupDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for As on Date Calendar Day")
    public void selects_for_as_on_date_calendar_day(String asOnDateText) {
        JavascriptMethods.selectDateByJS(pageInitializer.asOnDateDayPicker, asOnDateText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a phone number {string}")
    public void enters_a_phone_number(String phoneNumberText) {
        CommonMethods.sendKeys(pageInitializer.phoneNumberTextBox, phoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a height {string}")
    public void enters_a_height(String heightText) {
        CommonMethods.sendKeys(pageInitializer.heightTextBox, heightText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a weight {string}")
    public void enters_a_weight(String weightText) {
        CommonMethods.sendKeys(pageInitializer.weightTextBox, weightText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother name {string}")
    public void enters_mother_name(String motherNameText) {
        CommonMethods.sendKeys(pageInitializer.motherNameTextBox, motherNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother phone number {string}")
    public void enters_mother_phone_number(String motherPhoneNumberText) {
        CommonMethods.sendKeys(pageInitializer.motherPhoneNumberTextBox, motherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother occupation {string}")
    public void enters_mother_occupation(String motherOccupationText) {
        CommonMethods.sendKeys(pageInitializer.motherOccupationTextBox, motherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects Mother radio button for If guardian is field")
    public void selects_mother_radio_button_for_if_guardian_is_field() {
        CommonMethods.click(pageInitializer.radioButtonMother);
        CucumberLogUtils.logScreenShot();
    }

    @When("saves submission")
    public void saves_submission() {
        JavascriptMethods.scrollIntoView(pageInitializer.saveButton);
        CommonMethods.click(pageInitializer.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters guardian address {string}")
    public void enters_guardian_address(String guardianAddressText) {
        CommonMethods.sendKeys(pageInitializer.guardianAddressTextBox, guardianAddressText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother email {string}")
    public void enters_mother_email(String motherEmailText) {
        CommonMethods.sendKeys(pageInitializer.motherEmailTextbox, motherEmailText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father name {string}")
    public void enters_father_name(String fatherNameText) {
        CommonMethods.sendKeys(pageInitializer.fatherNameTextbox, fatherNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father phone number {string}")
    public void enters_father_phone_number(String fatherPhoneNumberText) {
        CommonMethods.sendKeys(pageInitializer.fatherPhoneNumberTextbox, fatherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father occupation {string}")
    public void enters_father_occupation(String fatherOccupationText) {
        CommonMethods.sendKeys(pageInitializer.fatherOccupationTextbox, fatherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the student is successfully admitted {string}")
    public void the_student_is_successfully_admitted(String expectedText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(pageInitializer.actualText.getText(), expectedText);
    }

}
