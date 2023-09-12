package team12.stepDefinition.apiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team12.pojos.esenPojo.ResponsePojo;
import team12.pojos.esenPojo.US04Pojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US04_Api_Def {

    Response response;
    US04Pojo expectedData;
    ResponsePojo actualData;


    @Given("Dean eklemek icin Post request hazirligi yapilir")
    public void deanEklemekIcinPostRequestHazirligiYapilir() {

        // https://managementonschools.com/app/v2/api-docs/dean/save
        spec.pathParams("first", "dean",
                "second", "save");

    }

    @And("Gonderilecek dean bilgileri hazirlanir")
    public void gonderilecekDeanBilgileriHazirlanir() {

        expectedData = new US04Pojo("1987-01-02",
                "krakow",
                "FEMALE",
                "essen",
                "Essen.123",
                "368-546-6547",
                "123-45-7896",
                "mike",
                "Mike");

    }

    @When("Dean eklemek icin Post request gonderilir")
    public void deanEklemekIcinPostRequestGonderilir() {
      response = given(spec).
                body(expectedData).
                when().
                post("{first}/{second}");
       // response.prettyPrint();
        actualData = response.as(ResponsePojo.class);

    }

    @Then("Dean bilgileri dogrulanir")
    public void deanBilgileriDogrulanir() {

        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());



    }
}
