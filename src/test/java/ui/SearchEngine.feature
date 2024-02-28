Feature: Search Engine
  @firefox
  Scenario: DM Search Engine
    Given user on DM website
    When user type keyword related to service like "death Cases"
    And click on search
    Then all services related to the keyword will be displayed for the user "death Cases"