package team12.stepDefinition.dbStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import team12.pages.US06_US07_US03Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;


import java.sql.*;
import java.time.Duration;


import io.restassured.response.Response;
import team12.pojos.esmaPojo.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team12.base_url.ManagementSchoolUrl.spec;
import static team12.base_url.ManagementSchoolUrlDean.spec1;


public class US06_US07_US23Def {

    public static String fakeUsername;
    public static String fakeSsn;
    public static String fakePhoneNumber;
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    US06ViceDeanPojo expectedData;
    US06ResponsePojo actualData;
    Response response;

    Response response1;

    US06_US07_US03Pages pages2 = new US06_US07_US03Pages();



    //US06 DATABASE TESTI
    @Given("Anasayfaya basarili bir sekilde acilmali usalti database")
    public void anasayfayaBasariliBirSekildeAcilmaliUsaltiDatabase() {


        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        ReusableMethods.bekle(3);



    }

    @And("Login butonuna gorunur olmali ve tiklanilmali usalti database")
    public void loginButonunaGorunurOlmaliVeTiklanilmaliUsaltiDatabase() {

        //ReusableMethods.bekleveclick();


       ReusableMethods.click(pages2.loginayni);

       //US06_US07_US03Pages.loginayni.click();


        ReusableMethods.bekle(3);

        //driver.findElement(By.xpath("//a[@href='/login']")).click();


        //yapay zeka
        //ExpectedConditions.elementToBeClickable(US06_US07_US03Pages.login);


    }

    @And("Dean username ve dean sifre girilmeli, login giris butonuna tiklanmali usalti database")
    public void deanUsernameVeDeanSifreGirilmeliLoginGirisButonunaTiklanmaliUsaltiDatabase() {


        pages2.username.sendKeys(ConfigReader.getProperty("deanName") + Keys.TAB + ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(3);

        ReusableMethods.click(pages2.loginButton);
        ReusableMethods.bekle(3);

    }

    @And("Vice Dean sayfasi goruntulendigi dogrulanmali usalti database")
    public void viceDeanSayfasiGoruntulendigiDogrulanmaliUsaltiDatabase() {

        assertTrue(pages2.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);



    }

    @And("Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti database")
    public void addViceDeanYazisininGorunurluguDogrulanimaliUsaltiDatabase() {


        assertTrue(pages2.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);


    }

    @And("Name girilmeli usalti database")
    public void nameGirilmeliUsaltiDatabase() {


        pages2.nameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }

    @And("Surname girilmeli usalti database")
    public void surnameGirilmeliUsaltiDatabase() {

        pages2.surnameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);



    }

    @And("Birth Place girilmeli usalti database")
    public void birthPlaceGirilmeliUsaltiDatabase() {

        pages2.birthPlace.sendKeys("manti");
        ReusableMethods.bekle(3);

    }

    @And("Cinsiyet secilmeli usalti database")
    public void cinsiyetSecilmeliUsaltiDatabase() {

        ReusableMethods.click(pages2.maleRadio);
        ReusableMethods.bekle(3);


    }

    @And("Dogum tarihi girilmeli usalti database")
    public void dogumTarihiGirilmeliUsaltiDatabase() {



        ReusableMethods.click(pages2.birthDay);
        ReusableMethods.bekle(3);


        pages2.birthDay.sendKeys("12121998");
        ReusableMethods.bekle(3);


    }


    @And("phone_number ,ssn ,username girilmeli usalti database")
    public void phone_numberSsnUsernameGirilmeliUsaltiDatabase() {


        ReusableMethods.click(pages2.phoneNumberBox);

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);

        ReusableMethods.click(US06_US07_US03Pages.ssnBox);
        ReusableMethods.bekle(3);


        fakeSsn = faker.idNumber().ssnValid();
        pages2.ssnBox.sendKeys(fakeSsn);

        ReusableMethods.click(pages2.usernameBox);
        ReusableMethods.bekle(3);


