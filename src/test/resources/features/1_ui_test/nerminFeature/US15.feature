Feature:
  Background:
    Given kullanici "baseUrl" sayfasina gider
    Then vice dean olarak login islemini yapar
    But kullanici 1 saniye bekler
    And vice dean sayfasinin goruntulendigini dogrular
    But kullanici 1 saniye bekler
    And cikan ekranda Menu butonuna tiklar
    But kullanici 1 saniye bekler
    And acilan menude Student Management kismini secer
    But kullanici 1 saniye bekler
    And Add Student sayfasinin acildigini dogrular
    But kullanici 1 saniye bekler

  @tc01
  Scenario: TC01 Basarili Add Student Islemi

    And acilan Add Student sayfasinda Choose Advisor Teacher secer
    But kullanici 1 saniye bekler
    And Name alanina "<name>" girer
    But kullanici 1 saniye bekler
    And Surname alanina "<surname>" girer
    But kullanici 1 saniye bekler
    And Birth Place alanina "<birth_place>" girer
    But kullanici 1 saniye bekler
    And E-mail alanina "<email_address>" girer
    But kullanici 1 saniye bekler
    And Phone alanina "<phone_number>" girer
    But kullanici 1 saniye bekler
    And Cinsiyet "<gender>" secer
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina "<birth_day>" girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" girer
    But kullanici 1 saniye bekler
    And User Name alanina "<username>" girer
    But kullanici 1 saniye bekler
    And Father Name alanina "<father_Name>" girer
    But kullanici 1 saniye bekler
    And Mother Name alanina "<mother_Name>" girer
    But kullanici 1 saniye bekler
    And Password alanina password girer
    But kullanici 1 saniye bekler
    And Submit butonuna tiklar
    But kullanici 1 saniye bekler
    And “Student saved succesfull” yazisini goruntuler
    But kullanici 1 saniye bekler
    And Basarili bir sekilde kaydoldugunu dogrular
    But kullanici 1 saniye bekler
    And Student number’in otomatik olarak Student List bolumune geldigini dogrular
    And sayfayi kapatir

  @tc02
  Scenario: TC02 Basarisiz Add Student Islemi (Choose Advisor Teacher secilmemeli)

    And acilan Add Student sayfasinda Choose Advisor Teacher secmeden devam eder
    But kullanici 1 saniye bekler
    And Name alanina "<name>" girer
    But kullanici 1 saniye bekler
    And Surname alanina "<surname>" girer
    But kullanici 1 saniye bekler
    And Birth Place alanina "<birth_place>" girer
    But kullanici 1 saniye bekler
    And E-mail alanina "<email_address>" girer
    But kullanici 1 saniye bekler
    And Phone alanina "<phone_number>" girer
    But kullanici 1 saniye bekler
    And Cinsiyet "<gender>" secer
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina "<birth_day>" girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" girer
    But kullanici 1 saniye bekler
    And User Name alanina "<username>" girer
    But kullanici 1 saniye bekler
    And Father Name alanina "<father_Name>" girer
    But kullanici 1 saniye bekler
    And Mother Name alanina "<mother_Name>" girer
    But kullanici 1 saniye bekler
    And Password alanina password girer
    But kullanici 1 saniye bekler
    And Submit butonuna tiklar
    But kullanici 1 saniye bekler
    And “Please select advisor teacher” yazili hata mesajini alir
    But kullanici 1 saniye bekler
    And Advisor teacher secmedigi icin kayit isleminin tamamlanmadigini dogrular
    And sayfayi kapatir


  Scenario: TC03 Basarisiz Add Student Islemi (name, surname, birth place, email)

    And acilan Add Student sayfasinda Choose Advisor Teacher secer
    But kullanici 1 saniye bekler
    And Name alanina isim girer
    But kullanici 1 saniye bekler
    And Surname alanina soyisim girer
    But kullanici 1 saniye bekler
    And Birth Place alanina dogum yeri girer
    But kullanici 1 saniye bekler
    And E-mail alanina email adres girer
    But kullanici 1 saniye bekler
    And Phone alanina "<phone_number>" girer
    But kullanici 1 saniye bekler
    And Cinsiyet "<gender>" secer
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina "<birth_day>" girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" girer
    But kullanici 1 saniye bekler
    And User Name alanina "<username>" girer
    But kullanici 1 saniye bekler
    And Father Name alanina "<father_Name>" girer
    But kullanici 1 saniye bekler
    And Mother Name alanina "<mother_Name>" girer
    But kullanici 1 saniye bekler
    And Password alanina password girer
    But kullanici 1 saniye bekler
    And Submit butonuna tiklar
    But kullanici 1 saniye bekler
    And “Your name should be at least 2 characters” yazili hata mesajini alir
    And “Your surname should be at least 2 characters” yazili hata mesajini alir
    And “Your birth place should be at least 2 characters” yazili hata mesajini alir
    And “Your email should be between 5 and 50 characters” yazili hata mesajini alir
    And name, surname, birth place, email uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular
    And sayfayi kapatir


  Scenario: TC04 Basarisiz Add Student Islemi (phone number, ileri bir dogum tarihi, ssn)

    And acilan Add Student sayfasinda Choose Advisor Teacher secer
    But kullanici 1 saniye bekler
    And Name alanina "<name>" girer
    But kullanici 1 saniye bekler
    And Surname alanina "<surname>" girer
    But kullanici 1 saniye bekler
    And Birth Place alanina "<birth_place>" girer
    But kullanici 1 saniye bekler
    And E-mail alanina "<email_address>" girer
    But kullanici 1 saniye bekler
    And Phone alanina telefon numarasi girer
    But kullanici 1 saniye bekler
    And Cinsiyet "<gender>" secer
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina dogum tarihini girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" “-” olmadan girer
    But kullanici 1 saniye bekler
    And User Name alanina "<username>" girer
    But kullanici 1 saniye bekler
    And Father Name alanina "<father_Name>" girer
    But kullanici 1 saniye bekler
    And Mother Name alanina "<mother_Name>" girer
    But kullanici 1 saniye bekler
    And Password alanina password girer
    But kullanici 1 saniye bekler
    And Submit butonuna tiklar
    But kullanici 1 saniye bekler
    And “Please enter valid phone number” yazili hata mesajini alir
    And “Gecmis bir tarih olmali” yazili hata mesajini alir
    And “Please enter valid SSN number” yazili hata mesajini alir
    And phone number, ileri bir dogum tarihi, ssn uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular
    And sayfayi kapatir

  Scenario: TC05 Basarisiz Add Student Islemi (username, father name, mother name)

    And acilan Add Student sayfasinda Choose Advisor Teacher secer
    But kullanici 1 saniye bekler
    And Name alanina "<name>" girer
    But kullanici 1 saniye bekler
    And Surname alanina "<surname>" girer
    But kullanici 1 saniye bekler
    And Birth Place alanina "<birth_place>" girer
    But kullanici 1 saniye bekler
    And E-mail alanina "<email_address>" girer
    But kullanici 1 saniye bekler
    And Phone alanina "<phone_number>" girer
    But kullanici 1 saniye bekler
    And Cinsiyet "<gender>" secer
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina "<birth_day>" girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" girer
    But kullanici 1 saniye bekler
    And User Name alanina kullanici adi girer
    But kullanici 1 saniye bekler
    And Father Name alanina baba adi girer
    But kullanici 1 saniye bekler
    And Mother Name alanina anne adi girer
    But kullanici 1 saniye bekler
    And Password alanina password girer
    But kullanici 1 saniye bekler
    And Submit butonuna tiklar
    But kullanici 1 saniye bekler
    And “Your father name should be at least 2 characters” yazili hata mesajini alir
    And “Your mother name should be at least 2 characters” yazili hata mesajini alir
    And “Your user name should be at least 4 characters” yazili hata mesajini alir
    And username, father name, mother name uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular
    And sayfayi kapatir


  Scenario: TC06 Basarisiz Add Student Islemi (gender secilmez, password)

    And acilan Add Student sayfasinda Choose Advisor Teacher secer
    But kullanici 1 saniye bekler
    And Name alanina "<name>" girer
    But kullanici 1 saniye bekler
    And Surname alanina "<surname>" girer
    But kullanici 1 saniye bekler
    And Birth Place alanina "<birth_place>" girer
    But kullanici 1 saniye bekler
    And E-mail alanina "<email_address>" girer
    But kullanici 1 saniye bekler
    And Phone alanina "<phone_number>" girer
    But kullanici 1 saniye bekler
    And Cinsiyet secmeden devam eder
    But kullanici 1 saniye bekler
    And Dogum tarihi alanina "<birth_day>" girer
    But kullanici 1 saniye bekler
    And SSN alanina "<ssn>" girer
    But kullanici 1 saniye bekler
    And User Name alanina "<username>" girer
    But kullanici 1 saniye bekler
    And Father Name alanina "<father_Name>" girer
    But kullanici 1 saniye bekler
    And Mother Name alanina "<mother_Name>" girer
    But kullanici 1 saniye bekler
    And sifreyi kucuk harflerle ve rakamlarla girer
    And “One Upper Case Character" yazisinin gorundugunu dogrular
    And sifreyi buyuk harflerle ve rakamlarla girer
    And “One Lower Case Character" yazisinin gorundugunu dogrular
    And sifreyi kucuk harf ve buyuk harf ile girer
    And “One number” yazisinin gorundugunu dogrular
    And Parolayi 8 karakterden az girer
    And “At least 8 Characters” yazisinin gorundugunu dogrular
    And Sifreyi istenilen sekilde olarak girer
    And Submit butonuna tiklar
    And “You have entered an invalid value. Valid values are: MALE, FEMALE” yazili hata mesajini alir
    And gender secmedigi icin kayit isleminin tamamlanmadigini dogrular
    And sayfayi kapatir