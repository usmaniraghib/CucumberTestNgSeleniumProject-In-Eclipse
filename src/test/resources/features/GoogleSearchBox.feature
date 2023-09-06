Feature: Google Search Box
  Scenario: Verifying Search Box Is Working Or Not
    Given I launch chrome browser
    When I open google home page
    Then I verify the search box of the page
    And I close the browser