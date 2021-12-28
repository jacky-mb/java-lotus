@feature=loginResfulBooker
Feature: login

  Scenario: test call get token success
    Given Setup
    When Call API
    Then Check token response