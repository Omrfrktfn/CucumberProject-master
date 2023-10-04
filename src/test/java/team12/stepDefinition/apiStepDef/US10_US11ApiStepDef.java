package team12.stepDefinition.apiStepDef;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import team12.pojos.zeynepPojo.Response11DeletePojo;
import team12.pojos.zeynepPojo.ResponsePojoUS1011;
import team12.pojos.zeynepPojo.US1011AddLessonPojo;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US10_US11ApiStepDef {
    US1011AddLessonPojo expectedData;
    Response response;
    ResponsePojoUS1011 actualData;
    Response11DeletePojo actualDeleteMessage;
    @Given("Prepare post request in order to add a lesson")
    public void prepare_post_request_in_order_to_add_a_lesson() {
        //Set the Url
        //https://managementonschools.com/app/lessonPrograms/save
        spec.pathParams("first","lessonPrograms","second","save");

    }
    @Given("Prepare the lesson information to be sent")
    public void prepare_the_lesson_information_to_be_sent() {
        //Set the expected Data
        /*
        {
  "day": "MONDAY",
  "educationTermId": "1",
  "lessonIdList": [
    "1"
  ],
  "startTime": "12:30",
  "stopTime": "13:30"
}
         */

        expectedData=new US1011AddLessonPojo("MONDAY","1", Collections.singletonList("1"),"12:30","13:30");

    }
    @When("Send post request to add a lesson")
    public void send_post_request_to_add_a_lesson() {
        //Send the request and get the response
        response=given(spec).body(expectedData).when().post("{first}/{second}");
        //response.prettyPrint();
        actualData=response.as(ResponsePojoUS1011.class);

    }
    @Then("Do assertion to verify the details of the lesson")
    public void do_assertion_to_verify_the_details_of_the_lesson() {
        //Do assertions
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getDay(),actualData.getObject().getDay());
        assertTrue(actualData.getObject().getStartTime().contains(expectedData.getStartTime()));
        assertTrue(actualData.getObject().getStopTime().contains(expectedData.getStopTime()));
        assertTrue(actualData.getMessage().contains("Created Lesson Program"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));
    }
    @And("Created lesson will be deleted from the lesson program list")
    public void createdLessonWillBeDeletedFromTheLessonProgramList() {
        int lessonProgId=actualData.getObject().getLessonProgramId();
        spec.pathParams("first","lessonPrograms","second","delete","third",lessonProgId);
        response=given(spec).when().delete("{first}/{second}/{third}");
        actualDeleteMessage=response.as(Response11DeletePojo.class);
        assertEquals("Lesson Program Deleted",actualDeleteMessage.getMessage());
        assertEquals("OK", actualDeleteMessage.getHttpStatus());


    }

}
/*
{
    "object": {
        "lessonProgramId": 614,
        "startTime": "12:30:00",
        "stopTime": "13:30:00",
        "lessonName": [
            {
                "lessonId": 1,
                "lessonName": "English",
                "creditScore": 5,
                "compulsory": true
            }
        ],
        "day": "MONDAY"
    },
    "message": "Created Lesson Program",
    "httpStatus": "CREATED"
}
 */
