package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.JavascriptMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import static com.chromatech.Cucumber_BDD_Testing.appsCommon.Constants.*;
import static com.chromatech.Cucumber_BDD_Testing.appsCommon.Constants.FATHER_PHOTO_FILEPATH;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StepsImplementation extends PageInitializer {

    private static boolean isCheckboxClicked = false;

    /**
     * Navigates to the login page for Chroma Tech Academy as a teacher or admin.
     *
     * @param url the URL of the login page
     */
    public static void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(String url) {
        driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the username into the username text box.
     *
     * @param usernameText the username to be entered
     */
    public static void the_user_enters_username_in_username_text_box(String usernameText) {
        CommonMethods.sendKeys(loginPage.usernameTextBox, usernameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Navigates to the student information module.
     * This method clicks on the student information module and logs a screenshot.
     */
    public static void a_ctsms_user_navigates_to_the_student_information_module() {
        abilityToAddAndDeletestudentCategoriesPage.studentInformationModule.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Navigates to the student categories submodule.
     * This method clicks on the student categories submodule and logs a screenshot.
     */
    public static void navigates_to_the_student_categories_submodule() {
        abilityToAddAndDeletestudentCategoriesPage.studentCategoriesSubModule.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Adds and saves a new student category.
     *
     * @param expectedCategoryText the text of the category to be added and saved
     */
    public static void adding_and_saving_a_new_student_category(String expectedCategoryText) {
        CommonMethods.sendKeys(abilityToAddAndDeletestudentCategoriesPage.categoryTextBox, expectedCategoryText);
        CucumberLogUtils.logScreenShot();
        abilityToAddAndDeletestudentCategoriesPage.saveButton.click();
    }

    /**
     * Checks if the student category is successfully saved.
     *
     * @param expectedSuccessMessage the expected success message
     */
    public static void the_student_category_is_saved(String expectedSuccessMessage) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(abilityToAddAndDeletestudentCategoriesPage.actualSuccessMessage.getText(), expectedSuccessMessage);
    }

    /**
     * The user is able to delete the student category and accept the alert.
     *
     * @param expectedAlertText The expected text of the alert message.
     */
    public static void the_user_is_also_able_to_delete_the_student_category_and_accepting_alert(String expectedAlertText) {
        abilityToAddAndDeletestudentCategoriesPage.deleteButton.click();
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the expense head module.
     * This method clicks
     */
    public static void clicks_on_the_expense_head_module() {
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadSubmodule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Adds the specified text to the expense head text box on the page.
     *
     * @param headBox the text to be added to the expense head text box
     */
    public static void adds_to_the_expense_head_text_box(String headBox) {
        CommonMethods.sendKeys(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadTextBox, headBox);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Adds the given text to the description text box.
     *
     * @param desc the text to be added to the description text box
     */
    public static void adds_to_the_description_text_box(String desc) {
        CommonMethods.sendKeys(abilityToAddAndRemoveExpenseHeadsPage.expenseHeadDescription, desc);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks the save button.
     * This method performs a click operation
     */
    public static void clicks_the_save_button() {
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Asserts that the expense head is successfully admitted by comparing the expected success
     * alert text with the actual alert success text.
     *
     * @param expectedAlertSuccessText the expected success alert text
     */
    public static void the_expense_head_is_successfully_admitted(String expectedAlertSuccessText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(abilityToAddAndRemoveExpenseHeadsPage.actualAlertSuccessText.getText(), expectedAlertSuccessText);
    }

    /**
     * Deletes the expense head with the specified text.
     *
     * @param expenseHeadText the text of the expense head to be deleted
     */
    public static void the_user_deletes_the_expense_head(String expenseHeadText) {
        JavascriptMethods.scrollIntoView(abilityToAddAndRemoveExpenseHeadsPage.dynamicLocatorDeleteExpenseText(expenseHeadText));
        CucumberLogUtils.logScreenShot();
        CommonMethods.click(abilityToAddAndRemoveExpenseHeadsPage.dynamicLocatorDeleteExpenseText(expenseHeadText));
    }

    /**
     * Accepts the alert and verifies if the text displayed in the alert matches the expected alert text.
     *
     * @param expectedAlertText The expected text to be displayed in the alert.
     */
    public static void accepts_alert(String expectedAlertText) {
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Navigates the user to the Academics module.
     * This method clicks on the Academics module on the page and logs a screenshot of the page.
     */
    public static void the_user_navigates_to_the_academics_module() {
        CommonMethods.click(academicsModulePage.academicsModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method verifies that the following submodules are displayed on the academics module page.
     *
     * @param expectedClassTimetableSubmoduleText   The expected text for the Class Timetable submodule.
     * @param expectedTeacherTimetableSubmoduleText The expected text for the Teacher Timetable submodule.
     * @param expectedAssignClassTeacherSubmoduleText The expected text for the Assign Class Teacher submodule.
     * @param expectedPromoteStudentSubmoduleText The expected text for the Promote Student submodule.
     * @param expectedSubjectGroupSubmoduleText The expected text for the Subject Group submodule.
     * @param expectedSubjectsSubmoduleText The expected text for the Subjects submodule.
     * @param expectedClassSubmoduleText The expected text for the Class submodule.
     * @param expectedSectionsSubmoduleText The expected text for the Sections submodule.
     */
    public static void the_following_submodules_are_displayed(String expectedClassTimetableSubmoduleText, String expectedTeacherTimetableSubmoduleText, String expectedAssignClassTeacherSubmoduleText, String expectedPromoteStudentSubmoduleText, String expectedSubjectGroupSubmoduleText, String expectedSubjectsSubmoduleText, String expectedClassSubmoduleText, String expectedSectionsSubmoduleText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(academicsModulePage.classTimetableSubmodule.getText(), expectedClassTimetableSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.teacherTimetableSubmodule.getText(), expectedTeacherTimetableSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.assignClassTeacherSubmodule.getText(), expectedAssignClassTeacherSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.promoteStudentsSubmodule.getText(), expectedPromoteStudentSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.subjectGroupSubmodule.getText(), expectedSubjectGroupSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.subjectsSubmodule.getText(), expectedSubjectsSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.classSubmodule.getText(), expectedClassSubmoduleText);
        CommonMethods.assertEquals(academicsModulePage.sectionsSubmodule.getText(), expectedSectionsSubmoduleText);
    }

    /**
     * This method simulates a user clicking on the Academics module.
     */
    public static void user_clicks_on_academics_module() {
        addDeleteClassesPage.academicsModule.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Scrolls the page to the element representing the class submodule, and clicks on it.
     * Takes a screenshot after clicking.
     */
    public static void clicks_on_class_sub_module() {
        JavascriptMethods.scrollIntoView(addDeleteClassesPage.classSubModule);
        addDeleteClassesPage.classSubModule.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Deletes the class if it already exists on the page.
     *
     * @param savedClass The name of the class to delete.
     */
    public static void delete_the_class_if_already_existed(String savedClass){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isElementPresent = (Boolean) js.executeScript(
                "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue !== null;",
                addDeleteClassesPage.savedClassXpath(savedClass)
        );
        if (isElementPresent) {
            WebElement deleteButton = (WebElement) js.executeScript(
                    "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;",
                    addDeleteClassesPage.savedClassXpath(savedClass)
            );
            deleteButton.click();
            CommonMethods.acceptAlert();
            CucumberLogUtils.logScreenShot();
        } else {
            System.out.println("Class " + savedClass + " does not exist, so no need to delete.");
        }
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the given text into the class text box.
     *
     * @param text the text to be entered into the class text box
     */
    public static void enters_on_class_text_box(String text) {
        CommonMethods.waitForVisibility(addDeleteClassesPage.classTextBox);
        CommonMethods.sendKeys(addDeleteClassesPage.classTextBox, text);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method clicks on the checkbox in the specified section.
     *
     * @param section the section where the checkbox is located
     */
    public static void clicks_on_check_box(String section) {
        addDeleteClassesPage.sectionCheckBox(section).click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Scrolls into view the save button on the addDeleteClassesPage, and then clicks on it.
     * Also logs a screenshot after the button is clicked.
     */
    public static void clicks_save() {
        JavascriptMethods.scrollIntoView(addDeleteClassesPage.saveButton);
        addDeleteClassesPage.saveButton.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Verifies if the record is saved successfully by asserting the expected message with the actual message displayed on the page.
     * It also logs a screenshot if the assertion fails.
     *
     * @param expectedMessage the message expected to be displayed indicating the record is saved
     */
    public static void record_is_saved(String expectedMessage) {
        CommonMethods.assertEquals(addDeleteClassesPage.recordSavedMessage.getText(), expectedMessage);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Method to simulate a user clicking on the delete button for a saved class and accepting the alert.
     * This method will log a screenshot after deleting the record.
     *
     * @param savedClass The name of the saved class to be deleted.
     */
    public static void user_clicks_on_the_delete_button_for_the_saved_class_and_accepts_alert_the_record_is_deleted(String savedClass) {
        addDeleteClassesPage.deleteButton(savedClass).click();
        CommonMethods.assertEquals(CommonMethods.getAlertText(),"Delete Confirm?");
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method simulates a user clicking on the expenses-module.
     * It utilizes the click method from the CommonMethods class to perform the click action on the expenses module element.
     * After the click action, it logs a screenshot using the CucumberLogUtils class.
     */
    public static void user_clicks_on_expenses_module() {
        CommonMethods.click(addExpensePage.expensesModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the 'Add Expense' submodule.
     * This method clicks on the 'Add Expense' submodule button, and logs a screenshot.
     */
    public static void clicks_on_add_expense_sub_module() {
        CommonMethods.click(addExpensePage.addExpenseSubModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method selects a value from the expense head drop down menu.
     *
     * @param expenseHeadText the text to select from the dropdown menu
     */
    public static void selects_for_expense_head_drop_down(String expenseHeadText) {
        CommonMethods.selectDropDownValue(expenseHeadText, addExpensePage.expenseHeadDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the given name into the name text box and logs a screenshot.
     *
     * @param nameText The name to be entered into the name text box.
     */
    public static void enters_name(String nameText) {
        CommonMethods.sendKeys(addExpensePage.nameTextBox, nameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the invoice number in the invoice number text box on the Add Expense page.
     *
     * @param invoiceNumberText the invoice number to enter
     */
    public static void enters_invoice_number(String invoiceNumberText) {
        CommonMethods.sendKeys(addExpensePage.invoiceNumberTextBox, invoiceNumberText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects a date on the calendar for the given day.
     *
     * @param calendarPickerText The text to be selected on the calendar.
     */
    public static void selects_for_date_calendar_day(String calendarPickerText) {
        JavascriptMethods.selectDateByJS(addExpensePage.calendarPicker, calendarPickerText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method enters the given amount text in the amount text box on the add expense page.
     *
     * @param amountText the text to be entered in the amount text box
     */
    public static void enters_amount(String amountText) {
        CommonMethods.sendKeys(addExpensePage.amountTextBox, amountText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Attach a document to the expense page.
     * This method allows users to attach a document to the expense page
     */
    public static void attach_document() {
        CommonMethods.sendKeys(addExpensePage.file, SCREENSHOT);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the description text in the description box.
     *
     * @param descriptionText the text to be entered in the description box
     */
    public static void enters_description(String descriptionText) {
        CommonMethods.sendKeys(addExpensePage.descriptionBox, descriptionText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Saves the application by clicking the save button and capturing a screenshot.
     */
    public static void user_saves_application() {
        CommonMethods.click(addExpensePage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * The method is used to verify that the displayed expense details match the expected values
     */
    public static void the_expense_displays_as_expected(String expectedNameText, String expectedInvoiceNumberText, String expectedDateText, String expectedExpenseHeadText, String expectedAmountText) {
        ArrayList<String> expenseData = new ArrayList<>();
        expenseData.add(expectedNameText);
        expenseData.add(expectedInvoiceNumberText);
        expenseData.add(expectedDateText);
        expenseData.add(expectedExpenseHeadText);
        expenseData.add(expectedAmountText);
        for (int i = 0; i < expenseData.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//tr/td[text()='" + expectedInvoiceNumberText + "']//parent::tr/td[" + (i + 1) + "]"));
            CucumberLogUtils.logScreenShot();
            CommonMethods.assertEquals(element.getText(), expenseData.get(i));
        }
    }

    /**
     * Removes the expense from the add expense page.
     * This method Clicks on the remove expense element, and accepts the alert prompt.
     */
    public static void the_expense_can_then_be_removed() {
        CommonMethods.click(addExpensePage.removeExpense);
        CommonMethods.acceptAlert();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Simulates a user clicking on the student details submodule.
     * This method navigates to the student details submodule and logs a screenshot.
     */
    public static void user_clicks_on_the_student_details_submodule() {
        editStudentRecordPage.studentDetailsSubModule.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a unique admission number in the search by keyword text box.
     *
     * @param searchByKeywordTex The unique admission number to enter into the search by keyword text box.
     */
    public static void user_enters_unique_admission_number_in_search_by_keyword_text_box(String searchByKeywordTex) {
        CommonMethods.sendKeys(editStudentRecordPage.searchByKeywordTextbox, searchByKeywordTex);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Performs a click action on the search button.
     * This method is used to simulate a user clicking on the search button on the page.
     * After the click action, a screenshot of the page is logged.
     */
    public static void user_clicks_on_the_search_button() {
        editStudentRecordPage.searchByKeywordButton.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method simulates a user clicking on the edit button.
     * It calls the click method on the edit button element of the editStudentRecordPage to perform the click action.
     */
    public static void user_clicks_on_edit_btn() {
        editStudentRecordPage.editButton.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method simulates a user clicking on the show button.
     */
    public static void user_clicks_on_show_btn() {
        editStudentRecordPage.showButton.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method is used to verify the updated data on the student page.
     *
     * @param updatedLastNameExp  The expected updated last name of the student.
     * @param updatedEmailExp     The expected updated email of the student.
     * @param updatedFathersNameExp  The expected updated father's name of the student.
     */
    public static void user_is_on_the_student_page_checks_updated_data(String updatedLastNameExp, String updatedEmailExp, String updatedFathersNameExp) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(editStudentRecordPage.updatedLastName.getText(), updatedLastNameExp);
        CommonMethods.assertEquals(editStudentRecordPage.updatedEmail.getText(), updatedEmailExp);
        CommonMethods.assertEquals(editStudentRecordPage.updatedFathersName.getText(), updatedFathersNameExp);
    }

    /**
     * This method verifies if the following submodules are displayed:
     * - Add Expense submodule
     * - Search Expense submodule
     * - Expense Head submodule
     *
     * @param expectedAddExpenseText   The expected text of the Add Expense submodule
     * @param expectedSearchExpenseText The expected text of the Search Expense submodule
     * @param expectedExpenseHeadText   The expected text of the Expense Head submodule
     */
    public static void the_following_submodules_are_displayed(String expectedAddExpenseText, String expectedSearchExpenseText, String expectedExpenseHeadText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(expensesModule.addExpenseSubmodule.getText(), expectedAddExpenseText);
        CommonMethods.assertEquals(expensesModule.searchExpenseSubmodule.getText(), expectedSearchExpenseText);
        CommonMethods.assertEquals(expensesModule.expenseHeadSubmodule.getText(), expectedExpenseHeadText);
    }

    /**
     * The method is used to simulate the user action of clicking on the homework module button.
     **/
    public static void the_user_clicks_on_the_homework_module() {
        homeworkModulePage.homeworkBtn.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * The method is used to assert whether the `addHomeworkBtn` is displayed in the homework module page.
     * If the button is displayed, a screenshot is taken and logged.
     */
    public static void the_following_module_displays(String addHomeworkBtn) {
        CommonMethods.assertEquals(homeworkModulePage.addHomeworkBtn.getText(), addHomeworkBtn);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * The method is used to simulate the user clicking on the human resource module button on a web page.
     * This method Scrolls the page to the human resource module button, waits for the human resource module button to become clickable.
     * And clicks on the human resource module button.
     */
    public static void the_user_clicks_on_the_human_resource_module() {
        JavascriptMethods.scrollIntoView(humanResourceModule.humanResourceButton);
        CommonMethods.waitForClickability(humanResourceModule.humanResourceButton);
        humanResourceModule.humanResourceButton.click();
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Checks if the following submodules are displayed on the screen:
     * - Staff Directory
     * - Staff Attendance
     * - Payroll
     * - Approve Leave Request
     * - Apply Leave
     * - Leave Type
     * - Teachers Rating
     * - Department
     * - Designation
     *
     * @param expectedStaffDirectoryText        The expected label text for the Staff Directory submodule.
     * @param expectedStaffAttendanceText       The expected label text for the Staff Attendance submodule.
     * @param expectedPayrollText               The expected label text for the Payroll submodule.
     * @param expectedApproveLeaveRequestText   The expected label text for the Approve Leave Request submodule.
     * @param expectedApplyLeaveText            The expected label text for the Apply Leave submodule.
     * @param expectedLeaveTypeText             The expected label text for the Leave Type submodule.
     * @param expectedTeachersRatingText        The expected label text for the Teachers Rating submodule.
     * @param expectedDepartmentText            The expected label text for the Department submodule.
     * @param expectedDesignationText           The expected label text for the Designation submodule.
     */
    public static void the_following_submodules_are_displayed(String expectedStaffDirectoryText, String expectedStaffAttendanceText, String expectedPayrollText, String expectedApproveLeaveRequestText, String expectedApplyLeaveText, String expectedLeaveTypeText, String expectedTeachersRatingText, String expectedDepartmentText, String expectedDesignationText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(humanResourceModule.staffDirectorySubModule.getText(), expectedStaffDirectoryText);
        CommonMethods.assertEquals(humanResourceModule.staffAttendanceSubModule.getText(), expectedStaffAttendanceText);
        CommonMethods.assertEquals(humanResourceModule.payrollSubModule.getText(), expectedPayrollText);
        CommonMethods.assertEquals(humanResourceModule.approveLeaveRequestSubModule.getText(), expectedApproveLeaveRequestText);
        CommonMethods.assertEquals(humanResourceModule.applyLeaveSubModule.getText(), expectedApplyLeaveText);
        CommonMethods.assertEquals(humanResourceModule.leaveTypeSubModule.getText(), expectedLeaveTypeText);
        CommonMethods.assertEquals(humanResourceModule.teachersRatingSubModule.getText(), expectedTeachersRatingText);
        CommonMethods.assertEquals(humanResourceModule.departmentSubModule.getText(), expectedDepartmentText);
        CommonMethods.assertEquals(humanResourceModule.designationSubModule.getText(), expectedDesignationText);
    }

    /**
     * This method represents the action of a user clicking on income module
     */
    public static void user_clicks_on_income_module() {
        CommonMethods.click(incomeModulePage.incomeModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Verifies that the following submodules are displayed on the income module page.
     *
     * @param expectedAddIncomeText    the expected text for the Add Income submodule
     * @param expectedSearchIncomeText the expected text for the Search Income submodule
     * @param expectedIncomeHeadText   the expected text for the Income Head submodule
     */
    public static void the_following_submodules_displayed(String expectedAddIncomeText, String expectedSearchIncomeText, String expectedIncomeHeadText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(incomeModulePage.addIncomeSubmodule.getText(), expectedAddIncomeText);
        CommonMethods.assertEquals(incomeModulePage.searchIncomeSubmodule.getText(), expectedSearchIncomeText);
        CommonMethods.assertEquals(incomeModulePage.incomeHeadSubmodule.getText(), expectedIncomeHeadText);
    }

    /**
     * Enters the password in the password text box.
     *
     * @param passwordText the password to be entered in the password text box
     */
    public static void enters_password_in_the_password_text_box(String passwordText) {
        CommonMethods.sendKeys(loginPage.passwordTextBox, passwordText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the sign-in button on the login page.
     * This method is used to perform the action of clicking on the sign-in button to initiate the login process.
     * After clicking the button, a screenshot is captured and logged for reference.
     */
    public static void clicks_on_sign_in_button() {
        CommonMethods.click(loginPage.signInButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method checks if the user is successfully directed to the dashboard page.
     *
     * @param expectedUrl the expected URL of the dashboard page
     */
    public static void the_user_is_successfully_directed_to_the_dashboard_page(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * Takes the expected text as a parameter and performs the following actions:
     * - Logs a screenshot of the current screen
     * - Compares the actual text on the login page with the expected text
     *
     * @param expectedText the text that is expected to be displayed on the login page
     */
    public static void user_cannot_log_in(String expectedText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(loginPage.actualText.getText(), expectedText);
    }

    /**
     * User clicks on the student information module.
     * This method performs the action of clicking on the student information module on the page.
     * After performing the click action, it logs a screenshot.
     */
    public static void user_clicks_on_student_information_module() {
        CommonMethods.click(studentAdmissionPage.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method performs the action of clicking on the student admission submodule.
     * It waits for the student admission submodule to be clickable.
     */
    public static void clicks_on_student_admission_sub_module() {
        CommonMethods.sleep(3000);
        CommonMethods.waitForClickability(studentAdmissionPage.studentAdmissionSubModule);
        CommonMethods.click(studentAdmissionPage.studentAdmissionSubModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a unique admission number into the admission text box on the student admission page.
     *
     * @param uniqNumber The unique admission number to be entered.
     */
    public static void enters_unique_admission_number(String uniqNumber) {
        CommonMethods.sendKeys(studentAdmissionPage.admissionTextBox, uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the given roll number into the roll number text box on the student admission page.
     *
     * @param rollNumber the roll number to be entered
     */
    public static void enters_roll_number(String rollNumber) {
        CommonMethods.sendKeys(studentAdmissionPage.rollNumberTextBox, rollNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the value in the class drop-down on the student admission page.
     *
     * @param classDropDownText the text of the option to be selected in the class drop-down
     */
    public static void selects_for_class_drop_down(String classDropDownText) {
        CommonMethods.selectDropDownValue(classDropDownText, studentAdmissionPage.classDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects an option from the section drop-down on the student admission page.
     *
     * @param sectionDropDownText the text of the option to be selected
     */
    public static void selects_for_section_drop_down(String sectionDropDownText) {
        CommonMethods.selectDropDownValue(sectionDropDownText, studentAdmissionPage.sectionDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the first name into the designated text box.
     *
     * @param firstNameText the text to be entered as the first name
     */
    public static void enters_first_name(String firstNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.firstNameTextBox, firstNameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the last name in the last name text box on the student admission page.
     *
     * @param lastNameText The last name to be entered.
     */
    public static void enters_last_name(String lastNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.lastNameTextBox, lastNameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method is used to select a value from the gender drop down on the student admission page.
     *
     * @param genderDropDownText The text of the option to be selected from the gender drop down.
     */
    public static void selects_from_gender_drop_down(String genderDropDownText) {
        CommonMethods.selectDropDownValue(genderDropDownText, studentAdmissionPage.genderDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects a date on the Date of Birth calendar.
     *
     * @param dateOfBirthText the date to select on the calendar
     */
    public static void selects_for_date_of_birth_calendar(String dateOfBirthText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.dateOfBirthDayPicker, dateOfBirthText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects a value from the category drop down.
     *
     * @param categoryText the text of the category to select
     */
    public static void selects_from_category_drop_down(String categoryText) {
        CommonMethods.selectDropDownValue(categoryText, studentAdmissionPage.categoryDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the given email text into the email text box on the student admission page.
     *
     * @param emailText the email text to be entered
     */
    public static void enters_email(String emailText) {
        CommonMethods.sendKeys(studentAdmissionPage.emailTextBox, emailText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the given admission date on the calendar day.
     *
     * @param admissionDateText The text representation*/
    public static void selects_for_admission_date_calendar_day(String admissionDateText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.admissionDatePicker, admissionDateText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the specified blood group option from the blood group drop-down.
     *
     * @param bloodGroupText the text of the blood group option to be selected
     */
    public static void selects_from_blood_group_drop_down(String bloodGroupText) {
        CommonMethods.selectDropDownValue(bloodGroupText, studentAdmissionPage.bloodGroupDropDown);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the specified date on the calendar day of the given "as on" date.
     * Uses a JavaScript method to select the date on the calendar.
     *
     * @param asOnDateText the text representation of the "as on" date
     */
    public static void selects_for_as_on_date_calendar_day(String asOnDateText) {
        JavascriptMethods.selectDateByJS(studentAdmissionPage.asOnDatePicker, asOnDateText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a phone number into a text box.
     *
     * @param phoneNumberText the phone number to enter
     */
    public static void enters_a_phone_number(String phoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.phoneNumberTextBox, phoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a height into the height text box.
     *
     * @param heightText the text to enter into the height text box
     */
    public static void enters_a_height(String heightText) {
        CommonMethods.sendKeys(studentAdmissionPage.heightTextBox, heightText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a weight into a weight text box.
     *
     * @param weightText the weight to be entered
     */
    public static void enters_a_weight(String weightText) {
        CommonMethods.sendKeys(studentAdmissionPage.weightTextBox, weightText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the mother's name into the mother name text box on the student admission page.
     *
     * @param motherNameText the text to be entered as the mother's name
     */
    public static void enters_mother_name(String motherNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherNameTextBox, motherNameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the mother's phone number in the motherPhoneNumberTextBox field on the student admission page.
     *
     * @param motherPhoneNumberText the phone number of the mother
     */
    public static void enters_mother_phone_number(String motherPhoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherPhoneNumberTextBox, motherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the mother's occupation into the text box on the student admission page.
     *
     * @param motherOccupationText the occupation of the mother
     */
    public static void enters_mother_occupation(String motherOccupationText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherOccupationTextBox, motherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the 'Mother' radio button for the 'If Guardian is' field.
     */
    public static void selects_mother_radio_button_for_if_guardian_is_field() {
        CommonMethods.click(studentAdmissionPage.radioButtonMother);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method saves the submission.
     * It scrolls the page to the save button element, clicks on the save button and logs a screenshot of the current page.
     */
    public static void saves_submission() {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.saveButton);
        CommonMethods.click(studentAdmissionPage.saveButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the guardian address into the guardian address text box on the student admission page.
     *
     * @param guardianAddressText the address of the guardian
     */
    public static void enters_guardian_address(String guardianAddressText) {
        CommonMethods.sendKeys(studentAdmissionPage.guardianAddressTextBox, guardianAddressText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the mother's email address into the mother email text box.
     *
     * @param motherEmailText the email address to be entered for the mother
     */
    public static void enters_mother_email(String motherEmailText) {
        CommonMethods.sendKeys(studentAdmissionPage.motherEmailTextbox, motherEmailText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the father's name into the father name textbox on the student admission page.
     *
     * @param fatherNameText the name of the father to enter
     */
    public static void enters_father_name(String fatherNameText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherNameTextbox, fatherNameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the father's phone number in the corresponding text box.
     *
     * @param fatherPhoneNumberText the phone number of the father to be entered
     */
    public static void enters_father_phone_number(String fatherPhoneNumberText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherPhoneNumberTextbox, fatherPhoneNumberText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the father's occupation in the father's occupation text box on the student admission page.
     *
     * @param fatherOccupationText the text to be entered as father's occupation
     */
    public static void enters_father_occupation(String fatherOccupationText) {
        CommonMethods.sendKeys(studentAdmissionPage.fatherOccupationTextbox, fatherOccupationText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Verifies that the student is successfully admitted.
     *
     * @param expectedAlertSuccessText the expected success message to be displayed
     */
    public static void the_student_is_successfully_admitted(String expectedAlertSuccessText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentAdmissionPage.actualAlertSuccessText.getText(), expectedAlertSuccessText);
    }

    /**
     * The user is on the specified page.
     *
     * @param urlPage the URL of the page the user is on
     */
    public static void the_user_is_on_the_page(String urlPage) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(driver.getCurrentUrl(), urlPage);
    }

    /**
     * Performs a user action of clicking on the bulk delete submodule.
     * This method perform the click action on the corresponding element.
     * After successfully clicking on the submodule, it logs a screenshot.
     */
    public static void user_clicks_on_the_bulk_delete_submodule() {
        CommonMethods.click(studentAdmissionPage.bulkDeleteSubModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects a value from the class drop down box on the student admission page.
     *
     * @param sdetText the text of the option to be selected
     */
    public static void selects_for_the_class_drop_down(String sdetText) {
        CommonMethods.selectDropDownValue(sdetText, studentAdmissionPage.classDropDownBox);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Selects the given value in the section drop down box.
     *
     * @param cucumberFundamentalsText The value to be selected in the section drop down box.
     */
    public static void selects_for_the_section_drop_down(String cucumberFundamentalsText) {
        CommonMethods.selectDropDownValue(cucumberFundamentalsText, studentAdmissionPage.sectionDropDownBox);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the search button.
     * This method performs the action of clicking on the search button
     * */
    public static void clicks_on_the_search_button() {
        CommonMethods.click(studentAdmissionPage.searchButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the checkbox with the unique admission number.
     *
     * @param uniqAdmissionNumber The unique admission number of the checkbox to be clicked.
     */
    public static void clicks_on_the_checkbox_with_the_unique_admission_number(String uniqAdmissionNumber) {
        CommonMethods.click(studentAdmissionPage.dynamicLocator(uniqAdmissionNumber));
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method scrolls the page to view the delete button on the student admission page and clicks the delete button.
     * It verifies that the text of the alert message matches the expected alert text, accepts the alert.
     * Scrolls the page to view the search button on the student admission page.
     * And Logs a screenshot.
     *
     * @param expectedAlertText The expected text of the alert message.
     */
    public static void clicks_the_delete_button_and_accepting_alert(String expectedAlertText) {
        JavascriptMethods.scrollIntoView(studentAdmissionPage.deleteButton);
        CommonMethods.click(studentAdmissionPage.deleteButton);
        CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
        CommonMethods.acceptAlert();
        JavascriptMethods.scrollIntoView(studentAdmissionPage.searchButton);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * If the record with the given admission number exists, the user clicks on the checkbox.
     *
     * @param admissionNumber the admission number of the record
     */
    public static void if_the_record_admission_number_exists_user_clicks_on_the_checkbox(String admissionNumber) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isElementPresent = (Boolean) js.executeScript(
                "return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue !== null;",
                studentAdmissionPage.dynamicLocatorCheckBox(admissionNumber)
        );
        if (isElementPresent) {
            WebElement checkbox = studentAdmissionPage.dynamicLocator(admissionNumber);
            checkbox.click();
            CucumberLogUtils.logScreenShot();
            isCheckboxClicked = true;
        }
    }

    /**
     * Checks if the unique admission number exists, clicks the delete button, and accepts the alert.
     *
     * @param expectedAlertText The expected text of the alert message.
     */
    public static void if_the_unique_admission_number_exists_clicks_the_delete_button_and_accepting_alert(String expectedAlertText) {
        if (isCheckboxClicked) {
            JavascriptMethods.scrollIntoView(studentAdmissionPage.deleteButton);
            CommonMethods.click(studentAdmissionPage.deleteButton);
            CommonMethods.assertEquals(CommonMethods.getAlertText(), expectedAlertText);
            CommonMethods.acceptAlert();
            JavascriptMethods.scrollIntoView(studentAdmissionPage.searchButton);
        }
    }

    /**
     * This method logs a screenshot and checks if the given expected text matches the actual text on the page.
     * If the texts do not match, an assertion error is thrown.
     *
     * @param expectedText The expected text to compare against the actual text on the page.
     */
    public static void the_user_is_given_the_message(String expectedText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(studentAdmissionWithUniqueNumberPage.actualText.getText(), expectedText);
    }

    /**
     * This method simulates a user clicking on the student information module.
     * It calls the click method from the CommonMethods class to click on the student information module.
     * After clicking, it logs a screenshot.
     */
    public static void the_user_clicks_on_the_student_information_module() {
        CommonMethods.click(studentInformationModulePage.studentInformationModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Displays the following submodules on the web page and verifies them against the expected submodules.
     *
     * @param expectedSubmodules The list of expected submodules.
     */
    public static void the_following_submodules_display(List<String> expectedSubmodules) {
        CucumberLogUtils.logScreenShot();
        List<String> actualSubmodules = new ArrayList<>();
        for (WebElement element : studentInformationModulePage.studentSubModules) {
            actualSubmodules.add(element.getText());
        }
        for (int i = 0; i < expectedSubmodules.size(); i++) {
            CommonMethods.assertEquals(actualSubmodules.get(i), expectedSubmodules.get(i));
        }
    }

    /**
     * Clicks on the student details submodule.
     * This method waits for the student details submodule element to be clickable,
     * clicks on the element, and logs a screenshot.
     */
    public static void clicks_on_student_details_sub_module() {
        CommonMethods.waitForClickability(verifyingStudentDataPage.studentDetailsSubModule);
        CommonMethods.click(verifyingStudentDataPage.studentDetailsSubModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the phone number of a student on the verifying student data page.
     *
     * @param studentPhoneNumber the phone number of the student
     */
    public static void enters_phone_number(String studentPhoneNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.studentPhoneNumber, studentPhoneNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the "Add More Details" module on the verifying student data page.
     */
    public static void clicks_on_add_more_details() {
        CommonMethods.click(verifyingStudentDataPage.addMoreDetailsModule);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the checkbox if the guardian address is the same as the current address.
     */
    public static void clicks_on_the_checkbox_if_guardian_address_is_current_address() {
        CommonMethods.click(verifyingStudentDataPage.currentAddressCheckBox);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a bank account number into the bank account text box on the verifying student data page.
     *
     * @param bankAccountNumber the bank account number to enter
     */
    public static void enters_bank_account_number(String bankAccountNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.bankAccountTextBox, bankAccountNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the bank name in the bank name text box on the verifying student data page.
     *
     * @param bankNameText the bank name to be entered
     */
    public static void enters_bank_name(String bankNameText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.bankNameBox, bankNameText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the IFSC code into a text box.
     *
     * @param ifscCodeText the IF*/
    public static void enters_ifsc_code(String ifscCodeText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.ifscCodeBox, ifscCodeText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the national identification number into the text box on the verifying student data page.
     * Takes a string representing the national identification number as a parameter and sends it to the text box.
     * It also logs a screenshot after entering the value.
     *
     * @param nationalIdentificationNumber A string representing the national identification number to be entered.
     */
    public static void enters_national_identification_number(String nationalIdentificationNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.nationalIdentificationNumberTextBox, nationalIdentificationNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the local identification number into the localIdentificationNumberTextBox on the verifyingStudentDataPage.
     * Takes a string parameter, localIdentificationNumberText, which represents the local identification number to be entered.
     * Sends the localIdentificationNumberText and logs a screenshot.
     *
     * @param localIdentificationNumberText The local identification number to be entered into the localIdentificationNumberTextBox
     */
    public static void enters_local_identification_number(String localIdentificationNumberText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.localIdentificationNumberTextBox, localIdentificationNumberText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Clicks on the radio button with the specified text.
     *
     * @param radioButtonYesText the text of the radio button to be clicked
     */
    public static void clicks_radio_button(String radioButtonYesText) {
        CommonMethods.click(studentAdmissionPage.dynamicLocatorByText(radioButtonYesText));
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the previous school details in the provided text box.
     *
     * @param schoolInformationText the text containing the previous school details
     */
    public static void enters_previous_school_details(String schoolInformationText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.previousSchoolInformationTextBox, schoolInformationText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters a note into the note text box on the verifying student data page.
     *
     * @param noteText the text of the note to enter
     */
    public static void enters_a_note(String noteText) {
        CommonMethods.sendKeys(verifyingStudentDataPage.noteTextBox, noteText);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Enters the first title of a document into the corresponding text box on the web page.
     *
     * @param docOneText   The text of the first document.
     * @param docTwoText   The text of the second document.
     * @param docThreeText The text of the third document.
     * @param docFourText  The text of the fourth document.
     */
    public static void enters_first_title_of_document(String docOneText, String docTwoText, String docThreeText, String docFourText) {
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

    /**
     * This method uploads the file one to the "Documents" section on the verifying student data page.
     * It uses the CommonMethods class to send the file path of the document to be uploaded to the documentBoxOne element on the page.
     * After uploading the file, it logs a screenshot.
     */
    public static void uploads_file_one_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxOne, DOCUMENT_ONE_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Uploads a file to the Documents using "sendKeys" functionality.
     * This method selects the document box two element, and uses the provided file path to upload the file.
     * It then logs a screenshot of the page.
     */
    public static void uploads_file_two_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxTwo, DOCUMENT_TWO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method uploads the third file to the "Documents" section on the verifying student data page.
     * It uses the CommonMethods class to send the file path to the document box.
     * After successfully uploading the file, it logs a screenshot.
     */
    public static void uploads_file_three_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxThree, DOCUMENT_THREE_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method uploads a file to the Documents section.
     * It sends the file path to the documentBoxFour element and logs a screenshot.
     */
    public static void uploads_file_four_to_Documents() {
        CommonMethods.sendKeys(verifyingStudentDataPage.documentBoxFour, DOCUMENT_FOUR_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Sends a unique number to the search by keyword text box.
     *
     * @param uniqNumber the unique number to be sent
     */
    public static void sends_unique_number_to_search_by_keyword_text_box(String uniqNumber) {
        CommonMethods.sendKeys(verifyingStudentDataPage.searchByKeywordTextBox, uniqNumber);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Uploads the mother's picture.
     * This method input the file path of the mother's photo in the motherPhotoBox element on the verifying
     */
    public static void upload_mother_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.motherPhotoBox, MOTHER_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method is used to upload a student picture onto the verifying student data page.
     * It retrieves the student photo box element and sends the file path of the student photo to it.
     * After successfully uploading the photo, it logs a screenshot of the page.
     */
    public static void upload_student_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.studentPhotoBox, STUDENT_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * This method is used to upload a father picture onto the verifying student data page.
     * It retrieves the father photo box element and sends the file path of the father photo to it.
     * After successfully uploading the photo, it logs a screenshot of the page.
     */
    public static void upload_father_picture() {
        CommonMethods.sendKeys(verifyingStudentDataPage.fatherPhotoBox, FATHER_PHOTO_FILEPATH);
        CucumberLogUtils.logScreenShot();
    }

    /**
     * Verifies if all student data submitted with the record is displayed on the webpage.
     *
     * @param expectedUniqNumberText     The expected unique number text.
     * @param expectedNameText           The expected name text.
     * @param expectedClassText          The expected class text.
     * @param expectedFathersNameText    The expected father's name text.
     * @param expectedDateOfBirthText    The expected date of birth text.
     * @param expectedGenderText         The expected gender text.
     * @param expectedCategoryText       The expected category text.
     * @param expectedPhoneNumberText    The expected phone number text.
     * @param expectedHeightText         The expected height text.
     * @param expectedWeightText         The expected weight text.
     * @throws AssertionError if any of the expected texts is not found on the webpage.
     */
    public static void all_student_data_submitted_with_the_record_should_display(String expectedUniqNumberText, String expectedNameText, String expectedClassText, String expectedFathersNameText, String expectedDateOfBirthText, String expectedGenderText, String expectedCategoryText, String expectedPhoneNumberText, String expectedHeightText, String expectedWeightText) {
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