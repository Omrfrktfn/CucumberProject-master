package team12.stepDefinition.omerend2end;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team12.pages.US01_US02_US03Pages;
import team12.pojos.omerPojo.US03Pojo;
import team12.pojos.omerPojo.US03ResponsePojo;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.sql.*;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team12.base_url.ManagementSchoolUrl.spec;

public class US03EndToEnd {

    static Response response;
    US01_US02_US03Pages pagesLocat = new US01_US02_US03Pages();
    private static String fakeName;

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    US03Pojo expectedData;

    US03ResponsePojo actualData;


    @Given("customer goes to {string} page")
    public void customerGoesToPage(String baseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(baseUrl));
        ReusableMethods.bekle(2);
    }

    @Given("customer clicks the contact button.")
    public void customerClicksTheContactButton() {
        pagesLocat.contact.click();
        ReusableMethods.bekle(2);
    }

    @When("customer write name {string}, email {string},subject {string}, message {string}")
    public void customerWriteNameEmailSubjectMessage(String name, String email, String subject, String message) {

        Faker faker = new Faker();
        fakeName = faker.name().name();
        pagesLocat.nameInput.sendKeys(fakeName);

        ReusableMethods.bekle(1);
        pagesLocat.contactYourEmail.sendKeys(email);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourSubject.sendKeys(subject);
        ReusableMethods.bekle(1);
        //    ReusableMethods.scroll(pagesLocat.contactYourMessage);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourMessage.sendKeys(message);

    }

    @Then("customer clicks the sendMessage button")
    public void customerClicksTheSendMessageButton() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(pagesLocat.contactYourSendMessageButton);
    }

    @And("user registration message confirms that it has been done")
    public void userRegistrationMessageConfirmsThatItHasBeenDone() {
        ReusableMethods.bekle(1);
        ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.contactAlertMessage.getText().contains("Successfully"));
    }


    @Given("Post request is prepared to add Contact")
    public void postRequestIsPreparedToAddContact() {
        //https://managementonschools.com/app/contactMessages/save

        spec.pathParams("first", "contactMessages",
                "second", "save");

    }

    @And("Prepares contact information to be sent")
    public void preparesContactInformationToBeSent() {
        expectedData = new US03Pojo("polyaa@gmail.com", "Contact Message Created Successfully",
                "piotrrr", "agaassga");

        //  System.out.println(expectedData);

    }

    @When("Post request is sent to add Contact")
    public void postRequestIsSentToAddContact() throws JsonProcessingException {
        //send the request and get the response
        response = given(spec).
                body(expectedData).
                when().
                post("{first}/{second}");

        response.prettyPrint();
        actualData = response.as(US03ResponsePojo.class);

        //actualData = response.as(HashMap.class);
        //   actualData = new ObjectMapper().readValue(response.asString(), US03ResponsePojo.class);

    }

    @Then("Contact information is verified")
    public void contactInformationIsVerified() {
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        assertEquals(expectedData.getMessage(), actualData.getMessage());

    }

    @Given("Queried by registered dean ID")
    public void queriedByRegisteredDeanID() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        // resultSet = statement.executeQuery("Select * from dean where name = " + fakeName + "");
        String name = "Ahmed Collins";
        resultSet = statement.executeQuery("Select * from contact_message where name ='" + name + "'");
        resultSet.next();
    }

    @Then("Body dogrula : name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void bodyDogrulaNameEmailSubjectMessageDate(String name, String email, String subject,
                                                       String message, String date) throws SQLException {
        String actualName = resultSet.getString("name");
        String actualEmail = resultSet.getString("email");
        String actualSubject = resultSet.getString("subject");
        String actualMessage = resultSet.getString("message");
        String actualDate = resultSet.getString("date");

        assertEquals(name, actualName);
        assertEquals(email, actualEmail);
        assertEquals(subject, actualSubject);
        assertEquals(message, actualMessage);
        assertEquals(date, actualDate);

        //assertEquals(200, response.statusCode());
        //assertEquals(expectedData.getName(), actualData.getObject().getName());
        //assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        //assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        //assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());


    }
}
