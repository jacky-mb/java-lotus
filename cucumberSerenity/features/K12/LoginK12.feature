@feature=logink12
Feature: login k12

  Scenario Outline: Login success
    Given I go to page ,url is https://test1.k12online.vn/?page=login
    When I enter authorize with user <user> and password is <password>
    Then  I see <result>
    Examples: data test
      | user     | password | result               |
      | admink12 | Vhv@2020 | Đăng nhập thành công |