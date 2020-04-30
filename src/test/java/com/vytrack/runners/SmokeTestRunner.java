package com.vytrack.runners;


import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources",
        dryRun = false,
        strict = false,
        tags = "@smoke_test",
        plugin = {
                "html:target/smoke_test_default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"

        }

)
public class SmokeTestRunner {
}