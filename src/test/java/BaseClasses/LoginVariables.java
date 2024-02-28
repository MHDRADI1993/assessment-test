package BaseClasses;

import BaseSetup.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginVariables extends Setup {
    public LoginVariables() throws IOException {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "loginForm:username")
    public WebElement userName;

    @FindBy(id = "loginForm:password")
    public WebElement password;

    @FindBy(id = "Button_cust")
    public WebElement login;




}
