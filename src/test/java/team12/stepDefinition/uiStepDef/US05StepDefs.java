package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import team12.pages.US04_US05Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.security.SecureRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US05StepDefs {
    public static String randomPassword(int lower,int upper,int numeric) {
        String lowercharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String uppercharacters = "abcdefghijklmnopqrstuvwxyz";
        String numericcharacters = "0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < lower; i++) {
            int randomIndex1 = random.nextInt(lowercharacters.length());
            char randomLowerChar = lowercharacters.charAt(randomIndex1);
            password.append(randomLowerChar);
        }
        for (int i = 0; i < upper; i++) {
            int randomIndex2 = random.nextInt(uppercharacters.length());
            char randomUpperChar = uppercharacters.charAt(randomIndex2);
            password.append(randomUpperChar);
        }
        for (int i = 0; i <numeric; i++) {
            int randomIndex3 = random.nextInt(numericcharacters.length());
            char randomNumericChar = numericcharacters.charAt(randomIndex3);
            password.append(randomNumericChar);

        }
        return password.toString();
    }

    US04_US05Pages us04_us05 =new US04_US05Pages();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker = new Faker();
    @Given("user goes to Management on Schools homepage")
    public void userGoesToManagementOnSchoolsHomepage() {
            Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("Click on Login button")
    public void clickOnLoginButton() {
        us04_us05.loginButton.click();

    }

    @And("Enter your Username,Password and login")
    public void enterYourUsernamePasswordAndLogin() {us04_us05.usernameBox.sendKeys("Team12Admin");
        us04_us05.passwordBox.sendKeys("Team12Admin");
        us04_us05.loginButton2.click();
    }

    @And("waits for {int} seconds")
    public void waitsForSeconds(int seconds) {
        ReusableMethods.bekle(seconds);
    }

    @And("clicks on Menu")
    public void clicksOnMenu() {
        us04_us05.adminMenu.click();
        ReusableMethods.bekle(1);
    }

    @And("clicks on Dean Management")
    public void clicksOnDeanManagement() {
        us04_us05.deanManagement.click();
    }

    @And("verifies that {string} is seen")
    public void verifiesThatIsSeen(String str) {
        switch (str) {
            case ("name section"):
                assertTrue(us04_us05.deanNameList.size() > 0);
                break;
            case ("gender section"):
                assertTrue(us04_us05.genderList.size() > 0);
                break;
            case ("phone number section"):
                assertTrue(us04_us05.phoneNumberList.size() > 0);
                break;
            case ("SSN section"):
                assertTrue(us04_us05.ssnList.size() > 0);
                break;
            case ("username section"):
                assertTrue(us04_us05.userNameList.size() > 0);
        }
    }
    @And("closes the page")
    public void closesThePage() {
                Driver.closeDriver();
    }

    @And("clicks on edit button")
    public void clicksOnEditButton() {
          WebElement us05EditButton= us04_us05.us05EditButton;
          ReusableMethods.click(us05EditButton);
          //  actions.scrollByAmount(0,1500).perform();
          //  ReusableMethods.bekle(2);
        }


    @And("changes name,surname,birthplace,gender,date of birth,phone number,SSN,username,password fields")
    public void changesNameSurnameBirthplaceGenderDateOfBirthPhoneNumberSSNUsernamePasswordFields() {
        String fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        String fakeCity = faker.address().cityName();
        String fakeUsername = faker.name().username();

        boolean flag = true; //16 karakterden kisa city ve username almak icin

        while(flag){
            if(fakeCity.length()>16 && fakeUsername.length()>16){
                fakeUsername = faker.name().username();
                fakeCity = faker.address().cityName();
            }else {
                flag = false;
            }
        }
        String delete = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);

        us04_us05.editDeanName.sendKeys(delete,faker.name().firstName());

        us04_us05.editDeanSurname.sendKeys(delete,faker.name().lastName());

        us04_us05.editDeanBirthPlace.sendKeys(delete,fakeCity);

        ReusableMethods.click(us04_us05.editDeanGenderFemale);
        ReusableMethods.bekle(2);
        us04_us05.editDeanBirthday.sendKeys(delete,"14091990");

        us04_us05.editDeanPhoneNumber.sendKeys(delete,fakePhoneNumber);

        us04_us05.editDeanSSN.sendKeys(delete,faker.idNumber().ssnValid());

        us04_us05.editDeanUsername.sendKeys(delete,fakeUsername, Keys.TAB);
        us04_us05.editDeanPassword.sendKeys(randomPassword(2,2,4));
       // actions.click(us04_us05.addDeanPassword).perform();
       // actions.sendKeys(randomPassword(2,2,4));
       // ReusableMethods.sendKeysJS(us04_us05.editDeanPassword, randomPassword(2,2,4));
       // us04_us05.editDeanPassword.sendKeys(randomPassword(2,2,4));

        //us04_us05.editDeanPassword.sendKeys(faker.internet().password(8,9,true,false,true));

    }


    @And("clicks on Submit button for edition")
    public void clicksOnSubmitButtonForEdition() {
        us04_us05.editSubmitButton.click();
    }

    @Then("verifies {string} text is seen")
    public void verifiesTextIsSeen(String text) {
        if(text.equals("Dean Saved")){
            ReusableMethods.visibleWait(us04_us05.deanSavedText,5);
            assertEquals(text,us04_us05.deanSavedText.getText());
        } else if (text.equals("Dean updated Successful")) {
            ReusableMethods.visibleWait(us04_us05.deanUpdatedText,5);
            assertEquals(text,us04_us05.deanUpdatedText.getText());
        } else if (text.equals("Please enter valid SSN number")) {
            ReusableMethods.visibleWait(us04_us05.invalidSsnText,5);
            assertEquals(text,us04_us05.invalidSsnText.getText());
        }
    }
}
