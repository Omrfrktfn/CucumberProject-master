package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import team12.pages.US06_US07_US03Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;


import static org.junit.Assert.assertTrue;

public class US06_US07_US23Def {

    Response response;


    US06_US07_US03Pages homePage = new US06_US07_US03Pages();
    private static String fakeUsername;
    private static String fakeSsn;
    private static String fakePhoneNumber;
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    //US06
    //TC01
    @Given("Anasayfaya basarili bir sekilde acilmali")
    public void anasayfayaBasariliBirSekildeAcilmali() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        ReusableMethods.bekle(3);

    }


    @Then("Login butonuna gorunur olmali ve tiklanilmali")
    public void loginButonunaGorunurOlmaliVeTiklanilmali() {

        ReusableMethods.click(US06_US07_US03Pages.login);
        ReusableMethods.bekle(3);


    }

    @Then("Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali")
    public void deanUsernameVeDeanSifreGirilmeliLoginGirisButonunaTiklanmali() {

        US06_US07_US03Pages.username.sendKeys(ConfigReader.getProperty("deanName") + Keys.TAB + ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.loginButton);
        ReusableMethods.bekle(3);


    }

    @Then("Vice Dean sayfasi goruntulendigi dogrulanmali")
    public void viceDeanSayfasiGoruntulendigiDogrulanmali() {

        assertTrue(US06_US07_US03Pages.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Add Vice Dean yazisinin gorunurlugu dogrulanimali")
    public void addViceDeanYazisininGorunurluguDogrulanimali() {

        assertTrue(US06_US07_US03Pages.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);


    }


    @And("Name girilmeli")
    public void nameGirilmeli() {
        US06_US07_US03Pages.nameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }

    @And("Surname girilmeli")
    public void surnameGirilmeli() {
        US06_US07_US03Pages.surnameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }

    @And("Birth Place girilmeli")
    public void birthPlaceGirilmeli() {
        US06_US07_US03Pages.birthPlace.sendKeys("manti");
        ReusableMethods.bekle(3);


    }


    @Then("Cinsiyet secilmeli")
    public void cinsiyetSecilmeli() {
        ReusableMethods.click(US06_US07_US03Pages.maleRadio);
        ReusableMethods.bekle(3);


    }


    @Then("Dogum tarihi girilmeli")
    public void dogumTarihiGirilmeli() {

        ReusableMethods.click(US06_US07_US03Pages.birthDay);
        ReusableMethods.bekle(3);


        US06_US07_US03Pages.birthDay.sendKeys("12121998");
        ReusableMethods.bekle(3);

    }


    @And("phone_number ,ssn ,username girilmeli")
    public void phone_numberSsnUsernameGirilmeli() {

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);


        fakeSsn = faker.idNumber().ssnValid();
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);

        //registerPage.ssnInput.sendKeys(ssn);
        ReusableMethods.click(US06_US07_US03Pages.usernameBox);
        ReusableMethods.bekle(3);


        fakeUsername = faker.name().username();
        US06_US07_US03Pages.usernameBox.sendKeys(fakeUsername);

        //registerPage.userNameInput.sendKeys(username);
    }



    @And("Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli")
    public void passwordEnAzSekizKarakterdenOlusmalıBuyukHarfKucukHarfVeBirRakamIcermeli() {

        US06_US07_US03Pages.passwordBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }







    @Then("Submit butonu gorunur olmali ve tiklanmali")
    public void submitButonuGorunurOlmaliVeTiklanmali() {

        ReusableMethods.click(US06_US07_US03Pages.submitAddViceDean);
        ReusableMethods.bekle(1);


    }

    @Then("Vice Dean olusturuldugu dogrulanmali")
    public void viceDeanOlusturulduguDogrulanmali() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", US06_US07_US03Pages.sonSatir);

        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.sonSatir.isDisplayed());
        ReusableMethods.bekle(3);




    }

    @And("Sayfa kapatilmali")
    public void sayfaKapatilmali() {

        Driver.getDriver().quit();
        ReusableMethods.bekle(3);


    }


    //TC02

    @Then("Name girilmediginde Required mesaji gorulmeli")
    public void nameGirilmedigindeRequiredMesajiGorulmeli() {
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.nameBox);
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.addViceDeanYazisi);





        assertTrue(US06_US07_US03Pages.nameRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Surname girilmediginde Required mesaji gorulmeli")
    public void surnameGirilmedigindeRequiredMesajiGorulmeli() {
        ReusableMethods.click(US06_US07_US03Pages.surnameBox);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.surnameRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Birth Place girilmediginde Required mesaji gorulmeli")
    public void birthPlaceGirilmedigindeRequiredMesajiGorulmeli() {

        ReusableMethods.click(US06_US07_US03Pages.birthPlace);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.birthPlaceRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }


    @Then("Cinsiyet secilmediginde Required mesaji gorulmeli")
    public void cinsiyetSecilmedigindeRequiredMesajiGorulmeli() {
        //**makeupBug**\\

    }

    @Then("Dogum tarihi girilmediginde Required mesaji gorulmeli")
    public void dogumTarihiGirilmedigindeRequiredMesajiGorulmeli() {
        assertTrue(US06_US07_US03Pages.birthDayRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Telefon numarasi girilmediginde Required mesaji gorulmeli")
    public void telefonNumarasiGirilmedigindeRequiredMesajiGorulmeli() {

        assertTrue(US06_US07_US03Pages.phoneNumberRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("SSN girilmediginde Required mesaji gorulmeli")
    public void ssnGirilmedigindeRequiredMesajiGorulmeli() {
        assertTrue(US06_US07_US03Pages.ssnRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @And("User Name girilmediginde Required mesaji gorulmeli")
    public void userNameGirilmedigindeRequiredMesajiGorulmeli() {

        assertTrue(US06_US07_US03Pages.usernameRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @And("Password girilmediginde Enter your password mesaji gorulmeli")
    public void passwordGirilmedigindeEnterYourPasswordMesajiGorulmeli() {
        assertTrue(US06_US07_US03Pages.passwordRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }




    //TC03

    @Then("phone_number ,username girilmeli")
    public void phone_numberUsernameGirilmeli() {
        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);
        ReusableMethods.bekle(3);


        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(3);


        //registerPage.ssnInput.sendKeys(ssn);
        ReusableMethods.click(US06_US07_US03Pages.usernameBox);
        ReusableMethods.bekle(3);

        fakeUsername = faker.name().username();
        US06_US07_US03Pages.usernameBox.sendKeys(fakeUsername);
        ReusableMethods.bekle(3);

        //registerPage.userNameInput.sendKeys(username);

    }













    @Then("SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli")
    public void ssnGirilmeliSSNUcuncuVeBesinciRakamdanSonraIcermeliVeDokuzRakamdanOlusmaliAyniRakamlarGirildigindeHataVermeli() {

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.ssnBox.sendKeys("777 77 7777");
        ReusableMethods.bekle(3);


    }



    //TC04
    @Then("SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli")
    public void ssnGirilmeliSSNUcuncuVeBesinciRakamdanSonraIcermedigindeHataMesajiGorunmeli() {

        //    Then SSN girilmeli.  SSN; 3. ve 5. rakamdan sonra "-" icermediginde "Minimum 11 character (XXX-XX-XXXX)" mesaji gorunmeli

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);


        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        ReusableMethods.bekle(3);

        fakeSsn = faker.number().numberBetween(100, 999)  + faker.number().numberBetween(10, 99)  + faker.number().numberBetween(1000, 9999)+ "";
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.ssnkaraktermesaji.isDisplayed());
        ReusableMethods.bekle(3);

    }


    //TC05



    @Then("SSN girilmeli,  SSN; dokuz rakamdan olusmadiginda Minimum onbir character \\(XXX-XX-XXXX) mesaji gorunmeli")
    public void ssnGirilmeliSSNDokuzRakamdanOlusmadigindaMinimumOnbirCharacterXXXXXXXXXMesajiGorunmeli() {

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999);
        ReusableMethods.bekle(3);

        fakeSsn = faker.number().numberBetween(10, 99)+ "-"  + faker.number().numberBetween(10, 99)+ "-"  + faker.number().numberBetween(100, 999);
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.ssnkaraktermesaji.isDisplayed());
        ReusableMethods.bekle(3);


    }






    //TC06
    @Then("Password en az sekiz karakterden olusmali,kucuk harf ve bir rakam icermeli, One uppercase character hata yazisi gorulmeli")
    public void passwordEnAzSekizKarakterdenOlusmaliKucukHarfVeBirRakamIcermeliOneUppercaseCharacterHataYazisiGorulmeli() {


        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("esmadeniyor1");
        ReusableMethods.bekle(3);



        assertTrue(US06_US07_US03Pages.passwordbuyukharfyok.isDisplayed());
        ReusableMethods.bekle(3);



    }




    //TC07

    @Then("Password en az sekiz karakterden olusmali,buyuk harf ve bir rakam icermeli, One lowercase character hata yazisi gorulmeli")
    public void passwordEnAzSekizKarakterdenOlusmaliBuyukHarfVeBirRakamIcermeliOneLowercaseCharacterHataYazisiGorulmeli() {


        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("ESMADENIYOR1");
        ReusableMethods.bekle(3);



        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);



    }



    //TC08
    @Then("ssn ,username  girilmeli")
    public void ssnUsernameGirilmeli() {

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);

        fakeSsn = faker.idNumber().ssnValid();
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);
        ReusableMethods.bekle(3);

        //registerPage.ssnInput.sendKeys(ssn);
        ReusableMethods.click(US06_US07_US03Pages.usernameBox);
        ReusableMethods.bekle(3);

        fakeUsername = faker.name().username();
        US06_US07_US03Pages.usernameBox.sendKeys(fakeUsername);
        ReusableMethods.bekle(3);

        //registerPage.userNameInput.sendKeys(username);



    }



    @Then("Daha once kullanilmis telefon numarasi girilmeli, Please enter valid ssn number mesaji gorulmeli")
    public void dahaOnceKullanilmisTelefonNumarasiGirilmeliPleaseEnterValidSsnNumberMesajiGorulmeli() {

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);
        ReusableMethods.bekle(3);


        US06_US07_US03Pages.phoneNumberBox.sendKeys("555-55-3333");
        ReusableMethods.bekle(3);


    }




    //TC09

    @Then("Telefon numarasi girilmeli,  ucuncu ve altinci rakamdan sonra - icermeli, bu kosullar saglanmadiginda Minimum oniki character \\(XXX-XXX-XXXX) hatasi vermeli")
    public void telefonNumarasiGirilmeliUcuncuVeAltinciRakamdanSonraIcermeliBuKosullarSaglanmadigindaMinimumOnikiCharacterXXXXXXXXXXHatasiVermeli() {

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);

        ReusableMethods.bekle(3);

        fakePhoneNumber = faker.number().numberBetween(100, 999) + faker.number().numberBetween(100, 999) + faker.number().numberBetween(1000, 9999) + "";
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(3);



    }




    //TC10
    @Then("Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character \\(XXX-XXX-XXXX) hatasi vermeli")
    public void telefonNumarasiGirilmeliFormatiXxxXxxXxxxSeklindeOlmadigindaMinimumOnikiCharacterXXXXXXXXXXHatasiVermeli() {

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);
        ReusableMethods.bekle(3);


        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.phonenumberhatasi.isDisplayed());

        ReusableMethods.bekle(3);

    }










    //TC11
    @Then("Password;buyuk harf, kucuk harf ve bir rakam icermeli, en az sekiz karakterden olusmadiginda At least eight characters hata mesajini vermeli")
    public void passwordBuyukHarfKucukHarfVeBirRakamIcermeliEnAzSekizKarakterdenOlusmadigindaAtLeastEightCharactersHataMesajiniVermeli() {


        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("Esma1");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);
    }





    //TC12
    @Then("Password en az sekiz karakterden olusmali, buyuk harf, kucuk harf icermeli, One number mesaji gorulmeli")
    public void passwordEnAzSekizKarakterdenOlusmaliBuyukHarfKucukHarfIcermeliOneNumberMesajiGorulmeli() {

        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("Esmabisideniyor");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);

    }







    //US07
    //TC01
    @Then("Menu butonuna tiklanmali")
    public void menuButonunaTiklanmali() {

        ReusableMethods.click(US06_US07_US03Pages.menuButonu);
        ReusableMethods.bekle(3);


    }


    @Then("Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali")
    public void contactGetAllYazisininGorunurluguDogrulanmaliVeButonaTiklanmali() {

        assertTrue(US06_US07_US03Pages.contactGetAll.isDisplayed());


        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.contactGetAll);

        ReusableMethods.bekle(2);

    }

    @Then("Contact Message sayfasinin acildigi dogrulanmali")
    public void contactMessageSayfasininAcildigiDogrulanmali() {

        assertTrue(US06_US07_US03Pages.contactMessageYazisi.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Mesajlarin gorunurlugu dogrulanmali")
    public void mesajlarinGorunurluguDogrulanmali() {


        ReusableMethods.scroll("window.scrollTo(0,document.body.scrollHeight)", US06_US07_US03Pages.enUsttekiMesajEmail);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesajEmail.isDisplayed());
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesaj.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Silme butonunun gorunurlugu dogrulanmali")
    public void silmeButonununGorunurluguDogrulanmali() {

        String bug = "bug";
        System.out.println("bug = " + bug);
        ReusableMethods.bekle(3);

    }

    @Then("Mesajlari silinebilmeli ve mesajin silindigi dogrulanmali, silinmediyse silinmedigi dogrulanmali")
    public void mesajlariSilinebilmeliVeMesajinSilindigiDogrulanmaliSilinmediyseSilinmedigiDogrulanmali() {


        assertTrue(US06_US07_US03Pages.silinmedi.isDisplayed());
        ReusableMethods.bekle(3);



    }

    //TC02
    @Then("Mesajlarin yazarlarinin, e-maillerinin, gonderilme tarihinin,subject bilgilerinin gorunurlugu dogrulanmali")
    public void mesajlarinYazarlarininEMaillerininGonderilmeTarihininSubjectBilgilerininGorunurluguDogrulanmali() {


        ReusableMethods.scroll("window.scrollTo(0,document.body.scrollHeight)", US06_US07_US03Pages.enUsttekiMesajEmail);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesajEmail.isDisplayed());
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesaj.isDisplayed());
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesajDate.isDisplayed());
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesajSubject.isDisplayed());
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.enUsttekiMesajName.isDisplayed());
        ReusableMethods.bekle(3);


    }
    
    

    //US23
    //TC01

    @Then("Admin username ve admin sifre girilir.")
    public void adminUsernameVeAdminSifreGirilir() {

        ReusableMethods.click(US06_US07_US03Pages.login);
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.username);
        ReusableMethods.bekle(3);

        Driver.getDriver().get(ConfigReader.getProperty("adminName") + Keys.TAB + ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.loginButton);
        ReusableMethods.bekle(3);



    }


    @Then("Admin sayfasina girildigi dogrulanir.")
    public void adminSayfasinaGirildigiDogrulanir() {

        assertTrue(US06_US07_US03Pages.adminManagement.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Menu butonuna tiklanir")
    public void menuButonunaTiklanir() {

        ReusableMethods.click(US06_US07_US03Pages.menuButonu);
        ReusableMethods.bekle(3);

        
    }

    @Then("Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir")
    public void acilanPenceredenViceDeanManagementYazisinininGorunurluguDogrulanirVeTiklanir() {

        assertTrue(US06_US07_US03Pages.viceDeanManagement.isDisplayed());
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.viceDeanManagement);
        ReusableMethods.bekle(3);

        
    }



    @Then("Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli")
    public void viceDeanOlusturulduguDogrulanmaliViceDeanSavedMesajiGorulmeli() {

        ReusableMethods.click(US06_US07_US03Pages.adminvckayit);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.adminvckayit.isDisplayed());
        ReusableMethods.bekle(3);
    }


}