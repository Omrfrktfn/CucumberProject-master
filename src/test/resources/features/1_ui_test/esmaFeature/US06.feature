Feature:US006 Dean Vice Dean oluşturabilmeli


  @Genelbir
  Scenario:TC_01 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    And Login butonuna gorunur olmali ve tiklanilmali
    And Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    And Vice Dean sayfasi goruntulendigi dogrulanmali
    And Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    And Cinsiyet secilmeli
    And Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    And Submit butonu gorunur olmali ve tiklanmali
    Then Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli
    And Sayfa kapatilmali



  @Geneliki
  Scenario:TC_02 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    Then Name girilmediginde Required mesaji gorulmeli
    Then Surname girilmediginde Required mesaji gorulmeli
    Then Birth Place girilmediginde Required mesaji gorulmeli
    Then Cinsiyet secilmediginde Required mesaji gorulmeli
    Then Dogum tarihi girilmediginde Required mesaji gorulmeli
    Then Telefon numarasi girilmediginde Required mesaji gorulmeli
    Then SSN girilmediginde Required mesaji gorulmeli
    And User Name girilmediginde Required mesaji gorulmeli
    And Password girilmediginde Enter your password mesaji gorulmeli
    And Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Geneluc
  Scenario:TC_03 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then phone_number ,username girilmeli
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali






  @Geneldort
  Scenario:TC_04 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then phone_number ,username girilmeli
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli
    And Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    Then Sayfa kapatilmali







  @Genelbiad
  Scenario:TC_05 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then phone_number ,username girilmeli
    Then SSN girilmeli,  SSN; dokuz rakamdan olusmadiginda Minimum onbir character (XXX-XX-XXXX) mesaji gorunmeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali










  @Genelalti
  Scenario:TC_06 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Password en az sekiz karakterden olusmali,kucuk harf ve bir rakam icermeli, One uppercase character hata yazisi gorulmeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali


  @Genelyedi
  Scenario:TC_07 Dean Vice Dean oluşturabilmelii
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Password en az sekiz karakterden olusmali,buyuk harf ve bir rakam icermeli, One lowercase character hata yazisi gorulmeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Genelsekiz
  Scenario:TC_08 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then ssn ,username  girilmeli
    Then Daha once kullanilmis telefon numarasi girilmeli, Please enter valid ssn number mesaji gorulmeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Geneldokuz
  Scenario:TC_09 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then ssn ,username  girilmeli
    Then Telefon numarasi girilmeli,  ucuncu ve altinci rakamdan sonra - icermeli, bu kosullar saglanmadiginda Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Genelon
  Scenario:TC_10 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then ssn ,username  girilmeli
    Then Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Genelonbir
  Scenario:TC_11 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Password;buyuk harf, kucuk harf ve bir rakam icermeli, en az sekiz karakterden olusmadiginda At least eight characters hata mesajini vermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali

  @Geneloniki
  Scenario:TC_12 Dean Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali
    Then Vice Dean sayfasi goruntulendigi dogrulanmali
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Password en az sekiz karakterden olusmali, buyuk harf, kucuk harf icermeli, One number mesaji gorulmeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali














