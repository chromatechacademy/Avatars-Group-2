package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class DashboardPage {

    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* STUDENT DETAILS SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Details']")
    public WebElement studentDetails;

    /* STUDENT ADMISSION SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;

    /* DISABLE STUDENTS SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudents;

    /* BULK DELETE SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    /* STUDENT CATEGORIES SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategories;

    /* STUDENT HOUSE SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouse;

    /* DISABLE REASON SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReason;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public List<String> getStudentInformationSubmodulesText() {
        List<String> submodulesText = new ArrayList<>();
        submodulesText.add(studentDetails.getText());
        submodulesText.add(studentAdmission.getText());
        submodulesText.add(disabledStudents.getText());
        submodulesText.add(bulkDelete.getText());
        submodulesText.add(studentCategories.getText());
        submodulesText.add(studentHouse.getText());
        submodulesText.add(disableReason.getText());
        return submodulesText;
    }
}
