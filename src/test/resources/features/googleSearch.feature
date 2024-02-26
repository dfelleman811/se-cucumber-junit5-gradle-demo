Feature: Google Search

  Scenario Outline: Google Search Works
    Given User is on Google Home Page
    When User types in "<searchValue>"
    And User hits Enter
    Then User should see results for "<pageTitle>"


    Examples:
    | searchValue | pageTitle |
    | mario | mario - Google Search|
    | luigi | luigi - Google Search |