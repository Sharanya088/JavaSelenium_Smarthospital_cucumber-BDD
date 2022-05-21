Feature: feature to test Signin functionality

  Scenario: Successful Signin with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://demo.smart-hospital.in/site/login"
    Then click on Doctor
    And click on Signin
    And click on Billing
    And click on path
    And close browser
