Feature: Login
  @firefox
  Scenario: Login to DM
    Given user on DM website
    When click on login button from the top right corner
    And enter DM account "MHDRADI1993"
    And enter the password "Radi@2024"
    And click on login button
    Then user will be on the dashboard "https://hub.dm.gov.ae/link/Dashboard"
    And will see the logged user name displayed as "Welcome Username"
    And the dashboard will contain the tab "My Dashboard"
    And the dashboard will contain the tab "My Profile"
    And the dashboard will contain the tab "My Payments"
    And the dashboard will contain the tab "All Services"
    And the dashboard will contain the tab "Favorite Services"
    And will see the summary of the request submitted by him

