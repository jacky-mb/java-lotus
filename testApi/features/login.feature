Feature: Create new items
  I can create new face
  Scenario : Create new location successfully
    Given I create body with name NPVN
    When  call API create location
    Then Check location was created


