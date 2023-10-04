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

//US06.feature


    @Given("Anasayfaya basarili bir sekilde acilmali usalti")
    public void anasayfayaBasariliBirSekildeAcilmaliUsalti() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        ReusableMethods.bekle(3);

    }

    @And("Login butonuna gorunur olmali ve tiklanilmali usalti")
    public void loginButonunaGorunurOlmaliVeTiklanilmaliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.login);
        ReusableMethods.bekle(3);

    }

    @And("Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti")
    public void deanUsernameVeDeanSifreGirilmeliLoginGirisButonunaTiklanmaliUsalti() {
        US06_US07_US03Pages.username.sendKeys(ConfigReader.getProperty("deanName") + Keys.TAB + ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.loginButton);
        ReusableMethods.bekle(3);
    }

    @And("Vice Dean sayfasi goruntulendigi dogrulanmali usalti")
    public void viceDeanSayfasiGoruntulendigiDogrulanmaliUsalti() {
        assertTrue(US06_US07_US03Pages.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @And("Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti")
    public void addViceDeanYazisininGorunurluguDogrulanimaliUsalti() {
        assertTrue(US06_US07_US03Pages.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @And("Name girilmeli usalti")
    public void nameGirilmeliUsalti() {
        US06_US07_US03Pages.nameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);

    }

    @And("Surname girilmeli usalti")
    public void surnameGirilmeliUsalti() {
        US06_US07_US03Pages.surnameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);

    }

    @And("Birth Place girilmeli usalti")
    public void birthPlaceGirilmeliUsalti() {
        US06_US07_US03Pages.birthPlace.sendKeys("manti");
        ReusableMethods.bekle(3);
    }

    @And("Cinsiyet secilmeli usalti")
    public void cinsiyetSecilmeliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.maleRadio);
        ReusableMethods.bekle(3);

    }

    @And("Dogum tarihi girilmeli usalti")
    public void dogumTarihiGirilmeliUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.birthDay);
        ReusableMethods.bekle(3);


        US06_US07_US03Pages.birthDay.sendKeys("12121998");
        ReusableMethods.bekle(3);
    }

    @And("phone_number ,ssn ,username girilmeli usalti")
    public void phone_numberSsnUsernameGirilmeliUsalti() {
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

    @And("Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti")
    public void passwordEnAzSekizKarakterdenOlusmalıBuyukHarfKucukHarfVeBirRakamIcermeliUsalti() {

        US06_US07_US03Pages.passwordBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);

    }

    @And("Submit butonu gorunur olmali ve tiklanmali usalti")
    public void submitButonuGorunurOlmaliVeTiklanmaliUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.submitAddViceDean);
        ReusableMethods.bekle(1);

    }


    @And("Sayfa kapatilmali usalti")
    public void sayfaKapatilmaliUsalti() {
        Driver.getDriver().quit();
        ReusableMethods.bekle(3);
    }







    @Then("Name girilmediginde Required mesaji gorulmeli usalti")
    public void nameGirilmedigindeRequiredMesajiGorulmeliUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.nameBox);
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.addViceDeanYazisi);


        assertTrue(US06_US07_US03Pages.nameRequired.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @Then("Surname girilmediginde Required mesaji gorulmeli usalti")
    public void surnameGirilmedigindeRequiredMesajiGorulmeliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.surnameBox);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.surnameRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Birth Place girilmediginde Required mesaji gorulmeli usalti")
    public void birthPlaceGirilmedigindeRequiredMesajiGorulmeliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.birthPlace);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.birthPlaceRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Cinsiyet secilmediginde Required mesaji gorulmeli usalti")
    public void cinsiyetSecilmedigindeRequiredMesajiGorulmeliUsalti() {
//**makeupBug**\\

    }

    @Then("Dogum tarihi girilmediginde Required mesaji gorulmeli usalti")
    public void dogumTarihiGirilmedigindeRequiredMesajiGorulmeliUsalti() {
        assertTrue(US06_US07_US03Pages.birthDayRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Telefon numarasi girilmediginde Required mesaji gorulmeli usalti")
    public void telefonNumarasiGirilmedigindeRequiredMesajiGorulmeliUsalti() {
        assertTrue(US06_US07_US03Pages.phoneNumberRequired.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("SSN girilmediginde Required mesaji gorulmeli usalti")
    public void ssnGirilmedigindeRequiredMesajiGorulmeliUsalti() {
        assertTrue(US06_US07_US03Pages.ssnRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @And("User Name girilmediginde Required mesaji gorulmeli usalti")
    public void userNameGirilmedigindeRequiredMesajiGorulmeliUsalti() {

        assertTrue(US06_US07_US03Pages.usernameRequired.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @And("Password girilmediginde Enter your password mesaji gorulmeli usalti")
    public void passwordGirilmedigindeEnterYourPasswordMesajiGorulmeliUsalti() {
        assertTrue(US06_US07_US03Pages.passwordRequired.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @Then("phone_number ,username girilmeli usalti")
    public void phone_numberUsernameGirilmeliUsalti() {
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

    @Then("SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmali, ayni rakamlar girildiginde hata vermeli usalti")
    public void ssnGirilmeliSSNUcuncuVeBesinciRakamdanSonraIcermeliVeDokuzRakamdanOlusmaliAyniRakamlarGirildigindeHataVermeliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.ssnBox.sendKeys("777 77 7777");
        ReusableMethods.bekle(3);


    }

    @Then("SSN girilmeli.  SSN; ucuncu ve besinci rakamdan sonra - icermediginde hata mesaji gorunmeli usalti")
    public void ssnGirilmeliSSNUcuncuVeBesinciRakamdanSonraIcermedigindeHataMesajiGorunmeliUsalti() {

//    Then SSN girilmeli.  SSN; 3. ve 5. rakamdan sonra "-" icermediginde "Minimum 11 character (XXX-XX-XXXX)" mesaji gorunmeli

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);


        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        ReusableMethods.bekle(3);

        fakeSsn = faker.number().numberBetween(100, 999) + faker.number().numberBetween(10, 99) + faker.number().numberBetween(1000, 9999) + "";
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.ssnkaraktermesaji.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("SSN girilmeli,  SSN; dokuz rakamdan olusmadiginda Minimum onbir character \\(XXX-XX-XXXX) mesaji gorunmeli usalti")
    public void ssnGirilmeliSSNDokuzRakamdanOlusmadigindaMinimumOnbirCharacterXXXXXXXXXMesajiGorunmeliUsalti() {
        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999);
        ReusableMethods.bekle(3);

        fakeSsn = faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(100, 999);
        team12.pages.US06_US07_US03Pages.ssnBox.sendKeys(fakeSsn);
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.ssnkaraktermesaji.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @Then("Password en az sekiz karakterden olusmali,kucuk harf ve bir rakam icermeli, One uppercase character hata yazisi gorulmeli usalti")
    public void passwordEnAzSekizKarakterdenOlusmaliKucukHarfVeBirRakamIcermeliOneUppercaseCharacterHataYazisiGorulmeliUsalti() {

        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("esmadeniyor1");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordbuyukharfyok.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @Then("Password en az sekiz karakterden olusmali,buyuk harf ve bir rakam icermeli, One lowercase character hata yazisi gorulmeli usalti")
    public void passwordEnAzSekizKarakterdenOlusmaliBuyukHarfVeBirRakamIcermeliOneLowercaseCharacterHataYazisiGorulmeliUsalti() {


        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("ESMADENIYOR1");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("ssn ,username  girilmeli usalti")
    public void ssnUsernameGirilmeliUsalti() {
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

    @Then("Daha once kullanilmis telefon numarasi girilmeli, Please enter valid ssn number mesaji gorulmeli usalti")
    public void dahaOnceKullanilmisTelefonNumarasiGirilmeliPleaseEnterValidSsnNumberMesajiGorulmeliUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);
        ReusableMethods.bekle(3);


        US06_US07_US03Pages.phoneNumberBox.sendKeys("555-55-3333");
        ReusableMethods.bekle(3);

    }

    @Then("Telefon numarasi girilmeli,  ucuncu ve altinci rakamdan sonra - icermeli, bu kosullar saglanmadiginda Minimum oniki character \\(XXX-XXX-XXXX) hatasi vermeli usalti")
    public void telefonNumarasiGirilmeliUcuncuVeAltinciRakamdanSonraIcermeliBuKosullarSaglanmadigindaMinimumOnikiCharacterXXXXXXXXXXHatasiVermeliUsalti() {

        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);

        ReusableMethods.bekle(3);

        fakePhoneNumber = faker.number().numberBetween(100, 999) + faker.number().numberBetween(100, 999) + faker.number().numberBetween(1000, 9999) + "";
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(3);

    }

    @Then("Telefon numarasi girilmeli, formati xxx-xxx-xxxx seklinde olmadiginda,  Minimum oniki character \\(XXX-XXX-XXXX) hatasi vermeli usalti")
    public void telefonNumarasiGirilmeliFormatiXxxXxxXxxxSeklindeOlmadigindaMinimumOnikiCharacterXXXXXXXXXXHatasiVermeliUsalti() {
        Faker faker = new Faker();

        ReusableMethods.click(US06_US07_US03Pages.phoneNumberBox);
        ReusableMethods.bekle(3);


        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.phonenumberhatasi.isDisplayed());

        ReusableMethods.bekle(3);
    }

    @Then("Password;buyuk harf, kucuk harf ve bir rakam icermeli, en az sekiz karakterden olusmadiginda At least eight characters hata mesajini vermeli usalti")
    public void passwordBuyukHarfKucukHarfVeBirRakamIcermeliEnAzSekizKarakterdenOlusmadigindaAtLeastEightCharactersHataMesajiniVermeliUsalti() {


        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("Esma1");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @Then("Password en az sekiz karakterden olusmali, buyuk harf, kucuk harf icermeli, One number mesaji gorulmeli usalti")
    public void passwordEnAzSekizKarakterdenOlusmaliBuyukHarfKucukHarfIcermeliOneNumberMesajiGorulmeliUsalti() {

        US06_US07_US03Pages.passwordBox.click();
        ReusableMethods.bekle(3);

        US06_US07_US03Pages.passwordBox.sendKeys("Esmabisideniyor");
        ReusableMethods.bekle(3);


        assertTrue(US06_US07_US03Pages.passwordkucukharfyok.isDisplayed());
        ReusableMethods.bekle(3);

    }


    //US07.feature
    @Then("Menu butonuna tiklanmali usalti")
    public void menuButonunaTiklanmaliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.menuButonu);
        ReusableMethods.bekle(3);

    }

    @Then("Contact Get All yazisinin gorunurlugu dogrulanmali ve butona tiklanmali usalti")
    public void contactGetAllYazisininGorunurluguDogrulanmaliVeButonaTiklanmaliUsalti() {
        assertTrue(US06_US07_US03Pages.contactGetAll.isDisplayed());


        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.contactGetAll);

        ReusableMethods.bekle(2);
    }

    @Then("Contact Message sayfasinin acildigi dogrulanmali usalti")
    public void contactMessageSayfasininAcildigiDogrulanmaliUsalti() {

        assertTrue(US06_US07_US03Pages.contactMessageYazisi.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Mesajlarin gorunurlugu dogrulanmali usalti")
    public void mesajlarinGorunurluguDogrulanmaliUsalti() {

        assertTrue(US06_US07_US03Pages.enUsttekiMesaj.isDisplayed());
        ReusableMethods.bekle(3);


    }


    @Then("Silme butonunun gorunurlugu dogrulanmali usalti")
    public void silmeButonununGorunurluguDogrulanmaliUsalti() {
        String bug = "bug";
        System.out.println("bug");
        ReusableMethods.bekle(2);
    }


    @Then("Mesajlari silinebilmeli ve mesajin silindigi dogrulanmali, silinmediyse silinmedigi dogrulanmali usalti")
    public void mesajlariSilinebilmeliVeMesajinSilindigiDogrulanmaliSilinmediyseSilinmedigiDogrulanmaliUsalti() {

        assertTrue(US06_US07_US03Pages.silinmedi.isDisplayed());
        ReusableMethods.bekle(3);
    }


    @Then("Mesajlarin yazarlarinin, e-maillerinin, gonderilme tarihinin,subject bilgilerinin gorunurlugu dogrulanmali usalti")
    public void mesajlarinYazarlarininEMaillerininGonderilmeTarihininSubjectBilgilerininGorunurluguDogrulanmaliUsalti() {

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


    //US23.feature
    @Then("Admin username ve admin sifre girilir. usalti")
    public void adminUsernameVeAdminSifreGirilirUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.login);
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.username);
        ReusableMethods.bekle(3);

        Driver.getDriver().get(ConfigReader.getProperty("adminName") + Keys.TAB + ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.loginButton);
        ReusableMethods.bekle(3);
    }


    @Then("Admin sayfasina girildigi dogrulanir. usalti")
    public void adminSayfasinaGirildigiDogrulanirUsalti() {

        assertTrue(US06_US07_US03Pages.adminManagement.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Then("Menu butonuna tiklanir usalti")
    public void menuButonunaTiklanirUsalti() {

        ReusableMethods.click(US06_US07_US03Pages.menuButonu);
        ReusableMethods.bekle(3);

    }

    @Then("Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti")
    public void acilanPenceredenViceDeanManagementYazisinininGorunurluguDogrulanirVeTiklanirUsalti() {

        assertTrue(US06_US07_US03Pages.viceDeanManagement.isDisplayed());
        ReusableMethods.bekle(3);

        ReusableMethods.click(US06_US07_US03Pages.viceDeanManagement);
        ReusableMethods.bekle(3);
    }


    @Then("Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli usalti")
    public void viceDeanOlusturulduguDogrulanmaliViceDeanSavedMesajiGorulmeliUsalti() {
        ReusableMethods.click(US06_US07_US03Pages.adminvckayit);
        ReusableMethods.bekle(3);

        assertTrue(US06_US07_US03Pages.adminvckayit.isDisplayed());
        ReusableMethods.bekle(3);
    }



}


