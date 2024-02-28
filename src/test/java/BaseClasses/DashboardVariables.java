package BaseClasses;

import BaseSetup.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashboardVariables extends Setup {
    public DashboardVariables() throws IOException {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[@class='mx-text mx-name-text1']")
    public WebElement welcomeMessage;
    @FindBy(xpath = "//button[text()='My Dashboard']")
    public WebElement myDashboardTab;
    @FindBy(xpath = "//button[text()='My Profile']")
    public WebElement myProfileTab;
    @FindBy(xpath = "//button[text()='My Payments']")
    public WebElement myPaymentsTab;
    @FindBy(xpath = "//button[text()='All Services']")
    public WebElement allServicesTab;
    @FindBy(xpath = "//button[text()='Favorite Services']")
    public WebElement favoriteServicesTab;
    @FindBy(xpath = "//div[@class='mx-name-container36 mx-auto']")
    public WebElement serviceRequestSummary;
    @FindBy(xpath = "//button[text()='Profile']")
    public WebElement profile;
    @FindBy(css = "body.INDlangdirLTR.INDpositionRight.INDDesktop.INDFirefox.INDhasDragTooltip.profile-desktop.role-user:nth-child(2) div.mx-page.layout-atlas.layout-atlas-responsive-default.page-dashboard.page-dashboard-actions div.mx-placeholder div.mx-scrollcontainer.mx-scrollcontainer-horizontal.mx-scrollcontainer-push div.mx-scrollcontainer-center div.mx-scrollcontainer-wrapper.mx-scrollcontainer-nested div.mx-scrollcontainer.mx-scrollcontainer-vertical div.mx-scrollcontainer-top.region-topbar.smart_header div.mx-scrollcontainer-wrapper header.mx-name-Header1.site-header div.mx-dataview.mx-name-dataView2.form-horizontal:nth-child(2) div.mx-dataview-content div.mx-name-container24 div.mx-name-container30.dda-header-container div.mx-name-container31.dda-sub-header.d-flex.align-center.white div.mx-name-container32.w-100 div.mx-name-container33.container.d-flex.align-center.justify-space-between.no-pad div.mx-name-container40.dda-sub-header__actions div.mx-name-container43.position-relative:nth-child(6) div.mx-name-container14.profile-dropdown.active:nth-child(4) > a.mx-link.mx-name-actionButton4:nth-child(4)")
    public WebElement logout;





}
