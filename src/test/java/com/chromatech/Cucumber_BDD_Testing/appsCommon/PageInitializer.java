package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.HomeworkModulePage;
import com.chromatech.Cucumber_BDD_Testing.pages.IncomeModulePage;

public class PageInitializer {

    /**
     * THIS PAGE WILL BE USED TO INITIALIZE ALL
     * PAGE OBJECTS
     */

    public static HomeworkModulePage homeworkModulePage;
    public static IncomeModulePage incomeModulePage;

    public static void initializeAllPages() {
        homeworkModulePage = new HomeworkModulePage();
        incomeModulePage = new IncomeModulePage();
    }
}