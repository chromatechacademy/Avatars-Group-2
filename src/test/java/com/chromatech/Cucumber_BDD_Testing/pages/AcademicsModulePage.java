package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicsModulePage {

    public AcademicsModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    /* ACADEMICS MODULE */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    /* CLASS TIMETABLE SUBMODULE */
    @FindBy(xpath = "//a[@href='https://mexil.it/chroma/admin/timetable/classreport']")
    public WebElement classTimetableSubmodule;

    /* TEACHERS TIMETABLE SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teacherTimetableSubmodule;

    /* ASSIGN CLASS TEACHER SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherSubmodule;

    /* PROMOTE STUDENTS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsSubmodule;

    /* SUBJECT GROUP SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupSubmodule;

    /* SUBJECTS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement subjectsSubmodule;

    /* CLASS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubmodule;

    /* SECTIONS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubmodule;
}