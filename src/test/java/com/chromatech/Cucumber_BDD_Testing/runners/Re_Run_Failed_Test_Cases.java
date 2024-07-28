package com.chromatech.Cucumber_BDD_Testing.runners;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.RetryListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(plugin = {"html:target/cucumber-reports/cucumber-html-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"@target/failed.txt"},
        glue = {"com.chromatech.Cucumber_BDD_Testing.steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)

@Listeners(RetryListener.class)
public class Re_Run_Failed_Test_Cases extends AbstractTestNGCucumberTests {
}
