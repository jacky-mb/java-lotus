@feature=createEvent
Feature: create new event

  @eventSuccess
  Scenario Outline: create event success
    Given Iam on admin page with account admin02@mailinator.com, 123456
    When I open form create new Event
    And I created new event with title : <title>, desc: <desc>, startDate: <startDate>, endDate: <endDate>,startTime: <startTime>,endTime: <endTime>,location: <location>,labels: <labels>,clientId: <clientId>,repeat: <repeat>
    Then Can see text create new event success fully
    Examples:
      | title | desc | startDate  | endDate    | startTime | endTime | location | labels | clientId | repeat |
      | test  | demo | 2021-11-24 | 2022-11-24 | 1:00 AM   | 2:00 AM | Hà Nội   | label  | dsadsa   | dsadsa |

  @eventFail
  Scenario Outline: create event fails
    Given Iam on admin page with account admin02@mailinator.com, 123456
    When I open form create new Event
    And I created new event with title : <title>, desc: <desc>, startDate: <startDate>, endDate: <endDate>,startTime: <startTime>,endTime: <endTime>,location: <location>,labels: <labels>,clientId: <clientId>,repeat: <repeat>
    Then Can see text This field is required.
    Examples:
      | title | desc | startDate  | endDate    | startTime | endTime | location | labels | clientId | repeat |
      |       | demo | 2021-11-24 | 2022-11-24 | 1:00 AM   | 2:00 AM | Hà Nội   | label  | dsadsa   | dsadsa |
      | dsds  |      | 2021-11-24 | 2022-11-24 | 1:00 AM   | 2:00 AM | Hà Nội   | label  | dsadsa   | dsadsa |