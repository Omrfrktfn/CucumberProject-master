
Feature: Guest User Register Request

  Scenario: Get SearchById ile Dogrulama

    Given Register eklemek icin Post request hazirligi yapilir
    And Gonderilecek register bilgileri hazirlanir
    When Register eklemek icin Post request gonderilir
    Then Register bilgileri dogrulanir
