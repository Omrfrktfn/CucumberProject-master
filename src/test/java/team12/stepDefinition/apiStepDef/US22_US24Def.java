//package team12.stepDefinition.apiStepDef;
//
//import io.cucumber.java.en.*;
//import io.restassured.response.Response;
//import team12.pojos.admin_management.*;
//import static io.restassured.RestAssured.given;
//import static org.junit.Assert.assertEquals;
//import static team12.base_url.ManagementSchoolUrl.spec;
//
//
//public class US22_US24Def {
//
//    AddAdminPojo  expectedData;
//    Response response;
//
//    ResponseAdminPojo actualData;
//
//
//    @Given("Post request is prepared to add Admin")
//    public void post_request_is_prepared_to_add_admin() {
//        //https://managementonschools.com/app/admin/save
//        spec.pathParams("first", "admin","second","save");
//    }
//    @Given("Admin information to be sent is prepared")
//    public void admin_information_to_be_sent_is_prepared() {
//         expectedData = new AddAdminPojo("1975-03-03","Newyork","true","FEMALE","Jane","Jane75@@","345-234-3454","567-87-2498","Marker","JaneMark");
//
//    }
//    @When("Post request is sent to add admin")
//    public void post_request_is_sent_to_add_admin() {
//         response = given(spec).body(expectedData).when().post("{first}/{second}");
//         actualData = response.as(ResponseAdminPojo.class);
//    }
//    @Then("Admin information is verified")
//    public void admin_information_is_verified() {
//        assertEquals(200, response.statusCode());
//        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
//        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
//        assertEquals(expectedData.getName(), actualData.getObject().getName());
//        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
//        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
//        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
//        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
//
//
//
//    }
//}
