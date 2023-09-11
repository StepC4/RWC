

Feature: A description
  Background: The user start on "https://www.rugbyworldcup.com/2023/"
    Given the user is on "https://www.rugbyworldcup.com/2023/"

  Scenario: A scenario
    When he click on accept all
    Then The cookies windows vanish
    When the user click on "pool" on the nav bar
    Then he arrives on the right page

  Scenario: B
