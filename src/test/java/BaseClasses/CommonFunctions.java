package BaseClasses;

import BaseSetup.Setup;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class CommonFunctions extends Setup {
    public CommonFunctions() throws IOException {
        PageFactory.initElements(driver, this);
    }
    public boolean isElementDisplayed(WebElement e, String attribute) {

        try {
            if(e.isDisplayed()) {
                System.out.println("Element " + attribute + " Located");
                logger.log(Status.PASS, "The Element  " + attribute + " is Displayed ");
                return true;
            }else {
                System.out.println("Element not Located");
                logger.log(Status.FAIL, "The Element " + attribute + " not Displayed ");
                return  false;
            }
        }catch(Exception e1) {
            isCommonActionDone = false;
            System.out.println("exception " +attribute );
            logger.log(Status.FAIL, "The Element  " + attribute + " not Displayed as Exception ");
            e1.printStackTrace();
            return false;
        }
    }
    public Boolean getCurrentURL(String url)  {
        try {
            if(driver.getCurrentUrl().toLowerCase().contains(url.toLowerCase())) {
                logger.log(Status.PASS, "Validate URL is passed, Expected url: " + url + ", actual url: " + driver.getCurrentUrl() );
                return true;
            }else {
                logger.log(Status.FAIL, "Validate URL is failed...  Expected url: " + url + " ,Actual url: " + driver.getCurrentUrl());
                return false;
            }


        }catch (Exception e) {
            logger.log(Status.FAIL, "Exception in getting the current URL ");
            return false;
        }
    }
    public void clickOnElement(WebElement e ,String attributeName) {
        try {
            if(isElementDisplayed(e,attributeName)) {
                e.click();
                isCommonActionDone = true;

                logger.log(Status.PASS, "Element " + attributeName + " clicked successfully");
            }else {
                isCommonActionDone = false;
                logger.log(Status.FAIL, "Element " + attributeName + " didn't clicked successfully");

            }
        }catch (Exception e1) {
            isCommonActionDone = false;
            logger.log(Status.FAIL, "Element " + attributeName + " didn't clicked successfully");
            e1.printStackTrace();
        }
    }

    public void sendTextInputValue(WebElement e , String value) {
        try {
            e.sendKeys(value);
            logger.log(Status.PASS, "The Field " + e.getAttribute("id") + " filled successfully with  " + value );
        }
        catch(Exception e1){
            logger.log(Status.FAIL, "The Field " + e.getAttribute("id") + " didn't filled successfully with  " + value );
            e1.printStackTrace();
        }
    }

    public String getElementText(WebElement e ) {

		try {
			if(isElementDisplayed(e,e.getText())) {
				return e.getText();
			}
		}catch(Exception e1) {
			isCommonActionDone = false;
			logger.log(Status.FAIL, "Fetching the elements text was not successfully...");
			e1.printStackTrace();
			return null;
		}
		return null;
	}

    public String getPageTitle() {

        try {
            System.out.println(driver.getTitle() + "Radi");
            return driver.getTitle();

        }catch(Exception e1) {
            logger.log(Status.FAIL, "Can't get Page Title due to Exception");
            e1.printStackTrace();
            return null;
        }
    }

    public String getWebLangauge(){
        return homePageVariables.webLanguage.getAttribute("lang");
    }
}
