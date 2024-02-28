Feature: Services
  @firefox
  Scenario: go to DM services
    Given user on DM website
    When click on services
    Then user will be on services page "https://hub.dm.gov.ae/link/service/"
    And page title displayed as "Services"
    And Services page contain tab "Individual Services"
    And Services page contain tab "Business Services"
    And Services page contain tab "Government Services"
    And Services page contain tab "Emirati"