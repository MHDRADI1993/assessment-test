package BaseSetup;

import BaseClasses.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Setup {


    public static WebDriver driver;
    public static Properties prop;
    public static String browser;
    public static ExtentTest logger;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static WebDriverWait wait;
    public static boolean isCommonActionDone;
    public static HomePageVariables homePageVariables;
    public static HomePageFunctions homePageFunctions;
    public static LoginVariables loginVariables;
    public static CommonFunctions commonFunctions;
    public static DashboardVariables dashboardVariables;
    public static DashboardFunctions dashboardFunctions;
    public static ServicesFunctions servicesFunctions;
    public static ServicesVariables servicesVariables;
    public static SoftAssert softAssert = new SoftAssert();




    public Setup() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "./src/test/java/Config/config.properties");
        prop.load(fis);
    }

    public static void initialization (String browser) throws FileNotFoundException, IOException {


        if (browser.equalsIgnoreCase("firefox") && System.getProperty("os.name").startsWith("Mac OS")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxWebdriverPathMac"));
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("firefox") && System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("FirefoxWebdriverPathWindows"));
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("firefox") && System.getProperty("os.name").contains("Linux")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxWebdriverPathLinux"));
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("chrome") && System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeWebdriverPathWindows"));
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("chrome") && System.getProperty("os.name").contains("Linux")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("ChromeWebdriverPathLinux"));
            driver = new ChromeDriver();;
        }else if (browser.equalsIgnoreCase("chrome") && System.getProperty("os.name").startsWith("Mac OS")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeWebdriverPathMac"));
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("edge") && System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.edge.driver", prop.getProperty("EdgeWebdriverPathWindows"));
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("edge") && System.getProperty("os.name").contains("Linux")) {
            System.setProperty("webdriver.edge.driver", prop.getProperty("EdgeWebdriverPathLinux"));
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("edge") && System.getProperty("os.name").startsWith("Mac OS")) {
            System.setProperty("webdriver.edge.driver", prop.getProperty("EdgeWebdriverPathMac"));
            driver = new EdgeDriver();
        }
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
