package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.LoginPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Login_With_Invalid_Credentials_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("a Chroma Tech Academy teacher or admin is on the login page {string}")
    public void a_chroma_tech_academy_teacher_or_admin_is_on_the_login_page(String url) {
        driver.get(url);
        CucumberLogUtils.logScreenShot();
    }

    @When("the user enters username {string} in username text box")
    public void the_user_enters_username_in_username_text_box(String usernameText) {
        CommonMethods.sendKeys(loginPage.usernameTextBox, usernameText);
        CucumberLogUtils.logScreenShot();
    }

    @When("enters password {string} in the password text box")
    public void enters_password_in_the_password_text_box(String passwordText) {
        CommonMethods.sendKeys(loginPage.passwordTextBox, passwordText);
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
        CommonMethods.click(loginPage.signInButton);
        CucumberLogUtils.logScreenShot();
    }

    @Then("user cannot Log in {string}")
    public void user_cannot_log_in(String expectedText) {
        CucumberLogUtils.logScreenShot();
        CommonMethods.assertEquals(loginPage.actualText.getText(), expectedText);
    }
}