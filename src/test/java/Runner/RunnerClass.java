package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Feature/Login.feature",
    glue = {"stepD"},
    dryRun = true,  
    monochrome = true,
    tags = "@smoke or @regression or @functional",
    plugin = {
        "pretty",
        "html:target/cucumber/reports-html",
        "json:target/cucumber/reports.json"
    }
)
public class RunnerClass extends AbstractTestNGCucumberTests {
}