@Databasehepsi
Feature: US023 Admin Vice Dean oluşturabilmeli

  Scenario:TC_01 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti databaseyirmiuc
    And Login butonuna gorunur olmali ve tiklanilmali usalti database
    Then Admin username ve admin sifre girilir. usalti databaseyirmiuc
    Then Admin sayfasina girildigi dogrulanir. usalti databaseyirmiuc
    Then Menu butonuna tiklanir usalti databaseyirmiuc
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti databaseyirmiuc
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti databaseyirmiuc
    And Name girilmeli usalti databaseyirmiuc
    And Surname girilmeli usalti databaseyirmiuc
    And Birth Place girilmeli usalti databaseyirmiuc
    Then Cinsiyet secilmeli usalti databaseyirmiuc
    Then Dogum tarihi girilmeli usalti databaseyirmiuc
    And phone_number ,ssn ,username girilmeli usalti databaseyirmiuc
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti databaseyirmiuc
    Then Submit butonu gorunur olmali ve tiklanmali usalti databaseyirmiuc

  Scenario: Admin, Vice Dean hesabı olusturur
    Given Vice Dean eklemek icin Post request hazirligi yapilir usyirmiuc databaseyirmiuc
    And Gonderilecek Vice Dean bilgileri hazirlanir usyirmiuc databaseyirmiuc
    When Vice Dean eklemek icin Post request gonderilir usyirmiuc databaseyirmiuc
    Then Vice Dean bilgileri dogrulanir usyirmiuc databaseyirmiuc


  Scenario: TC01 Database testiyle dogrulanir
    Given Database e baglan usalti databaseyirmiuc
    When gecerli kullanici ile username i cagir usalti databaseyirmiuc
    Then Var olan bodyde name, username, birthplace, cinsiyet, dogum tarihi, phone_number, ssn icerdigini test et usalti databaseyirmiuc
    And Sayfa kapatilmali usalti databaseyirmiuc
