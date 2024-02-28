Feature: Logout
  @firefox
  Scenario: Logout from DM
    Given user on DM website
    When click on login button from the top right corner
    And enter DM account "MHDRADI1993"
    And enter the password "Radi@2024"
    And click on login button
    Then user will be on the dashboard "https://hub.dm.gov.ae/link/Dashboard"
    When user click on profile
    And click on logout button
    Then user will be on home page
    And there will be login option
