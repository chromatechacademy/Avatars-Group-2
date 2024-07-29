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
    public static AbilityToAddAndDeleteStudentCategoriesPage abilityToAddAndDeleteStudentCategoriesPage;
    public static AbilityToAddAndRemoveExpenseHeadsPage abilityToAddAndRemoveExpenseHeadsPage;
    public static AcademicsModulePage academicsModulePage;
    public static AbilityToAddAndDeleteClassesPage abilityToAddAndDeleteClassesPage;
    public static AddExpensePage addExpensePage;
    public static EditStudentRecordPage editStudentRecordPage;
    public static HumanResourceModulePage humanResourceModule;
    public static StudentAdmissionPage studentAdmissionPage;
    public static StudentAdmissionWithUniqueNumberPage studentAdmissionWithUniqueNumberPage;
    public static StudentInformationModulePage studentInformationModulePage;
    public static VerifyingStudentDataPage verifyingStudentDataPage;
    public static ExpensesModulePage expensesModule;
    public static FeesCollectionModulePage feesCollectionModulePage;
    public static NavigationModulesPage navigationModulesPage;

    public static void initializeAllPages() {
        homeworkModulePage = new HomeworkModulePage();
        incomeModulePage = new IncomeModulePage();
        loginPage = new LoginPage();
        abilityToAddAndDeleteStudentCategoriesPage = new AbilityToAddAndDeleteStudentCategoriesPage();
        abilityToAddAndRemoveExpenseHeadsPage = new AbilityToAddAndRemoveExpenseHeadsPage();
        academicsModulePage = new AcademicsModulePage();
        abilityToAddAndDeleteClassesPage = new AbilityToAddAndDeleteClassesPage();
        addExpensePage = new AddExpensePage();
        editStudentRecordPage = new EditStudentRecordPage();
        feesCollectionModulePage = new FeesCollectionModulePage();
        humanResourceModule = new HumanResourceModulePage();
        navigationModulesPage = new NavigationModulesPage();
        studentAdmissionPage = new StudentAdmissionPage();
        studentAdmissionWithUniqueNumberPage = new StudentAdmissionWithUniqueNumberPage();
        studentInformationModulePage = new StudentInformationModulePage();
        verifyingStudentDataPage = new VerifyingStudentDataPage();
        expensesModule = new ExpensesModulePage();
    }
}