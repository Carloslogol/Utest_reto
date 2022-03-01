#Author: Carlos Cogollo

  @Stories

  Feature: User registration in Utest

    @Scenario:
      Scenario: Registration process
        Given User wants to register
        When Complete registration information
          | name   | lastName | email                     | birthMonth | birthDay | birthYear | city     | zip    | country  | computer | version    | languaje | movildevice | modeldevice | os  |
          | Carlos | Cogollo  | carlosjcogolloh@gmail.com | March      | 15       | 1997      | Monteria | 230003 | Colombia | HP       | 02.02.2022 | English  | Xiaomi      | notebook    | W11 |
        Then  Complete registration