package BaseClasses;

import BaseSetup.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesVariables extends Setup {
    public ServicesVariables() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Individual Services')]")
    public WebElement individualServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Business Services')]")
    public WebElement businessServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Government Services')]")
    public WebElement governmentServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Emirati')]")
    public WebElement emiratiTab;
}
