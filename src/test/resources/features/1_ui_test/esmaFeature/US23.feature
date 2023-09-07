Feature: US023 Admin Vice Dean oluşturabilmeli



  @Genelbiruc
  Scenario:TC_01 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character (XXX-XXX-XXXX) hatasi vermeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    Then Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli
    And Sayfa kapatilmali



  @Genelikiuc
  Scenario:TC_02 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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
    And  Sayfa kapatilmali


  @Genelucuc
  Scenario:TC_03 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then phone_number ,username girilmeli
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali


  @Geneldortuc
  Scenario:TC_04 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    Then phone_number ,username girilmeli
    Then SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli
    Then Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali




  @Genelbiaduc
  Scenario:TC_05 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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




  @Genelaltiuc
  Scenario:TC_06 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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




  @Genelyediuc
  Scenario:TC_07 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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




  @Genelsekizuc
  Scenario:TC_08 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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






  @Geneldokuzuc
  Scenario:TC_09 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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






  @Genelonuc
  Scenario:TC_10 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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






  @Genelonbiruc
  Scenario:TC_11 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
    Then Add Vice Dean yazisinin gorunurlugu dogrulanimali
    And Name girilmeli
    And Surname girilmeli
    And Birth Place girilmeli
    Then Cinsiyet secilmeli
    Then Dogum tarihi girilmeli
    And phone_number ,ssn ,username girilmeli
    Then Password;buyuk harf, kucuk harf ve bir rakam icermeli, en az sekiz karakterden olusmadiginda At least '8' characters hata mesajini vermeli
    Then Submit butonu gorunur olmali ve tiklanmali
    And Sayfa kapatilmali





  @Genelonikiuc
  Scenario:TC_12 Admin Vice Dean oluşturabilmeli
    Given Anasayfaya basarili bir sekilde acilmali
    Then Login butonuna gorunur olmali ve tiklanilmali
    Then Admin username ve admin sifre girilir.
    Then Admin sayfasina girildigi dogrulanir.
    Then Menu butonuna tiklanir
    Then Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir
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



















































































