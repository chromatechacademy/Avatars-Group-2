package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
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
        CommonMethods.sleep(5000);
        CucumberLogUtils.logScreenShot();
    }

}
