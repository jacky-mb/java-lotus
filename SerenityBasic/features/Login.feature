@feature=testlogin
Feature: Login page with multiple account

  Scenario Outline: Test login with account
    Given I go to page
    When I enter author info merchantId is <merchantId>, email is <email>, password is <password>
    Then Click submit and verify result
    Examples:
      | merchantId | email | password |
      | thang long | test  | 1        |