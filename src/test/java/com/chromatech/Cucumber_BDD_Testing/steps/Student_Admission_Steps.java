package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.StudentAdmissionPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Student_Admission_Steps {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @When("user clicks on Student Information module")
    public void user_clicks_on_student_information_module() {
        CommonMethods.click(studentAdmissionPage.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Student Admission sub module")
    public void clicks_on_student_admission_sub_module() {
        CommonMethods.click(studentAdmissionPage.studentAdmissionSubModule);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String uniqNumber) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionTextBox, uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Roll Number {string}")
    public void enters_roll_number(String rollNumber) {
        CommonMethods.sendKeys(studentAdmissionPage.rollNumberTextBox, rollNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for class drop down")
    public void selects_for_class_drop_down(String classDropDownText) {
        CommonMethods.selectDropDownValue(classDropDownText, studentAdmissionPage.classDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for section drop down")
    public void selects_for_section_drop_down(String sectionDropDownText) {
        CommonMethods.selectDropDownValue(sectionDropDownText, studentAdmissionPage.sectionDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters first name {string}")
    public void enters_first_name(String firstNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.firstNameTextBox, firstNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters last name {string}")
    public void enters_last_name(String lastNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.lastNameTextBox, lastNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from gender drop down")
    public void selects_from_gender_drop_down(String genderDropDownText) {
        CommonMethods.selectDropDownValue(genderDropDownText, studentAdmissionPage.genderDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String dateOfBirthText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthDayPicker, dateOfBirthText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from category drop down")
    public void selects_from_category_drop_down(String categoryText) {
        CommonMethods.selectDropDownValue(categoryText, studentAdmissionPage.categoryDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters email {string}")
    public void enters_email(String emailText) {
        CommonMethods.sendKeys(studentAdmissionPage.emailTextBox, emailText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for Admission Date Calendar Day")
    public void selects_for_admission_date_calendar_day(String admissionDateText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDateDayPicker, admissionDateText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} from Blood Group drop down")
    public void selects_from_blood_group_drop_down(String bloodGroupText) {
        CommonMethods.selectDropDownValue(bloodGroupText, studentAdmissionPage.bloodGroupDropDown);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects {string} for As on Date Calendar Day")
    public void selects_for_as_on_date_calendar_day(String asOnDateText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDateDayPicker, asOnDateText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a phone number {string}")
    public void enters_a_phone_number(String phoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.phoneNumberTextBox, phoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a height {string}")
    public void enters_a_height(String heightText) {
        CommonMethods.sendKeys(studentAdmissionPage.heightTextBox, heightText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a weight {string}")
    public void enters_a_weight(String weightText) {
        CommonMethods.sendKeys(studentAdmissionPage.weightTextBox, weightText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother name {string}")
    public void enters_mother_name(String motherNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherNameTextBox, motherNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother phone number {string}")
    public void enters_mother_phone_number(String motherPhoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherPhoneNumberTextBox, motherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother occupation {string}")
    public void enters_mother_occupation(String motherOccupationText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherOccupationTextBox, motherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    @When("selects Mother radio button for If guardian is field")
    public void selects_mother_radio_button_for_if_guardian_is_field() {
        CommonMethods.click(studentAdmissionPage.radioButtonMother);
        CucumberLogUtils.logScreenShot();
    }

    @When("saves submission")
    public void saves_submission() {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.saveButton);
        CommonMethods.click(studentAdmissionPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters guardian address {string}")
    public void enters_guardian_address(String guardianAddressText) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianAddressTextBox, guardianAddressText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters mother email {string}")
    public void enters_mother_email(String motherEmailText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherEmailTextbox, motherEmailText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father name {string}")
    public void enters_father_name(String fatherNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextbox, fatherNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father phone number {string}")
    public void enters_father_phone_number(String fatherPhoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhoneNumberTextbox, fatherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters father occupation {string}")
    public void enters_father_occupation(String fatherOccupationText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherOccupationTextbox, fatherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the student is successfully admitted {string}")
    public void the_student_is_successfully_admitted(String expectedAlertSuccsessText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentAdmissionPage.actualAlertSuccsessText.getText(), expectedAlertSuccsessText);
    }

    @When("the user is on the {string} page")
    public void the_user_is_on_the_page(String urlPage) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(driver.getCurrentUrl(), urlPage);
    }
}