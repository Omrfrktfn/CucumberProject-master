@Genel
Feature: US023 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  @Genelbiryedi
  Scenario:TC_01 Dean, kullanıcıların gönderdiği mesajları görebilmelidir. usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    Then Menu butonuna tiklanmali usalti
    Then Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali usalti
    Then Contact Message sayfasinin acildigi dogrulanmali usalti
    Then Silme butonunun gorunurlugu dogrulanmali usalti
    Then Mesajlari silinebilmeli ve mesajin silindigi dogrulanmali, silinmediyse silinmedigi dogrulanmali usalti
    Then Sayfa kapatilmali usalti




  @Genelikiyedi
  Scenario:TC_02 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    Then Menu butonuna tiklanmali usalti
    Then Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali usalti
    Then Contact Message sayfasinin acildigi dogrulanmali usalti
    Then Mesajlarin gorunurlugu dogrulanmali usalti
    Then Mesajlarin yazarlarinin, e-maillerinin, gonderilme tarihinin,subject bilgilerinin gorunurlugu dogrulanmali usalti
    Then Sayfa kapatilmali usalti