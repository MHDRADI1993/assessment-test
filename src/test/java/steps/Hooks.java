package steps;

import BaseSetup.Setup;
import BaseSetup.Utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks extends Setup {
    public Hooks() throws IOException {
        super();
    }

    @Before("@edge")
    public void setUpEdge(Scenario scenario) throws IOException {
        initialization("edge");
        logger = extent.createTest(scenario.getName(), "");
    }
    @Before("@firefox")
    public void setUpFirefox(Scenario scenario) throws IOException {
        initialization("firefox");
        logger = extent.createTest(scenario.getName(), "");
    }
    @Before("@chrome")
    public void setUpChrome(Scenario scenario) throws IOException {
        initialization("chrome");
        logger = extent.createTest(scenario.getName(), "");
    }

//    @Before
//    public  void setup(Scenario scenario) throws  IOException {
//        initialization("firefox");
//        logger = extent.createTest(scenario.getName(), "");
//		tc_name = scenario.getName();
//
//    }


    @After ("@firefox or @chrome or @edge")
    public void tearDown(Scenario scenario) throws IOException {
        Utils.takeSnapshot(scenario.getName());
        if (scenario.isFailed()) {
                //logger.log(Status.FAIL, tc_data.get(exwelcelColumnMap.get("UserName"))+ " message");
            logger.log(Status.FAIL, scenario.getName() + " Scenario Failed");
            logger.log(Status.INFO, "<a href='"+scenario.getName() + ".png" +"'><span class='label info'>Download Snapshot</span></a>");
            }
        else {
                //logger.log(Status.PASS, tc_data.get(excelColumnMap.get("UserName"))+ " User Entered Successfully");
            logger.log(Status.PASS, scenario.getName() + " Scenario Passed");
            logger.log(Status.INFO, "<a href='"+scenario.getName() + ".png" +"'><span class='label info'>Download Snapshot</span></a>");
            }
        driver.quit();

    }

    @BeforeAll
    public static void initiate() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("./src/test/java/Config/config.properties");
        prop.load(fis);
        //excelData = Utils.getExcelData(prop.getProperty("ExcelSheetName"));
        htmlReporter = new ExtentHtmlReporter(prop.getProperty("ResultsReportPath"));
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("OS","Windows");
        extent.setSystemInfo("Owner","Mohamed Radi");
        extent.setSystemInfo("Test Name","AutomationFramework");
        extent.setSystemInfo("Tools","Selenium with JAVA");
        extent.setSystemInfo("Framework Design","Maven , TestNG and Cucumber");
    }
    @AfterAll
    public static void turnOff() {
        extent.flush();
        softAssert.assertAll();
    }

}
