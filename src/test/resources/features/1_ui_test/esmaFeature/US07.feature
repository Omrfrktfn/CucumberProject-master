Feature: US023 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  @Genelbiryedi
  Scenario:TC_01 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    Then Menu butonuna tiklanmali
    Then Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali
    Then Contact Message sayfasinin acildigi dogrulanmali
    Then Silme butonunun gorunurlugu dogrulanmali
    Then Mesajlari silinebilmeli ve mesajin silindigi dogrulanmali, silinmediyse silinmedigi dogrulanmali
    Then Sayfa kapatilmali




  @Genelikiyedi
  Scenario:TC_02 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    Then Menu butonuna tiklanmali
    Then Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali
    Then Contact Message sayfasinin acildigi dogrulanmali
    Then Mesajlarin gorunurlugu dogrulanmali
    Then Mesajlarin yazarlarinin, e-maillerinin, gonderilme tarihinin,subject bilgilerinin gorunurlugu dogrulanmali
    Then Sayfa kapatilmali