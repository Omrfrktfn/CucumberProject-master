package team12.stepDefinition.apiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team12.pojos.zeynepPojo.ResponseUS12Pojo;
import team12.pojos.zeynepPojo.US12AddLessonToTeacherPojo;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US12StepDefApi {
    US12AddLessonToTeacherPojo expectedData;
    static Response response;
    ResponseUS12Pojo actualData;
    @Given("NEw prepare post request in order to add lesson to a teacher")
    public void newPreparePostRequestInOrderToAddLessonToATeacher() {
        //Set the Url
        //https://managementonschools.com/app/teachers/chooseLesson
        spec.pathParams("first","teachers","second","chooseLesson");

    }

    @And("NEW prepare lesson information to be sent to the teacher")
    public void newPrepareLessonInformationToBeSentToTheTeacher() {
        expectedData=new US12AddLessonToTeacherPojo(Collections.singletonList("18"),"23");


    }

    @When("New send the post request to add the lesson to the teacher")
    public void newSendThePostRequestToAddTheLessonToTheTeacher() {
        //Send the request and get the response
        response=given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        actualData=response.as(ResponseUS12Pojo.class);
    }

    @Then("New do assertions to verify lesson has assigned to the teacher")
    public void newDoAssertionsToVerifyLessonHasAssignedToTheTeacher() {
        assertEquals(200,response.statusCode());
        assertTrue(actualData.getMessage().contains("Lesson added to Teacher"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));

    }
}
