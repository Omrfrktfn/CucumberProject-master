@US21
Feature: US21 Lesson
  Background:  Background: Management sayfasina gidildi
    Given kullanici managementonschool sayfasina gider
    Then kullanici login butonuna tiklar
    And kullanici student username alanına username girer
    And kullanici student password alanina password girer
    And kullanici login'e tiklar

  Scenario: TC01 Pozitif Choose Lesson
    And kullanici Choose lesson bolumunden teacher bolumunun gorulebilir oldugunu dogrular
    Then kullanici Choose lesson bolumunden day bolumunun gorulebilir oldugunu dogrular
    Then kullanici Choose lesson bolumunden start time bolumunun gorulebilir oldugunu dogrular
    And kullanici Choose lesson bolumunden stop time bolumunun gorulebilir oldugunu dogrular
    And kullanici sayfayi kapatir

  Scenario: TC02 Pozitif Choose Lesson
    And kullanici ders secer
    And kullanici choose lesson bolumunden submite tiklar
    Then kullanici Lesson added to Student mesaji alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC03 Negative Choose Lesson(Birden fazla ders secimi)
    And kullanici iki ders secer
    And kullanici choose lesson bolumunden submite tiklar
    Then kullanici iki ders seciminden Lesson added to Student mesaji alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC04 Negative Choose Lesson(Aynı gün ve saat secimi)
    And kullanici ders programinda ekli olan, ayni gun ve saate denk gelen baska bir ders secer
    And kullanici choose lesson bolumunden submite tiklar
    Then kullanici Error: Course schedule cannot be selected for the same hour and day mesaji alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC05 Student sınav notlarını görebilmeli
    And kullanici menu butonuna tiklar
    And kullanici Grades and Announcements butonuna tiklar
    Then kullanici Student Info List bolumunden notlarinin gorundugunu dogrular
    And kullanici sayfayi kapatir

  Scenario: TC06 Student sınav notlarını görebilmeli
    And kullanici menu butonuna tiklar
    And kullanici Grades and Announcements butonuna tiklar
    Then kullanici Meet List bolumunden toplantilarinin gorundugunu dogrular
    And kullanici sayfayi kapatir
