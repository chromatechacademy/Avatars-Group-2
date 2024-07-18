package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HumanResourceModule {

    @FindBy(xpath="//span[normalize-space()='Human Resource']")
    public WebElement HumanResourceButton;

    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Staff Directory']")
    public WebElement staffDirectorySubModule;

    @FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Staff Attendance']")
    public WebElement staffAttendanceSubModule;

    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollSubModule;

    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement  approveLeaveRequestSubModule;


}
