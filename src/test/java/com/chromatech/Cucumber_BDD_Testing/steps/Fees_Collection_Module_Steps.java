package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class Fees_Collection_Module_Steps extends PageInitializer {

    @When("the user clicks on Fees Collection module")
    public void the_user_clicks_on_fees_collection_module() {
        StepsImplementation.the_user_clicks_on_fees_collection_module();
    }

    @Then("the following submodules display")
    public void the_following_submodules_displays(List<String> expectedSubmodules) {
        StepsImplementation.the_following_submodules_displays(expectedSubmodules);
    }
}