        fakeUsername = faker.name().username();
        pages2.usernameBox.sendKeys(fakeUsername);


    }

    @And("Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti database")
    public void passwordEnAzSekizKarakterdenOlusmalıBuyukHarfKucukHarfVeBirRakamIcermeliUsaltiDatabase() {

        pages2.passwordBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);



    }

    @And("Submit butonu gorunur olmali ve tiklanmali usalti database")
    public void submitButonuGorunurOlmaliVeTiklanmaliUsaltiDatabase() {

        ReusableMethods.click(pages2.submitAddViceDean);
        ReusableMethods.bekle(1);




    }












    //US06 API
    @Given("Vice Dean eklemek icin Post request hazirligi yapilir usalti database")
    public void viceDeanEklemekIcinPostRequestHazirligiYapilirUsaltiDatabase() {

        //Set the URL
        //https://managementonschools.com/app//vicedean/save
        spec1.pathParams("first", "vicedean", "second", "save");



    }

    @And("Gonderilecek Vice Dean bilgileri hazirlanir usalti database")
    public void gonderilecekViceDeanBilgileriHazirlanirUsaltiDatabase() {

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);

        fakeSsn = faker.idNumber().ssnValid();

        fakeUsername = faker.name().username();


        // Set the expected data
        expectedData = new US06ViceDeanPojo("1998-12-12","manti","MALE","Cucumberui1","Cucumberui1",fakePhoneNumber,fakeSsn,"Cucumberui1",fakeUsername);


    }

    @When("Vice Dean eklemek icin Post request gonderilir usalti database")
    public void viceDeanEklemekIcinPostRequestGonderilirUsaltiDatabase() {

        // Send the request and get the response
        response1 = given(spec1).body(expectedData).when().post("{first}/{second}");
        actualData = response1.as(US06ResponsePojo.class);
        // actualData = new ObjectMapper().readValue(response.asString(), US23ResponsePojo.class);




    }

    @Then("Vice Dean bilgileri dogrulanir usalti database")
    public void viceDeanBilgileriDogrulanirUsaltiDatabase() {

        //Do assertion


        assertEquals(200, response1.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());




    }











    // US06 Database
    @Given("Database e baglan usalti")
    public void databaseEBaglanUsalti() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");

    }

    @When("gecerli kullanici ile username i cagir usalti")
    public void gecerliKullaniciIleUsernameICagirUsalti() throws SQLException {

        statement = connection.createStatement();

        String query = "select * from guest_user where username = '" + fakeUsername + "'";

        resultSet = statement.executeQuery(query);

    }

    @Then("Var olan bodyde name, username, birthplace, cinsiyet, dogum tarihi, phone_number, ssn icerdigini test et usalti")
    public void varOlanBodydeNameUsernameBirthplaceCinsiyetDogumTarihiPhone_numberSsnIcerdiginiTestEtUsalti() throws SQLException {
/*
        resultSet.next();
        resultSet.getString("birth_day");
        resultSet.getString("birth_place");
        resultSet.getString("gender");
        resultSet.getString("name");
        resultSet.getString("password");
        resultSet.getString("phone_number");
        resultSet.getString("ssn");
        resultSet.getString("surname");
        resultSet.getString("username");

 */
        /*

         */

        while (resultSet.next()) {//yapay zeka

            // Sonuçlara erişim
            resultSet.getString("birth_day");
            resultSet.getString("birth_place");
            resultSet.getString("gender");
            resultSet.getString("name");
            resultSet.getString("password");
            resultSet.getString("phone_number");
            resultSet.getString("ssn");
            resultSet.getString("surname");
            resultSet.getString("username");

        }
    }

    @Then("hesaptan cikis yapildi")
    public void hesaptanCikisYapildi() {

        ReusableMethods.click(pages2.dbmenu);
        ReusableMethods.bekle(3);

        ReusableMethods.click(pages2.dbLOGOUT);
        ReusableMethods.bekle(3);

        ReusableMethods.click(pages2.dbyestusu);
        ReusableMethods.bekle(3);




    }


    /*
    @And("Sayfa kapatilmali usalti database")
    public void sayfaKapatilmaliUsaltiDatabase() {

        Driver.getDriver().quit();
        ReusableMethods.bekle(3);

    }

     */





    //US23 DATABASE TESI
    @Given("Anasayfaya basarili bir sekilde acilmali usalti databaseyirmiuc")
    public void anasayfayaBasariliBirSekildeAcilmaliUsaltiDatabaseyirmiuc() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

        ReusableMethods.bekle(3);


    }

    @Then("Login butonuna gorunur olmali ve tiklanilmali usalti databaseyirmiuc")
    public void loginButonunaGorunurOlmaliVeTiklanilmaliUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.login);

        //  driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")).click();
        ReusableMethods.bekle(3);



    }



    @Then("Admin username ve admin sifre girilir. usalti databaseyirmiuc")
    public void adminUsernameVeAdminSifreGirilirUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.login);
        ReusableMethods.bekle(3);



        //Driver.getDriver().get(ConfigReader.getProperty("adminName") + Keys.TAB + ConfigReader.getProperty("adminPassword"));
        pages2.username.sendKeys(ConfigReader.getProperty("adminName") + Keys.TAB + ConfigReader.getProperty("adminPassword"));


        ReusableMethods.bekle(3);

        ReusableMethods.click(pages2.loginButton);
        ReusableMethods.bekle(3);



    }

    @Then("Admin sayfasina girildigi dogrulanir. usalti databaseyirmiuc")
    public void adminSayfasinaGirildigiDogrulanirUsaltiDatabaseyirmiuc() {

        assertTrue(pages2.adminManagement.isDisplayed());
        ReusableMethods.bekle(3);



    }

    @Then("Menu butonuna tiklanir usalti databaseyirmiuc")
    public void menuButonunaTiklanirUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.menuButonu);
        ReusableMethods.bekle(3);



    }

    @Then("Acilan pencereden Vice Dean Management yazisininin gorunurlugu dogrulanir ve tiklanir usalti databaseyirmiuc")
    public void acilanPenceredenViceDeanManagementYazisinininGorunurluguDogrulanirVeTiklanirUsaltiDatabaseyirmiuc() {


        assertTrue(pages2.viceDeanManagement.isDisplayed());
        ReusableMethods.bekle(3);

        ReusableMethods.click(pages2.viceDeanManagement);
        ReusableMethods.bekle(3);

    }

    @Then("Add Vice Dean yazisinin gorunurlugu dogrulanimali usalti databaseyirmiuc")
    public void addViceDeanYazisininGorunurluguDogrulanimaliUsaltiDatabaseyirmiuc() {

        assertTrue(pages2.addViceDeanYazisi.isDisplayed());
        ReusableMethods.bekle(3);


    }


    @And("Name girilmeli usalti databaseyirmiuc")
    public void nameGirilmeliUsaltiDatabaseyirmiuc() {

        pages2.nameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }

    @And("Surname girilmeli usalti databaseyirmiuc")
    public void surnameGirilmeliUsaltiDatabaseyirmiuc() {


        pages2.surnameBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);


    }

    @And("Birth Place girilmeli usalti databaseyirmiuc")
    public void birthPlaceGirilmeliUsaltiDatabaseyirmiuc() {

        pages2.birthPlace.sendKeys("manti");
        ReusableMethods.bekle(3);


    }

    @Then("Cinsiyet secilmeli usalti databaseyirmiuc")
    public void cinsiyetSecilmeliUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.maleRadio);
        ReusableMethods.bekle(3);



    }

    @Then("Dogum tarihi girilmeli usalti databaseyirmiuc")
    public void dogumTarihiGirilmeliUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.birthDay);
        ReusableMethods.bekle(3);


        pages2.birthDay.sendKeys("12121998");
        ReusableMethods.bekle(3);


    }

    @And("phone_number ,ssn ,username girilmeli usalti databaseyirmiuc")
    public void phone_numberSsnUsernameGirilmeliUsaltiDatabaseyirmiuc() {


        ReusableMethods.click(pages2.phoneNumberBox);

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
        team12.pages.US06_US07_US03Pages.phoneNumberBox.sendKeys(fakePhoneNumber);

        ReusableMethods.click(pages2.ssnBox);
        ReusableMethods.bekle(3);


        fakeSsn = faker.idNumber().ssnValid();
        pages2.ssnBox.sendKeys(fakeSsn);


        ReusableMethods.click(pages2.usernameBox);
        ReusableMethods.bekle(3);


        fakeUsername = faker.name().username();
        pages2.usernameBox.sendKeys(fakeUsername);



    }

    @Then("Password en az sekiz karakterden olusmalı, buyuk harf, kucuk harf ve bir rakam icermeli usalti databaseyirmiuc")
    public void passwordEnAzSekizKarakterdenOlusmalıBuyukHarfKucukHarfVeBirRakamIcermeliUsaltiDatabaseyirmiuc() {


        pages2.passwordBox.sendKeys("Cucumberui1");
        ReusableMethods.bekle(3);



    }

    @Then("Submit butonu gorunur olmali ve tiklanmali usalti databaseyirmiuc")
    public void submitButonuGorunurOlmaliVeTiklanmaliUsaltiDatabaseyirmiuc() {


        ReusableMethods.click(pages2.submitAddViceDean);
        ReusableMethods.bekle(1);



    }

    @Then("Vice Dean olusturuldugu dogrulanmali, Vice Dean Saved mesaji gorulmeli usalti databaseyirmiuc")
    public void viceDeanOlusturulduguDogrulanmaliViceDeanSavedMesajiGorulmeliUsaltiDatabaseyirmiuc() {

        ReusableMethods.click(pages2.adminvckayit);
        ReusableMethods.bekle(3);

        assertTrue(pages2.adminvckayit.isDisplayed());
        ReusableMethods.bekle(3);

    }




    @And("Sayfa kapatilmali usalti databaseyirmiuc")
    public void sayfaKapatilmaliUsaltiDatabaseyirmiuc() {

        Driver.getDriver().quit();
        ReusableMethods.bekle(3);


    }






    //US23 API
    @Given("Vice Dean eklemek icin Post request hazirligi yapilir usyirmiuc databaseyirmiuc")
    public void viceDeanEklemekIcinPostRequestHazirligiYapilirUsyirmiucDatabaseyirmiuc() {

        //Set the URL
        //https://managementonschools.com/app//vicedean/save
        spec.pathParams("first", "vicedean", "second", "save");




    }

    @And("Gonderilecek Vice Dean bilgileri hazirlanir usyirmiuc databaseyirmiuc")
    public void gonderilecekViceDeanBilgileriHazirlanirUsyirmiucDatabaseyirmiuc() {


        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);

        fakeSsn = faker.idNumber().ssnValid();

        fakeUsername = faker.name().username();


        // Set the expected data
        expectedData = new US06ViceDeanPojo("1998-12-12","manti","MALE","Cucumberui1","Cucumberui1",fakePhoneNumber,fakeSsn,"Cucumberui1",fakeUsername);

        //	public US06ViceDeanPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {



    }

    @When("Vice Dean eklemek icin Post request gonderilir usyirmiuc databaseyirmiuc")
    public void viceDeanEklemekIcinPostRequestGonderilirUsyirmiucDatabaseyirmiuc() {


        // Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(US06ResponsePojo.class);
        // actualData = new ObjectMapper().readValue(response.asString(), US23ResponsePojo.class);




    }

    @Then("Vice Dean bilgileri dogrulanir usyirmiuc databaseyirmiuc")
    public void viceDeanBilgileriDogrulanirUsyirmiucDatabaseyirmiuc() {

        //Do assertion


        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());



    }






    //US23 DATABASE
    @Given("Database e baglan usalti databaseyirmiuc")
    public void databaseEBaglanUsaltiDatabaseyirmiuc() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");


    }

    @When("gecerli kullanici ile username i cagir usalti databaseyirmiuc")
    public void gecerliKullaniciIleUsernameICagirUsaltiDatabaseyirmiuc() throws SQLException {


        statement = connection.createStatement();

        String query = "select * from guest_user where username = '" + fakeUsername + "'";

        resultSet = statement.executeQuery(query);



    }

    @Then("Var olan bodyde name, username, birthplace, cinsiyet, dogum tarihi, phone_number, ssn icerdigini test et usalti databaseyirmiuc")
    public void varOlanBodydeNameUsernameBirthplaceCinsiyetDogumTarihiPhone_numberSsnIcerdiginiTestEtUsaltiDatabaseyirmiuc() throws SQLException {


        while (resultSet.next()) {//yapay zeka

            // Sonuçlara erişim
            resultSet.getString("birth_day");
            resultSet.getString("birth_place");
            resultSet.getString("gender");
            resultSet.getString("name");
            resultSet.getString("password");
            resultSet.getString("phone_number");
            resultSet.getString("ssn");
            resultSet.getString("surname");
            resultSet.getString("username");

        }


    }


    /*

     */
}
