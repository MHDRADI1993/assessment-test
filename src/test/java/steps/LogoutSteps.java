package steps;

import BaseClasses.*;
import BaseSetup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class LogoutSteps extends Setup {

    public LogoutSteps() throws IOException {
        super();
        loginVariables = new LoginVariables();
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunctions();
        dashboardVariables = new DashboardVariables();
    }

    @When("user click on profile")
    public void user_click_on_profile(){
        commonFunctions.clickOnElement(dashboardVariables.profile , "Profile");
    }

    @When("click on logout button")
    public void click_on_logout_button(){
        commonFunctions.clickOnElement(dashboardVariables.logout , "Logout");
    }

    @Then("user will be on home page")
    public void  user_will_be_on_home_page() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertTrue(commonFunctions.getCurrentURL(prop.getProperty("URL")));
    }

    @And("there will be login option")
    public void there_will_be_login_option() throws InterruptedException {

        Assert.assertTrue(commonFunctions.isElementDisplayed(homePageVariables.loginButton , "Login"));
    }

}
