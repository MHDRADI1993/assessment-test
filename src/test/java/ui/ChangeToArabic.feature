Feature: Change to Arabic
  @firefox
  Scenario: Change DM interface to Arabic
    Given user on DM website
    Then default language will be english
    When click on arabic button
    Then website will be translated to arabic
    And arabic button will be replaced to english