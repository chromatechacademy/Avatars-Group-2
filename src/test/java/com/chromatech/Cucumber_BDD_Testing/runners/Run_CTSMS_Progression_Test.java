package com.chromatech.Cucumber_BDD_Testing.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/cucumber-reports/cucumber-html-report.html","json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/com/chromatech/Cucumber_BDD_Testing/features",
<<<<<<< HEAD
        glue = "com.chromatech.Cucumber_BDD_Testing.steps",
=======
        glue = {"com.chromatech.Cucumber_BDD_Testing.steps", "Hooks"},
>>>>>>> 8b4d2b0c88d385676ba900e0066d859cb5e3f9ed
        tags = "@Progression",
        dryRun = false
)
public class Run_CTSMS_Progression_Test extends AbstractTestNGCucumberTests {
}