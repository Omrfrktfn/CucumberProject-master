package team12.stepDefinition.apiStepDef;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import team12.pojos.esenPojo.ResponsePojo;
import team12.pojos.omerPojo.US03Pojo;
import team12.pojos.omerPojo.US03ResponsePojo;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team12.base_url.ManagementSchoolUrl.spec;


public class US03_Api_Def {

    static Response response;

    US03Pojo expectedData;

    // US03Pojo actualData;

    US03ResponsePojo actualData;

    //Map<String,Object> actualData;


    @Given("Contact eklemek icin Post request hazirligi yapilir")
    public void contactEklemekIcinPostRequestHazirligiYapilir() {

        //https://managementonschools.com/app/contactMessages/searchByEmail?email=oft@gmail.com
        //https://managementonschools.com/app/contactMessages/searchBySubject?subject=Fiyatlar%20hakkinda%20bilgi

        //https://managementonschools.com/app/contactMessages/save

        spec.pathParams("first", "contactMessages",
                "second", "save");

        //  spec.pathParams("first","contactMessages","second","getAll").
        //        queryParams("size","10000");

         //spec.pathParams("first", "contactMessages", "second", "searchBySubject").
           //    queryParam("subject", "education");

    }


    @And("Gonderilecek contact bilgileri hazirlanir")
    public void gonderilecekContactBilgileriHazirlanir() {

         /*
     {
  "email": "tfn@02gmail.com",
  "message": "information about classes",
  "name": "emly",
  "subject": "education"
}
         */

        expectedData = new US03Pojo("zygadf@05gmail.com", "fagasadf classes",
                "veira", "akfaf");

        //  System.out.println(expectedData);

    }


    @When("Contact eklemek icin Post request gonderilir")
    public void contactEklemekIcinPostRequestGonderilir() throws JsonProcessingException {

        //send the request and get the response
        response = given(spec).
                body(expectedData).
                when().
                get("{first}/{second}");

        response.prettyPrint();

        actualData = response.as(US03ResponsePojo.class);

        //actualData = response.as(HashMap.class);
        // actualData = new ObjectMapper().readValue(response.asString(), US03Pojo.class);

    }


    @Then("Contact bilgileri dogrulanir")
    public void contactBilgileriDogrulanir() {

        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        assertEquals(expectedData.getMessage(), actualData.getMessage());

    }


}
