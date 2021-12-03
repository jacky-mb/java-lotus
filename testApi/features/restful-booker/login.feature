@feature=login
  Feature: auth restful booker
    Scenario: Call api login restful booker
      Given Set up call api login with username admin and password password123
      When Call api login
      Then Check api return token field