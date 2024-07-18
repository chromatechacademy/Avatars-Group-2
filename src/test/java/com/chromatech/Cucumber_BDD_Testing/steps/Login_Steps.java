package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.en.Given;


public class Login_Steps {

    PageInitializer pageInitializer = new PageInitializer();

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page (String url) {
        WebDriverUtils.setUp();
        WebDriverUtils.driver.get(url);
    }
}
