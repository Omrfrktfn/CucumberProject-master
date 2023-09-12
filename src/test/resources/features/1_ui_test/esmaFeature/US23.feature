@Genel
Feature: US023 Admin Vice Dean oluşturabilmeli

  @Genelbiruc
  Scenario:TC_01 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    And phone_number ,ssn ,username girilmeli usalti
    Then Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    Then Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli usalti
    And Sayfa kapatilmali usalti



  @Genelikiuc
  Scenario:TC_02 Admin Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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
    And  Sayfa kapatilmali usalti


  @Genelucuc
  Scenario:TC_03 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then phone_number ,username girilmeli usalti
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti


  @Geneldortuc
  Scenario:TC_04 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti
    And Name girilmeli usalti
    And Surname girilmeli usalti
    And Birth Place girilmeli usalti
    Then Cinsiyet secilmeli usalti
    Then Dogum tarihi girilmeli usalti
    Then phone_number ,username girilmeli usalti
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli usalti
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti
    Then Submit butonu gorunur olmali ve tiklanmali usalti
    And Sayfa kapatilmali usalti




  @Genelbiaduc
  Scenario:TC_05 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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




  @Genelaltiuc
  Scenario:TC_06 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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




  @Genelyediuc
  Scenario:TC_07 Admin Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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




  @Genelsekizuc
  Scenario:TC_08 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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






  @Geneldokuzuc
  Scenario:TC_09 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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






  @Genelonuc
  Scenario:TC_10 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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






  @Genelonbiruc
  Scenario:TC_11 Admin Vice Dean oluşturabilmeli usalti
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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





  @Genelonikiuc
  Scenario:TC_12 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali usalti
    Then Login butonuna gorunur olmali ve tiklanilmali usalti
    Then Admin username ve admin sifre girilir. usalti
    Then Admin sayfasina girildigi dogrulanir. usalti
    Then Menu butonuna tiklanir usalti
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti
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



















































































