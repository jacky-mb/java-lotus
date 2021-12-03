@feature=creatlocation
Feature: Create new location

  Scenario Outline: Call api steps
    Given Setup data pre call name <name>,desc <desc>, address <address>, zoneId <zoneId>
    When Call API create location
    Then Check status call ok, location was created
    Examples: data
      | name | desc | address | zoneId |
      | NP   | test | HN      |        |