@api
Feature: Get ContactController Request

  Scenario: Get SearchBySubject ile Dogrulama

    Given Contact eklemek icin Post request hazirligi yapilir
    And Gonderilecek contact bilgileri hazirlanir
    When Contact eklemek icin Post request gonderilir
    Then Contact bilgileri dogrulanir
