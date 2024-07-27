package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;

import static com.chromatech.utils.WebDriverUtils.driver;

public class StepsImplementation extends PageInitializer {

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
}
