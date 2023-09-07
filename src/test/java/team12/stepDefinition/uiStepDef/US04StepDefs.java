package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import team12.pages.US04_US05Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US04StepDefs {

    US04_US05Pages us04_us05 =new US04_US05Pages();
    Faker faker=new Faker();


    @Then("user clicks on login button and logins as admin")
    public void userClicksOnLoginButtonAndLoginsAsAdmin() {
        us04_us05.loginButton.click();
        us04_us05.usernameBox.sendKeys("Team12Admin");
        us04_us05.passwordBox.sendKeys("Team12Admin");
        us04_us05.loginButton2.click();
    }

    @Then("enters name")
    public void entersName() {
        us04_us05.addDeanName.sendKeys(faker.name().firstName());
    }

    @And("enters surname")
    public void entersSurname() {
        us04_us05.addDeanSurname.sendKeys(faker.name().lastName());
    }

    @And("enters birth place")
    public void entersBirthPlace() {
        String fakeCity = faker.address().cityName();
        boolean flag = true; //16 karakterden kisa city almak icin
        while(flag){
            if(fakeCity.length()>16){
                fakeCity = faker.address().cityName();
            }else {
                flag = false;
            }
        }
        us04_us05.addDeanBirthPlace.sendKeys(fakeCity);
    }

    @And("select gender")
    public void selectGender() {
        ReusableMethods.click(us04_us05.addDeanGenderMale);
    }

    @And("enters date of birth")
    public void entersDateOfBirth() {
        us04_us05.addDeanBirthday.sendKeys("14091990");
    }

    @And("enters phone number")
    public void entersPhoneNumber() {
        String fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        us04_us05.addDeanPhoneNumber.sendKeys(fakePhoneNumber);    }

    @And("enters SSN Number {string}")
    public void entersSSNNumber(String str){
        String ssn = "";
        switch (str){
            case("valid"):
                ssn = faker.idNumber().ssnValid();
                break;
            case("without - after 3rd digit"):
                ssn = "123456-1234";
                break;
            case("without - after 5th digit"):
                ssn = "123-4512345";
                break;
            case ("more than 9 characters"):
                ssn = "123-12-123411";
                break;
            case("less than 9 characters"):
                ssn = "123-45–123";
                break;
        }
        us04_us05.addDeanSSN.sendKeys(ssn);    }

    @And("enters a username")
    public void entersAUsername() {
        String fakeUsername = faker.name().username();
        boolean flag = true; //16 karakterden kisa username almak icin
        while(flag){
            if(fakeUsername.length()>16){
                fakeUsername = faker.address().cityName();
            }else {
                flag = false;
            }
        }
        us04_us05.addDeanUsername.sendKeys(fakeUsername);    }

    @And("enters suitable password")
    public void entersSuitablePassword() {
        String suitablePassword ="Team12Admin";
        us04_us05.addDeanPassword.sendKeys(suitablePassword);    }

    @And("user clicks on submit button to add")
    public void userClicksOnSubmitButtonToAdd() {
        us04_us05.addSubmitButton.click();
    }

    @And("doesn't enter name")
    public void doesnTEnterName() {
        us04_us05.addDeanName.sendKeys("");
    }

    @And("verifies {string} text is not seen")
    public void verifiesTextIsNotSeen(String text) {
        assertFalse(Driver.getDriver().getPageSource().contains(text));

    }

    @And("doesn't enter surname")
    public void doesnTEnterSurname() {
        us04_us05.addDeanSurname.sendKeys("");
    }

    @And("doesn't enter birth place")
    public void doesnTEnterBirthPlace() {
        us04_us05.addDeanBirthPlace.sendKeys("");
    }

    @And("doesn't select gender")
    public void doesnTSelectGender() {
        us04_us05.addDeanGenderMale.sendKeys("");
    }

    @And("doesn't enter date of birth")
    public void doesnTEnterDateOfBirth() {
        us04_us05.addDeanBirthday.sendKeys("");
    }

    @And("doesn't enter phone number")
    public void doesnTEnterPhoneNumber() {
        us04_us05.addDeanPhoneNumber.sendKeys("");
    }

    @And("doesn't enter SSN Number")
    public void doesnTEnterSSNNumber() {
        us04_us05.addDeanSSN.sendKeys("");
    }

    @And("doesn't enter username")
    public void doesnTEnterUsername() {
        us04_us05.addDeanUsername.sendKeys("");

    }

    @And("doesn't enter password")
    public void doesnTEnterPassword() {
        us04_us05.addDeanPassword.sendKeys("");
    }

    @And("enters password with {string}")
    public void entersPasswordWith(String str) {
        String delete = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
        us04_us05.addDeanPassword.sendKeys(delete); //onceden girdigi passwordu silmeden yenisini eklememesi icin
        ReusableMethods.bekle(1);
        String password="";
        switch (str){
            case("lowercase and numbers") :
                password = "team12team";
                break;
            case("uppercase and numbers") :
                password = "TEAM12TEAM";
                break;
            case("lowercase and uppercase") :
                password = "teamTEAM";
                break;
            case("less than 8 characters") :
                password = "Team12";
                break;
        }
        us04_us05.addDeanPassword.sendKeys(password);

    }

    @And("verifies {string} password warning is seen")
    public void verifiesPasswordWarningIsSeen(String text) {
        assertEquals(text,us04_us05.passwordAlert.getText());
    }
}
