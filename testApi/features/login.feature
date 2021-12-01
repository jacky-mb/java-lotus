Feature: Create new items
  I can create new face
  Scenario Outline: Create new face successfully
    Given I authentication with account merchant is thanglong, username is test, password is 1
    When I create new face id with  face name <faceName> face path <pathFace> , gender <gender> tags <tags>
    Then I can see status is true

    Examples: example data test

