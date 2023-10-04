package team12.stepDefinition.omerend2end;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team12.pages.US01_US02_US03Pages;
import team12.pojos.omerPojo.US03Pojo;
import team12.pojos.omerPojo.US03ResponsePojo;
import team12.utilities.ReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.assertTrue;

public class US01_02EndToEnd {

    static Response response;
    private static String fakeUsername;
    private static String fakeSurname;
    private static String fakeSsn;
    private static String fakePhoneNumber;
    US01_US02_US03Pages pagesLocat = new US01_US02_US03Pages();
    private static String fakeName;

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("customer clicks the register button.")
    public void customerClicksTheRegisterButton() {
        pagesLocat.register.click();
    }


    @When("customer write name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void customerWriteNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
      //  fakeUsername = faker.name().name();
       // pagesLocat.nameInput.sendKeys(fakeUsername);

        pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);

        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }


        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }

    @And("user omer confirms registration")
    public void userOmerConfirmsRegistration() {
        ReusableMethods.bekle(2);
        //  US01_US02_US03Pages pagesLocat = new US01_US02_US03Pages();
        ReusableMethods.click(pagesLocat.registerButton);
        ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.alertMessage.getText().contains("Guest User registered"));
    }
}
