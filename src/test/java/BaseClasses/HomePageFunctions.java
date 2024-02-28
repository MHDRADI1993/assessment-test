package BaseClasses;

import BaseSetup.Setup;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class HomePageFunctions extends Setup {
    public HomePageFunctions() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public boolean isSearchResultsRelated(List<WebElement> searchResults ,  String searchKeyword){

        return commonFunctions.getElementText(searchResults.get(0)).toLowerCase().contains(searchKeyword.toLowerCase());

    }

    public boolean isEnglishLanguage(){
        if(commonFunctions.getWebLangauge().contains("English") || commonFunctions.getWebLangauge().contains("en")){
            logger.log(Status.PASS, " Actual Default Web Language is " + commonFunctions.getWebLangauge() + " Expected Default Web Language is " + "English");
            return true;
        }else {
            logger.log(Status.FAIL, " Actual Default Web Language is " + commonFunctions.getWebLangauge() + " Expected Default Web Language is " + "English");
            return false;
        }
    }

    public boolean isArabicLanguage(){
        if(commonFunctions.getWebLangauge()!= null &&  commonFunctions.getWebLangauge().toLowerCase().contains("ar")){
            logger.log(Status.PASS, " Actual Web Language is " + commonFunctions.getWebLangauge() + " Expected Web Language is " + "Arabic");
            return true;
        }else {
            logger.log(Status.FAIL, " Actual  Web Language is " + commonFunctions.getWebLangauge() + " Expected Web Language is " + "Arabic");
            return false;
        }
    }
}
