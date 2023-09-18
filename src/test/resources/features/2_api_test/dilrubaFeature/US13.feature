@US13apitesti
Feature: Vice Dean Ogretmen Olusturmasi
  Scenario: Ogretmen basarili bir sekilde eklenebilmeli
    Given Ogretmen eklemek icin post request hazirligi yapilir
    And Gonderilecek ogretmen bilgileri hazirlanir
    When Ogretmen eklemek icin post request gonderilir
    Then Ogretmen bilgileri dogrulanir
