Feature:
  @us16
  Scenario: TC01 Basarili Add Student İslemi

    Given kullanici "baseUrl" sayfasina gider
    Then vice dean olarak login islemini yapar
    But kullanici 1 saniye bekler
    And vice dean sayfasinin goruntulendigini dogrular
    But kullanici 1 saniye bekler
    And cikan ekranda Menu butonuna tiklar
    But kullanici 1 saniye bekler
    And acilan menude Contact Get All yazisina tiklar
    But kullanici 1 saniye bekler
    And Contact Message sayfasinin acildigini dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda silme butonunu gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda silme butonunun oldugunu dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesaj yazanlarin isimlerini gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesaj yazanlarin isimlerinin gorundugunu dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesaj yazanlarin email adreslerini gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesaj yazanlarin email adreslerinin gorundugunu dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesajlarin gonderilme tarihini gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesajlarin gonderilme tarihinin gorundugunu dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda  subject kismini gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda  subject kismini gorundugunu dogrular
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesajlari gorur
    But kullanici 1 saniye bekler
    And acilan Contact Message sayfasinda mesajlarin gorundugunu dogrular
    But kullanici 1 saniye bekler
    And Olusturulan mesajlari siler
    But kullanici 1 saniye bekler
    And Mesajlarin silindigini dogrular
    And sayfayi kapatir
