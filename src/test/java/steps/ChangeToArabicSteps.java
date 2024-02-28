package steps;

import BaseClasses.HomePageFunctions;
import BaseSetup.Setup;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.io.IOException;

public class ChangeToArabicSteps extends Setup {
    public ChangeToArabicSteps() throws IOException {
        super();
        homePageFunctions = new HomePageFunctions();
    }


    @Then ("default language will be english")
    public void default_language_will_be_english(){
        softAssert.assertTrue(homePageFunctions.isEnglishLanguage());
    }

    @When("click on arabic button")
    public void click_on_arabic_button(){
        commonFunctions.clickOnElement(homePageVariables.arabicLanguageButton , "Language");
    }

    @Then("website will be translated to arabic")
    public void website_will_be_translated_to_arabic(){
        softAssert.assertTrue(homePageFunctions.isArabicLanguage());
    }

    @And("arabic button will be replaced to english")
    public void arabic_button_will_be_replaced_to_english(){
        softAssert.assertEquals(commonFunctions.getElementText(homePageVariables.englishLanguageButton).toLowerCase(), "english");
    }
}
