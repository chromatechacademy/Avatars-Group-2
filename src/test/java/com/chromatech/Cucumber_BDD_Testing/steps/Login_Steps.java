package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps extends PageInitializer {

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(String url) {
        StepsImplementation.a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(url);
    }

    @When("the user enters username {string} in username text box")
    public void the_user_enters_username_in_username_text_box(String usernameText) {
        StepsImplementation.the_user_enters_username_in_username_text_box(usernameText);
    }

    @When("enters password {string} in the password text box")
    public void enters_password_in_the_password_text_box(String passwordText) {
        StepsImplementation.enters_password_in_the_password_text_box(passwordText);
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        StepsImplementation.clicks_on_sign_in_button();
    }

    @Then("the user is successfully directed to the dashboard page {string}")
    public void the_user_is_successfully_directed_to_the_dashboard_page(String expectedUrl) {
        StepsImplementation.the_user_is_successfully_directed_to_the_dashboard_page(expectedUrl);
    }
}