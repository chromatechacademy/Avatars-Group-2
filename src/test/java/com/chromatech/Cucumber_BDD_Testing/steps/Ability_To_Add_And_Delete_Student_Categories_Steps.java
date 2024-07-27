package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Student_Categories_Steps extends PageInitializer {

    @When("a CTSMS user navigates to the Student Information module")
    public void a_ctsms_user_navigates_to_the_student_information_module() {
        StepsImplementation.a_ctsms_user_navigates_to_the_student_information_module();
    }

    @When("navigates to the Student Categories submodule")
    public void navigates_to_the_student_categories_submodule() {
        StepsImplementation.navigates_to_the_student_categories_submodule();
    }

    @When("adding and saving a new Student Category {string}")
    public void adding_and_saving_a_new_student_category(String expectedCategoryText) {
        StepsImplementation.adding_and_saving_a_new_student_category(expectedCategoryText);
    }

    @Then("the Student Category is saved {string}")
    public void the_student_category_is_saved(String expectedSuccessMessage) {
        StepsImplementation.the_student_category_is_saved(expectedSuccessMessage);
    }

    @Then("the user is also able to delete the Student Category and accepting alert  {string}")
    public void the_user_is_also_able_to_delete_the_student_category_and_accepting_alert(String expectedAlertText) {
        StepsImplementation.the_user_is_also_able_to_delete_the_student_category_and_accepting_alert(expectedAlertText);
    }
}