package BaseClasses;

import BaseSetup.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class HomePageVariables extends Setup {

    public HomePageVariables() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "profileBtn")
    public WebElement loginButton;

    @FindBy(xpath = "//body[contains(@class,'home page-template page-template-page-templates page-template-homepage page-template-page-templateshomepage-php page page-id-2 sample-page wpb-js-composer js-comp-ver-6.0.5 vc_responsive INDpositionRight INDDesktop INDFirefox INDlangdirLTR INDhasDragTooltip')]/div[@id='page']/section[contains(@class,'dda-header-container')]/header[@id='sub-header']/div[contains(@class,'w-100')]/div[contains(@class,'container d-flex align-center justify-space-between')]/div[contains(@class,'dda-sub-header__actions')]/div[2]")
    public WebElement arabicLanguageButton;


    @FindBy(xpath = "//div[contains(@class,'dda-sub-header__actions')]//div[contains(@class,'position-relative')]//a[contains(@class,'primary--text rounded-circle dda-sub-header__btn dda-sub-header__locale d-flex align-center justify-center bg')][contains(text(),'English')]")
    public WebElement englishLanguageButton;



    @FindBy(xpath = "//div[@id='searchfield']//div[@class='addsearch-searchfield-container']//form[@class='addsearch-searchfield']//div[@class='search-field-wrapper']//input[@type='search']")
    public WebElement searchField;

    @FindBy(id = "searchID")
    public WebElement searchButton;


    @FindBy(xpath = "//a[@href='https://hub.dm.gov.ae/link/servicedetails?ServiceCode=4167']//h2[@class='search-results-result-title'][contains(text(),'Apply for Services Related to')]")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//li[@id='menu-item-302295']//a[contains(text(),'Services')]")
    public WebElement services;

    @FindBy(xpath = "//html")
    public WebElement webLanguage;








}
