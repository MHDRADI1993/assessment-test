package steps;

import BaseClasses.*;
import BaseSetup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends Setup {
    public LoginSteps() throws IOException {
        super();
        loginVariables = new LoginVariables();
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunctions();
        dashboardVariables = new DashboardVariables();
        dashboardFunctions = new DashboardFunctions();
	}

    @Given("user on DM website")
    public void user_on_DM_website() {
        //commonFunctions.clickOnElement(homePageVariables.language , "Language");
        //commonFunctions.getCurrentURL(prop.getProperty("URL"));
    }

    @When("click on login button from the top right corner")
    public void click_on_login_button_from_the_top_right_corner(){
        commonFunctions.clickOnElement(homePageVariables.loginButton , "Login Button");
    }

    @And("enter DM account {string}")
    public void enter_DM_account(String username){
        commonFunctions.sendTextInputValue(loginVariables.userName , username );
    }

    @And("enter the password {string}")
    public void enter_the_password(String password){
        commonFunctions.sendTextInputValue(loginVariables.password , password );
    }

    @And("click on login button")
    public void click_on_login_button(){

        commonFunctions.clickOnElement(loginVariables.login , "Login Button");

    }
    @Then("user will be on the dashboard {string}")
    public void user_will_be_on_the_dashboard(String dashboardLink) throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertTrue(commonFunctions.getCurrentURL(dashboardLink) , "Actual Url same as Expected Url");

    }
    @And ("will see the logged user name displayed as {string}")
    public void will_see_the_logged_user_name_displayed(String dashboardWelcomeMessage) throws InterruptedException {
        Thread.sleep(3000);
        commonFunctions.isElementDisplayed(dashboardVariables.welcomeMessage ,dashboardWelcomeMessage );

    }
    @And ("the dashboard will contain the tab {string}")
    public void the_dashboard_will_contain_the_tab(String tabName){
        Assert.assertTrue(dashboardFunctions.isTabDisplayed(tabName));
    }
    @And ("will see the summary of the request submitted by him")
    public void will_see_the_summary_of_the_request_submitted_by_him(){
        Assert.assertTrue(commonFunctions.isElementDisplayed(dashboardVariables.serviceRequestSummary , "Service Request Summary") , "Service request summary displayed");
    }
}
