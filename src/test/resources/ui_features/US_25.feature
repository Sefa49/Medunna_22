Feature: US_25  Appointments by Patient Functionality

  Scenario:Us25_Tc_01 Patient can make a new appointment using their protal

    Given Hasta medunna url sine girer
    When  contact tiklar
    Then Name bilgilerini  doldurur
    And Email bilgilerini doldurur
    Then subject bolumu d doldurur
    And message bolumu doldurulabilir
    And send buttonuna tiklar.

