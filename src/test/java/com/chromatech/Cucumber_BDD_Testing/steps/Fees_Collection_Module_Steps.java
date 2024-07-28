package com.chromatech.Cucumber_BDD_Testing.steps;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.CucumberLogUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Fees_Collection_Module_Steps extends PageInitializer {

    @When("the user clicks on Fees Collection module")
    public void the_user_clicks_on_fees_collection_module() {
        StepsImplementation.the_user_clicks_on_fees_collection_module();
    }

    @Then("the following submodules display")
    public void the_following_submodules_display(List<String> expectedSubmodules) {
        CucumberLogUtils.logScreenShot();
        List<String> actualSubmodules = new ArrayList<>();
        for (WebElement element : feesCollectionModulePage.feesCollectionModules) {
            actualSubmodules.add(element.getText());
        }
        for (int i = 0; i < expectedSubmodules.size(); i++) {
            CommonMethods.assertEquals(actualSubmodules.get(i), expectedSubmodules.get(i));
        }
    }
}