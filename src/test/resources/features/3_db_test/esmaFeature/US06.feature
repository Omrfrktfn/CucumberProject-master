@Databasehepsi
Feature:US006 Dean Vice Dean oluşturabilmeli

  @Genelbirdatabase
  Scenario:TC_01 Dean Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti database
    And Login butonuna gorunur olmali ve tiklanilmali usalti database
    And Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti database
    And Vice Dean sayfasi goruntulendigi dogrulanmali usalti database
    And Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti database
    And Name girilmeli usalti database
    And Surname girilmeli usalti database
    And Birth Place girilmeli usalti database
    And Cinsiyet secilmeli usalti database
    And Dogum tarihi girilmeli usalti database
    And phone_number ,ssn ,username girilmeli usalti database
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti database
    And Submit butonu gorunur olmali ve tiklanmali usalti database
    Then hesaptan cikis yapildi

  @apiusaltidatabase
  Scenario: Dean, Vice Dean hesabı olusturur
    Given Vice Dean eklemek icin Post request hazirligi yapilir usalti database
    And Gonderilecek Vice Dean bilgileri hazirlanir usalti database
    When Vice Dean eklemek icin Post request gonderilir usalti database
    Then Vice Dean bilgileri dogrulanir usalti database

@Databaseusalti
    Scenario: TC01 Database testiyle dogrulanir
      Given Database e baglan usalti
      When gecerli kullanici ile username i cagir usalti
      Then Var olan bodyde name, username, birthplace, cinsiyet, dogum tarihi, phone_number, ssn icerdigini test et usalti


