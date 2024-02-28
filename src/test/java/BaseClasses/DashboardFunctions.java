package BaseClasses;

import BaseSetup.Setup;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashboardFunctions extends Setup {
    public DashboardFunctions() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public boolean isTabDisplayed(String tabName){
        try {
            if (tabName.equalsIgnoreCase(dashboardVariables.myDashboardTab.getText())) {
                return commonFunctions.isElementDisplayed(dashboardVariables.myDashboardTab, tabName);

            } else if (tabName.equalsIgnoreCase(dashboardVariables.myPaymentsTab.getText())) {
                return commonFunctions.isElementDisplayed(dashboardVariables.myPaymentsTab, tabName);

            } else if (tabName.equalsIgnoreCase(dashboardVariables.myProfileTab.getText())) {
                return commonFunctions.isElementDisplayed(dashboardVariables.myProfileTab, tabName);

            } else if (tabName.equalsIgnoreCase(dashboardVariables.allServicesTab.getText())) {
                return commonFunctions.isElementDisplayed(dashboardVariables.allServicesTab, tabName);

            } else if (tabName.equalsIgnoreCase(dashboardVariables.favoriteServicesTab.getText())) {
                return commonFunctions.isElementDisplayed(dashboardVariables.favoriteServicesTab, tabName);
            }
        }catch (Exception e1){
            e1.printStackTrace();
            return false;
        }
        return false;
    }

}
