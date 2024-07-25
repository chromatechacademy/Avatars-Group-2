package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HumanResourceModulePage {

    /* HUMAN RESOURCE BUTTON */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceButton;

    /* STAFF DIRECTORY SUBMODULE */
    @FindBy(xpath = "(//a[normalize-space()='Staff Directory'])[2]")
    public WebElement staffDirectorySubModule;

    /* STAFF ATTENDANCE SUBMODULE */
    @FindBy(xpath = "(//a[normalize-space()='Staff Attendance'])[2]")
    public WebElement staffAttendanceSubModule;

    /* PAYROLL SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollSubModule;

    /* APPROVE LEAVE SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveLeaveRequestSubModule;

    /* APPLY LEAVE SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyLeaveSubModule;

    /* LEAVE TYPE SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTypeSubModule;

    /* TEACHERS RATING SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teachersRatingSubModule;

    /* DEPARTMENT SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentSubModule;

    /* DESIGNATION SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationSubModule;

    public HumanResourceModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}