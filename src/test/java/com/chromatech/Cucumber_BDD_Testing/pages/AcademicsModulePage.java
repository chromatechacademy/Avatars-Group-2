package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicsModulePage {

    public AcademicsModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    //Academics Module
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    //Class Timetable Submodule
    @FindBy(xpath = "//a[@href='https://mexil.it/chroma/admin/timetable/classreport']")
    public WebElement classTimetableSubmodule;

    //Teachers Timetable Submodule
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teacherTimetableSubmodule;

    //Assign Class Teacher Submodule
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherSubmodule;

    //Promote Students Submodule
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsSubmodule;

    //Subject Group Submodule
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupSubmodule;

    //Subjects Submodule
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement subjectsSubmodule;

    //Class Submodule
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubmodule;

    //Sections Submodule
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubmodule;
}