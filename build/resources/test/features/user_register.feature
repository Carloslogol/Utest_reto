#Author: Carlos Cogollo

  @Stories

  Feature: User registration in Utest

    @Scenario:
      Scenario: Registration process
        Given User wants to register
        When Complete registration information
          | name   | lastName | email                     | birthMonth | birthDay | birthYear | city     | zip    | country  | computer | version | languaje | movilDevice | modelDevice       | os         | pass               |
          | Carlos | Cogollo  | carlosjcogolloh@gmail.com | March      | 15       | 1997      | Monteria | 230003 | Colombia | Windows  | 7       | English  | Xiaomi      | Mi Note 10 pro    | Android 10 | !#Carlos3007016488 |
        Then  Complete registration
          | textFinal      |
          | Complete Setup |