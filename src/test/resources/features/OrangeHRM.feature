Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm home page
    Then I verify that the logo present on page
    And close browser