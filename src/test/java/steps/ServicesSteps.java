package steps;

import BaseClasses.CommonFunctions;
import BaseClasses.HomePageVariables;
import BaseClasses.ServicesFunctions;
import BaseSetup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class ServicesSteps extends Setup {
    public ServicesSteps() throws IOException {
        super();
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunctions();
        servicesFunctions = new ServicesFunctions();

    }

    @When("click on services")
    public void click_on_services(){
        commonFunctions.clickOnElement(homePageVariables.services , "Services");
    }

    @Then("user will be on services page {string}")
    public void user_will_be_on_services_page(String servicesLink) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(commonFunctions.getCurrentURL(servicesLink) , "Actual Url same as Expected Url");
    }
    @And("page title displayed as {string}")
    public void page_title_displayed_as(String pageTitle){
        softAssert.assertTrue(servicesFunctions.isPageTitleEqualToServices(pageTitle));
    }

    @And("Services page contain tab {string}")
    public void Services_page_contain_tab(String tabName){
        Assert.assertTrue(servicesFunctions.isTabDisplayed(tabName));
    }
}

