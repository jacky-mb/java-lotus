@feature=createBooking
Feature: create new booking

  Scenario Outline: create new booking
    Given Setup call api get booking firstname <firstname>, lastname <lastname>, checkin <checkin>, checkout <checkout>
    When Call api login get booking
    Then Cheking response
    Examples: data map
      | firstname | lastname | checkin | checkout |
      |           |          |         |          |