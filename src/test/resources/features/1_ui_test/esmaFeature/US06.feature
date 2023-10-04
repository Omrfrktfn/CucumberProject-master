@Genel
Feature:US006 Dean Vice Dean oluşturabilmeli


  @Genelbir
  Scenario:TC_01 Dean Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    And Login butonuna gorunur olmali ve tiklanilmali usalti
    And Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    And Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    And Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    And Cinsiyet secilmeli usalti
    And Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    And Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti



  @Geneliki
  Scenario:TC_02 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    Then Name girilmediginde Required mesaji gorulmeli usalti
    Then Surname girilmediginde Required mesaji gorulmeli usalti
    Then Birth Place girilmediginde Required mesaji gorulmeli usalti
    Then Cinsiyet secilmediginde Required mesaji gorulmeli usalti
    Then Dogum tarihi girilmediginde Required mesaji gorulmeli usalti
    Then Telefon numarasi girilmediginde Required mesaji gorulmeli usalti
    Then SSN girilmediginde Required mesaji gorulmeli usalti
    And User Name girilmediginde Required mesaji gorulmeli usalti
    And Password girilmediginde Enter your password mesaji gorulmeli usalti
    And Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Geneluc
  Scenario:TC_03 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then phone_number ,username girilmeli usalti
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli usalti
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti






  @Geneldort
  Scenario:TC_04 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then phone_number ,username girilmeli usalti
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli usalti
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    Then Sayfa kapatilmali usalti







  @Genelbiad
  Scenario:TC_05 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then phone_number ,username girilmeli usalti
    Then SSN girilmeli,  SSN; dokuz rakamdan olusmadiginda Minimum onbir character (XXX-XX-XXXX) mesaji gorunmeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti










  @Genelalti
  Scenario:TC_06 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    Then Password en az sekiz karakterden olusmali,kucuk harf ve bir rakam icermeli, One uppercase character hata yazisi gorulmeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti


  @Genelyedi
  Scenario:TC_07 Dean Vice Dean oluşturabilmelii
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    Then Password en az sekiz karakterden olusmali,buyuk harf ve bir rakam icermeli, One lowercase character hata yazisi gorulmeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Genelsekiz
  Scenario:TC_08 Dean Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then ssn ,username  girilmeli usalti
    Then Daha once kullanilmis telefon numarasi girilmeli, Please enter valid ssn number mesaji gorulmeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Geneldokuz
  Scenario:TC_09 Dean Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then ssn ,username  girilmeli usalti
    Then Telefon numarasi girilmeli,  ucuncu ve altinci rakamdan sonra - icermeli, bu kosullar saglanmadiginda Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Genelon
  Scenario:TC_10 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then ssn ,username  girilmeli usalti
    Then Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Genelonbir
  Scenario:TC_11 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    Then Password;buyuk harf, kucuk harf ve bir rakam icermeli, en az sekiz karakterden olusmadiginda At least eight characters hata mesajini vermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti

  @Geneloniki
  Scenario:TC_12 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti
    Then Vice Dean sayfasi goruntulendigi dogrulanmali usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    Then Password en az sekiz karakterden olusmali, buyuk harf, kucuk harf icermeli, One number mesaji gorulmeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti














