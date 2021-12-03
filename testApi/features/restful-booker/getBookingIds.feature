@feature=getbooking
Feature: get booking id

  Scenario Outline: Call api login restful booker
    Given Setup call api get booking firstname <firstname>, lastname <lastname>, checkin <checkin>, checkout <checkout>
    When Call api login get booking
    Then Cheking response
    Examples: data map
      | firstname | lastname | checkin | checkout |
      |           |          |         |          |