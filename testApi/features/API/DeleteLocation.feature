@feature=deleteLocation
Feature: delete location

  Scenario Outline: Call api scenario
    Given Setup data pre call name <name>,desc <desc>, address <address>, zoneId <zoneId>
    When Call API create location
    Then Check status call ok, location was created
    When Call api delete location with id
    Then Check status call ok, location was deleted
    Examples: data
      | name | desc | address | zoneId      |
      | NP   | test | HN      | dsds,dsdsds |