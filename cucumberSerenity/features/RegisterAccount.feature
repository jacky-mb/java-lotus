@feature=register
Feature: create new account
  @success
  Scenario Outline:
    Given I Go to page
    When I fill field data <first_name> <last_name> <company_name> <email> <password> <retype_password>
    And I re login with new account created <email> <password>
    Then I can see text Dashboard
    Examples:
      | first_name | last_name | company_name | email           | password   | retype_password |
      | anh        | le        | lotus        | anhlt@gmail.com | 123456@123 | 123456@123      |