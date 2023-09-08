@US19
Feature: US19 Add Meet
  Background: Management sayfasina gidildi
    Given kullanici managementonschool sayfasina gider
    Then kullanici login butonuna tiklar
    And kullanici username alanına username girer
    And kullanici password alanina password girer
    And kullanici login'e tiklar
    Then kullanici menu butonuna tiklar
    Then kullanici Meet management butonuna tiklar
    And kullanici choose student dropdown'undan ogrenci secer


  Scenario: TC01 Pozitif Add Meet
    And kullanici Date of Meet bolumunden ileri bir tarih secer
    Then kullanici start time secer
    Then kullanici stop time secer
    And kullanici description girer
    Then kullanici submit butonuna tiklar
    And kullanici Meet Saved Successfully mesajinin alindiğini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC02 Negative Add Meet (Ileri bir saat)
    And kullanici Date of Meet bolumunden icinde oldugumuz tarihi secer
    Then kullanici start time secer
    Then kullanici stop time secer
    And kullanici description girer
    Then kullanici submit butonuna tiklar
    And kullanici ileri saat seciminde Meet Saved Successfully mesajinin alindiğini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC03 Negative Add Meet (Gecmis tarih)
    And kullanici Date of Meet bolumunden gecmis bir tarih secer
    Then kullanici start time secer
    Then kullanici stop time secer
    And kullanici description girer
    Then kullanici submit butonuna tiklar
    And kullanici Ileri bir tarih olmali mesajinin alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC04 Negative Add Meet (Var olan meet saati)
    And kullanici Date of Meet bolumune meet listte var olan bir tarih secer
    Then kullanici start time secer
    Then kullanici stop time secer
    And kullanici description girer
    Then kullanici submit butonuna tiklar
    And kullanici Error: Meet schedule cannot be selected for the same hour and day mesajinin alindigini dogrular
    And kullanici sayfayi kapatir
