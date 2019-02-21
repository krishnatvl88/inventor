Feature: Login Feature

  Scenario: User logs into Gmail
    Given User access Google Login page
    When User enters Username and Password
    And User clicks on Login
    Then User verifies login success