package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/java/ui/ChangeToArabic.feature" ,
                                        "src/test/java/ui/Login.feature" ,
                                        "src/test/java/ui/Logout.feature" ,
                                        "src/test/java/ui/SearchEngine.feature" ,
                                        "src/test/java/ui/Services.feature"}, glue = "steps" , plugin = {"rerun:target/rerun.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
