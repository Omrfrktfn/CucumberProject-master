package team12.stepDefinition.apiStepDef;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team12.pojos.esenPojo.ResponsePojo;
import team12.pojos.omerPojo.GuestUserRegisterPojo;
//import team12.pojos.omerPojo.RegisterResponsePojo;
import team12.pojos.omerPojo.US03Pojo;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US01_US02_Api_Def {


    static Response response;

    GuestUserRegisterPojo expectedData;

    ResponsePojo actualData;


    @Given("Register eklemek icin Post request hazirligi yapilir")
    public void registerEklemekIcinPostRequestHazirligiYapilir() {

        //   https://managementonschools.com/app/v2/api-docs/guestUser/register
        spec.pathParams("first", "guestUser",
                "second", "register");


    }

    @And("Gonderilecek register bilgileri hazirlanir")
    public void gonderilecekRegisterBilgileriHazirlanir() {

/*
{
 {
  "birthDay": "1997-01-01",
  "birthPlace": "warsaw",
  "gender": "MALE",
  "name": "oliveira",
  "password": "Emly.123",
  "phoneNumber": "305 542 3687",
  "ssn": "498-66-1287",
  "surname": "marly",
  "username": "Oliveira"
}
}
 */

        expectedData = new GuestUserRegisterPojo("1997-01-01", "warsaw",
                "MALE", "oliveira",
                "Emly.123", "305 542 3037",
                "498-12-1287", "marly",
                "veira");

    }

    @When("Register eklemek icin Post request gonderilir")
    public void registerEklemekIcinPostRequestGonderilir() throws JsonProcessingException {

        response = given(spec).
                body(expectedData).
                when().
                post("{first}/{second}");
        response.prettyPrint();

        actualData = response.as(ResponsePojo.class);

    }

    @Then("Register bilgileri dogrulanir")
    public void registerBilgileriDogrulanir() {

        assertEquals(200, response.getStatusCode());
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
