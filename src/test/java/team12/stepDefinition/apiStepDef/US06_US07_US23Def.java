package team12.stepDefinition.apiStepDef;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team12.pages.US06_US07_US03Pages;
import team12.pojos.esmaPojo.*;
import team12.utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team12.base_url.ManagementSchoolUrl.spec;
import static team12.base_url.ManagementSchoolUrlDean.spec1;

public class US06_US07_US23Def {



    //Set the expected data
    //Send the request and get the response
    //response = given(spec).body(expectedData).when().post("{first}/{second}");
    //actualData = response.as(ResponsePojo.class);
    //Do assertion


    US06ViceDeanPojo expectedData;
    US06ResponsePojo actualData;
    Response response;

    US07DeanMessagePojo expectedData1;
    US07Content1Pojo actualData1;
    Response response1;

    public static String fakeUsername;
    public static String fakeSsn;
    public static String fakePhoneNumber;


    //US06
    @Given("Vice Dean eklemek icin Post request hazirligi yapilir usalti")
    public void viceDeanEklemekIcinPostRequestHazirligiYapilirUsalti() {
        //Set the URL
        //https://managementonschools.com/app//vicedean/save
        spec1.pathParams("first", "vicedean", "second", "save");


    }

    @And("Gonderilecek Vice Dean bilgileri hazirlanir usalti")
    public void gonderilecekViceDeanBilgileriHazirlanirUsalti() {

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);

        fakeSsn = faker.idNumber().ssnValid();

        fakeUsername = faker.name().username();


        // Set the expected data
        expectedData = new US06ViceDeanPojo("1998-12-12","manti","MALE","Cucumberui1","Cucumberui1",fakePhoneNumber,fakeSsn,"Cucumberui1",fakeUsername);

        //	public US06ViceDeanPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {

    }

    @When("Vice Dean eklemek icin Post request gonderilir usalti")
    public void viceDeanEklemekIcinPostRequestGonderilirUsalti() throws JsonProcessingException {


        // Send the request and get the response
        response1 = given(spec1).body(expectedData).when().post("{first}/{second}");
        actualData = response1.as(US06ResponsePojo.class);
        // actualData = new ObjectMapper().readValue(response.asString(), US23ResponsePojo.class);



    }

    @Then("Vice Dean bilgileri dogrulanir usalti")
    public void viceDeanBilgileriDogrulanirUsalti() {

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


        //US23


    /*
    "whatever","Cucumber1","Cucumber1","1998-12-12","300-38-3204","Cucumber1","738-953-4934","FEMALE"
     */



        //POSTMANDEKI DATA
        //{
        //    "object": {
        //        "userId": 474,
        //        "username": "whatever",
        //        "name": "Cucumber1",
        //        "surname": "Cucumber1",
        //        "birthDay": "1998-12-12",
        //        "ssn": "300-38-3204",
        //        "birthPlace": "Cucumber1",
        //        "phoneNumber": "738-953-4934",
        //        "gender": "FEMALE"
        //    },
        //    "message": "Vice dean Saved",
        //    "httpStatus": "CREATED"
        //}


    }





    //US07
    @Given("Mesajlari, yazarlarini, e-maillerini, gonderilme tarihi ve  subject bilgilerini goruntuleyebilmek icin post request hazirligi yapilir usalti")
    public void mesajlariYazarlariniEMailleriniGonderilmeTarihiVeSubjectBilgileriniGoruntuleyebilmekIcinPostRequestHazirligiYapilirUsalti() {

        //Set the url
        //https://managementonschools.com/app/contactMessages/searchByEmail?email=chang.cummings@hotmail.com
        spec1.pathParams("first", "contactMessages", "second", "searchByEmail")
                   .queryParams("email","chang.cummings@hotmail.com");





    }

    @And("Mesajlari, yazarlarini, e-maillerini, gonderilme tarihi ve  subject bilgilerini goruntulendigi dogrulanir usalti")
    public void mesajlariYazarlariniEMailleriniGonderilmeTarihiVeSubjectBilgileriniGoruntulendigiDogrulanirUsalti() {
        //Set the expected data
        expectedData1 = new US07DeanMessagePojo("James Ullrich","chang.cummings@hotmail.com","i44t","4pxkmpwrk","2023-09-13");

        /*
        {
        "James Ullrich","chang.cummings@hotmail.com","i44t","4pxkmpwrk","2023-09-13"
        }
         */


        //Send the request and get the response
        response1 = given(spec1).body(expectedData1).when().get("{first}/{second}");


        // actualData1 = new ObjectMapper().readValue(response1.asString(), US07ResponsePojo.class);
        //actualData1 = response1.as(US07Content1Pojo.class);
        //System.out.println("actualData1 = " + actualData1);

        //Do assertion
        JsonPath jsonPath = response1.jsonPath();
        String actName = jsonPath.getList("content.findAll{it.email=='chang.cummings@hotmail.com'}.name").get(0).toString();
        String actEmail = jsonPath.getList("content.findAll{it.email=='chang.cummings@hotmail.com'}.email").get(0).toString();
        String actSubject = jsonPath.getList("content.findAll{it.email=='chang.cummings@hotmail.com'}.subject").get(0).toString();
        String actMessage = jsonPath.getList("content.findAll{it.email=='chang.cummings@hotmail.com'}.message").get(0).toString();
        String actDate = jsonPath.getList("content.findAll{it.email=='chang.cummings@hotmail.com'}.date").get(0).toString();


        assertEquals(200, response1.statusCode());
        assertEquals(expectedData1.getName(),actName);
        assertEquals(expectedData1.getEmail(),actEmail);
        assertEquals(expectedData1.getSubject(),actSubject);
        assertEquals(expectedData1.getDate(),actDate);
        assertEquals(expectedData1.getMessage(),actMessage);


    }



    //US23-->Admin
    @Given("Vice Dean eklemek icin Post request hazirligi yapilir usyirmiuc")
    public void viceDeanEklemekIcinPostRequestHazirligiYapilirUsyirmiuc() {

        //Set the URL
        //https://managementonschools.com/app//vicedean/save
        spec.pathParams("first", "vicedean", "second", "save");




    }

    @And("Gonderilecek Vice Dean bilgileri hazirlanir usyirmiuc")
    public void gonderilecekViceDeanBilgileriHazirlanirUsyirmiuc() {

        Faker faker = new Faker();

        fakePhoneNumber = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);

        fakeSsn = faker.idNumber().ssnValid();

        fakeUsername = faker.name().username();


        // Set the expected data
        expectedData = new US06ViceDeanPojo("1998-12-12","manti","MALE","Cucumberui1","Cucumberui1",fakePhoneNumber,fakeSsn,"Cucumberui1",fakeUsername);

        //	public US06ViceDeanPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username) {



    }

    @When("Vice Dean eklemek icin Post request gonderilir usyirmiuc")
    public void viceDeanEklemekIcinPostRequestGonderilirUsyirmiuc() {


        // Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(US06ResponsePojo.class);
        // actualData = new ObjectMapper().readValue(response.asString(), US23ResponsePojo.class);



    }

    @Then("Vice Dean bilgileri dogrulanir usyirmiuc")
    public void viceDeanBilgileriDogrulanirUsyirmiuc() {

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



}
