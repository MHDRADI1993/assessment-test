package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@chrome", features = {"" }, glue = "steps" , plugin = {"rerun:target/rerun.txt"})

public class ChromeTestRunner extends AbstractTestNGCucumberTests {
}
