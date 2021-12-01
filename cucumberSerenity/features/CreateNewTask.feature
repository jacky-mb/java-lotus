@feature=createNewTask
Feature: create new task

  @success
  Scenario Outline:
    Given I am on admin page with account admin02@mailinator.com,123456
    Then User is on homepage
    When I created new task with title : <title>, desc: <desc>, project: <project>, point: <point>,milestone: <ms>,assign: <assign>,collabrators: <Collaborators>,status: <Status>,labels: <Labels>,start: <start>,end: <end>
    Then I can see text asdsa ok
    Examples:
      | title | desc        | project | point | ms     | assign | Collaborators | Status | Labels | start  | end    |
      | test  | description | PD02    | a     | dasdsa | dsadsa | dsadsad       | dsadsa | dsadsa | dsadsa | dsadsa |
