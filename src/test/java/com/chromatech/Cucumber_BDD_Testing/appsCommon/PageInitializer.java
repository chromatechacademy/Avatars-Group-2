package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.*;

public class PageInitializer {

    /**
     * THIS PAGE WILL BE USED TO INITIALIZE ALL
     * PAGE OBJECTS
     */

    public static HomeworkModulePage homeworkModulePage;
    public static IncomeModulePage incomeModulePage;
    public static LoginPage loginPage;
    public static AbilityToAddAndDeleteStudentCategoriesPage abilityToAddAndDeletestudentCategoriesPage;
    public static AbilityToAddAndRemoveExpenseHeadsPage abilityToAddAndRemoveExpenseHeadsPage;
    public static AcademicsModulePage academicsModulePage;
    public static AddDeleteClassesPage addDeleteClassesPage;
    public static AddExpensePage addExpensePage;
    public static EditStudentRecordPage editStudentRecordPage;
    public static HumanResourceModulePage humanResourceModule;
    public static StudentAdmissionPage studentAdmissionPage;
    public static StudentAdmissionWithUniqueNumberPage studentAdmissionWithUniqueNumberPage;
    public static StudentInformationModulePage studentInformationModulePage;
    public static VerifyingStudentDataPage verifyingStudentDataPage;
    public static ExpensesModulePage expensesModule;

    public static void initializeAllPages() {
        homeworkModulePage = new HomeworkModulePage();
        incomeModulePage = new IncomeModulePage();
        loginPage = new LoginPage();
        abilityToAddAndDeletestudentCategoriesPage = new AbilityToAddAndDeleteStudentCategoriesPage();
        abilityToAddAndRemoveExpenseHeadsPage = new AbilityToAddAndRemoveExpenseHeadsPage();
        academicsModulePage = new AcademicsModulePage();
        addDeleteClassesPage = new AddDeleteClassesPage();
        addExpensePage = new AddExpensePage();
        editStudentRecordPage = new EditStudentRecordPage();
        humanResourceModule = new HumanResourceModulePage();
        studentAdmissionPage = new StudentAdmissionPage();
        studentAdmissionWithUniqueNumberPage = new StudentAdmissionWithUniqueNumberPage();
        studentInformationModulePage = new StudentInformationModulePage();
        verifyingStudentDataPage = new VerifyingStudentDataPage();
        expensesModule = new ExpensesModulePage();
    }
}