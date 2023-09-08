@US20
Feature: US20 Meet List
  Background: Management sayfasina gidildi
    Given kullanici managementonschool sayfasina gider
    Then kullanici login butonuna tiklar
    And kullanici username alanına username girer
    And kullanici password alanina password girer
    And kullanici login'e tiklar
    Then kullanici menu butonuna tiklar
    Then kullanici Meet management butonuna tiklar

  Scenario: TC01 Pozitif Meet List
    And kullanici date bolumunun gorulebilir oldugunu dogrular
    Then kullanici start time bolumunun gorulebilir oldugunu dogrular
    Then kullanici stop time bolumunun gorulebilir oldugunu dogrular
    And kullanici description bolumunun gorulebilir oldugunu dogrular
    Then kullanici edit butonunun tiklanabilir oldugunu dogrular
    And kullanici delete butonunun tiklanabilir oldugunu dogrular
    And kullanici sayfayi kapatir

  Scenario: TC02 Pozitif Meet List
    And kullanici edit butonuna tiklar
    Then kullanici edit bolumunden date tarihini ileri bir tarihle degistirir
    Then kullanici edit bolumunden description bolumunu degistirir
    And kullanici edit bolumunden submit butonuna tiklar
    Then kullanici Meet Updated Successfully mesaji alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC03 Pozitif Meet List
    And kullanici edit butonuna tiklar
    Then kullanici edit bolumunden start time degistirir
    Then kullanici edit bolumunden stop time degistirir
    And kullanici edit bolumunden submit butonuna tiklar
    Then kullanici saat guncellemesinden Meet Updated Successfully mesaji alindigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC04 Pozitif Meet List
    And kullanici delete butonuna tiklar
    Then kullanici Meet deleted successfully mesaji alindigini dogrular
    And kullanici sayfayi kapatir