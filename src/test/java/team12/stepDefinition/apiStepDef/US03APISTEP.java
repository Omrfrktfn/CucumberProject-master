package team12.stepDefinition.apiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US03APISTEP {

    Response response;
    @Given("Get request ile tum mesajlari al")
    public void getRequestIleTumMesajlariAl() {
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","10000");

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("bodyi dogrula: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void bodyiDogrulaNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) {


        JsonPath jsonPath = response.jsonPath();
        String actName = jsonPath.getList("content.findAll{it.email=='johndoe@gmail.com'}.name").get(0).toString();
        String actEmail = jsonPath.getList("content.findAll{it.email=='johndoe@gmail.com'}.email").get(0).toString();
        String actSubject = jsonPath.getList("content.findAll{it.email=='johndoe@gmail.com'}.subject").get(0).toString();
        String actMessage = jsonPath.getList("content.findAll{it.email=='johndoe@gmail.com'}.message").get(0).toString();
        String actDate = jsonPath.getList("content.findAll{it.email=='johndoe@gmail.com'}.date").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(actName,name);
        assertEquals(actEmail,email);
        assertEquals(actSubject,subject);
        assertEquals(actMessage,message);
        assertEquals(actDate,date);

    }
}
