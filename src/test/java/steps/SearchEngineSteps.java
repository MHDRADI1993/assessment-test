package steps;

import BaseClasses.CommonFunctions;
import BaseClasses.HomePageVariables;
import BaseClasses.HomePageFunctions;

import BaseSetup.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SearchEngineSteps extends Setup {
    public SearchEngineSteps() throws IOException {
        super();
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunctions();
        homePageFunctions = new HomePageFunctions();
    }

    @When("user type keyword related to service like {string}")
    public void  user_type_keyword_related_to_service_like(String searchKeyword){
        commonFunctions.clickOnElement(homePageVariables.searchField , "Search Field");
        commonFunctions.sendTextInputValue(homePageVariables.searchField , searchKeyword);
    }
    @And("click on search")
    public void click_on_search(){
       commonFunctions.clickOnElement(homePageVariables.searchButton , "Search Button");
    }

    @Then("all services related to the keyword will be displayed for the user {string}")
    public void all_services_realated_to_the_keyword_will_be_displayed_for_the_user(String searchKeyword){
        Assert.assertTrue(homePageFunctions.isSearchResultsRelated(homePageVariables.searchResults, searchKeyword));
    }


}
