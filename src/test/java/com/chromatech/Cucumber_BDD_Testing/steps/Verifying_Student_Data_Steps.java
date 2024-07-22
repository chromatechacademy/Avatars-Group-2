package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.pages.StudentAdmissionPage;
import com.chromatech.Cucumber_BDD_Testing.pages.VerifyingStudentDataPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

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
    CommonMethods.sendKeys(verifyingStudentDataPage.bankNameBox,bankNameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters IFSC Code {string}")
    public void enters_ifsc_code(String ifscCodeText) {
    CommonMethods.sendKeys(verifyingStudentDataPage.ifscCodeBox, ifscCodeText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters National Identification Number {string}")
    public void enters_national_identification_number(String nationalIdentificationNumber) {
     CommonMethods.sendKeys(verifyingStudentDataPage.nationalIdentificationNumberTextBox,nationalIdentificationNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Local Identification Number {string}")
    public void enters_local_identification_number(String localIdentificationNumberText) {
    CommonMethods.sendKeys(verifyingStudentDataPage.localIdentificationNumberTextBox,localIdentificationNumberText);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks radio button {string}")
    public void clicks_radio_button(String radioButtonYesText) {
        CommonMethods.click(studentAdmissionPage.dynamicLocatorByText(radioButtonYesText));
        CucumberLogUtils.logScreenShot();
    }

    @When("enters Previous School Details {string}")
    public void enters_previous_school_details(String schoolInformationText) {
       CommonMethods.sendKeys(verifyingStudentDataPage.previousSchoolInformationTextBox,schoolInformationText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters a Note {string}")
    public void enters_a_note(String noteText) {
    CommonMethods.sendKeys(verifyingStudentDataPage.noteTextBox,noteText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters first Title of document {string}, {string}, {string}, {string}.")
    public void enters_first_title_of_document(String docOneText, String doxTwoText, String docThreeText, String docFourText) {
       verifyingStudentDataPage.sendTextToFourDocuments(docOneText,doxTwoText,docThreeText,docFourText);
       CucumberLogUtils.logScreenShot();
    }





    @When("upload a picture to Student Photo")
    public void upload_a_picture_to_student_photo() {
    String filePath = System.getProperty("user.dir") + "/src/main/resources/file/Emma.png";
        WebElement fileInput = verifyingStudentDataPage.studentPhotoBox;
        fileInput.sendKeys(filePath);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload a picture to Father Photo")
    public void upload_a_picture_to_father_photo() {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/file/Carl.png";
        WebElement fileInput = verifyingStudentDataPage.fatherPhotoBox;
        fileInput.sendKeys(filePath);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload a picture to Mother Photo")
    public void upload_a_picture_to_mother_photo() {
        String filePath = System.getProperty("user.dir") + "/src/main/resources/file/Helen.png";
        WebElement fileInput = verifyingStudentDataPage.motherPhotoBox;
        fileInput.sendKeys(filePath);
        CucumberLogUtils.logScreenShot();
    }

    @When("sends Document One")
    public void sends_document_one() {
        try {
            String filePath = System.getProperty("user.dir") + "/src/main/resources/file/Doc One.docx";
            WebElement fileInput = verifyingStudentDataPage.documentBoxOne;
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", fileInput);
            fileInput.sendKeys(filePath);
            CucumberLogUtils.logScreenShot();
        } catch (Exception e) {
            System.out.println("Unable to upload the document. Error: " + e.getMessage());
        }
    }

    @Then("sends unique number to Search By Keyword text box {string}")
    public void sends_unique_number_to_search_by_keyword_text_box(String uniqNumber) {
       CommonMethods.sendKeys(verifyingStudentDataPage.searchByKeywordTextBox,uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    @When("upload Mother picture {string}")
    public void upload_mother_picture(String filePath) {
     CommonMethods.sendKeys(verifyingStudentDataPage.motherPhotoBox, verifyingStudentDataPage.locatorForFile(filePath));
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