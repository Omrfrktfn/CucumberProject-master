package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import team12.pages.US22_US24Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;


public class US22_US24Def extends ReusableMethods {

    US22_US24Pages US22_US24Pages = new US22_US24Pages();
    Faker faker = new Faker();

    //*************** US22

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("user waits {int} second")
    public void user_waits_second(int second)  {
        ReusableMethods.bekle(second);
    }

    @Given("User clicks the Login section")
    public void user_clicks_the_login_section() {
        click(US22_US24Pages.logInUs_22);
        ReusableMethods.bekle(2);
    }

    @Given("User enters given infos and login")
    public void user_enters_and_login(DataTable data) {
        US22_US24Pages.userNameUs_22.sendKeys(data.row(1).get(0), Keys.TAB, data.row(1).get(1), Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} title")
    public void sees_title(String str) {
        Assert.assertTrue(US22_US24Pages.addAdminHeaderUs_22.getText().contains(str));
        ReusableMethods.bekle(4);
    }

    @And("User enters the {string}, {string}, {string}, select gender, {string}, {string}, {string} , {string}, {string} infos and submit")
    public void userEntersTheInfosAndSubmit(String name, String surname, String birthPlace, String dateOfBirth, String phone, String ssnNumber, String userName, String password) {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        US22_US24Pages.nameUs_22.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace, Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, dateOfBirth, Keys.TAB, phone, Keys.TAB, ssnNumber, Keys.TAB, userName, Keys.TAB, password, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("User closed the page")
    public void user_closed_the_page() {
        Driver.closeDriver();
    }

    //*******************

    @Given("User selects the Gender")
    public void user_selects_the_gender() {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        US22_US24Pages.maleGenderUs_22.click();
        ReusableMethods.bekle(2);
        US22_US24Pages.submitUs_24.click();
    }

    @Given("Sees {string} under Name section")
    public void sees_under_name_section(String str) {
        Assert.assertTrue(US22_US24Pages.nameAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Surname section")
    public void sees_under_surname_section(String str) {
        Assert.assertTrue(US22_US24Pages.surnameAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Birth Place section")
    public void sees_under_birth_place_section(String str) {
        Assert.assertTrue(US22_US24Pages.birthPlaceAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Date Of Birth section")
    public void sees_under_date_of_birth_section(String str) {
        Assert.assertTrue(US22_US24Pages.dateOfBirthAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Phone section")
    public void sees_under_phone_section(String str) {
        Assert.assertTrue(US22_US24Pages.phoneAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Ssn section")
    public void sees_under_ssn_section(String str) {
        Assert.assertTrue(US22_US24Pages.ssnAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under User Name section")
    public void sees_under_user_name_section(String str) {
        Assert.assertTrue(US22_US24Pages.userNameAlertUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @Given("Sees {string} under Password section")
    public void sees_under_password_section(String string) {
        Assert.assertTrue(US22_US24Pages.passwordAlertUs_22.getText().contains(string));
        ReusableMethods.bekle(2);
    }

    //********************

    @And("User enters the required infos and add {string}, {string}")
    public void userEntersTheInfos(String dateOfBirth, String phone) {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(), Keys.TAB,
                faker.address().city(), Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, dateOfBirth, Keys.TAB, phone);
        ReusableMethods.bekle(2);
        US22_US24Pages.userNameUs_22.sendKeys(faker.name().username(), Keys.TAB, faker.internet()
                .password(8,20,true,true,true));
        ReusableMethods.bekle(2);


    }

    @And("User enters total Ssn number first {int} digit and {int} digit and add {int} digits with a '-' sign after the third and fifth digits")
    public void userEntersWithDigitsWithASignAfterTheRdAndThDigits(int int1, int int2, int int3) {
        US22_US24Pages.ssnNumberUs_22.sendKeys(Faker.instance().number().digits(int1) + "-" +
                Faker.instance().number().digits(int2) + "-" + Faker.instance().number().digits(int3),Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("Sees the {string} Alert under Ssn section")
    public void seesTheAlertUnderSsnSection(String str) {
        Assert.assertTrue(US22_US24Pages.ssnAlertMinUs_22.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @And("User clear the Ssn section")
    public void userClearTheSsnSection() {
        US22_US24Pages.ssnNumberUs_22.sendKeys(Keys.CONTROL + "a");
        ReusableMethods.bekle(2);
        US22_US24Pages.ssnNumberUs_22.sendKeys(Keys.DELETE);
        ReusableMethods.bekle(3);


    }

    @And("User enters Ssn number first {int} digit and {int} digit and add {int} digits with a ' ' gap after the third and fifth digits")
    public void userEntersWithLettersWithASignAfterTheRdAndThDigits(int int1, int int2, int int3) {
        US22_US24Pages.ssnNumberUs_22.sendKeys(Faker.instance().number().digits(int1) + " "
                + Faker.instance().number().digits(int2) + " " + Faker.instance().number().digits(int3),
                Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(1);
    }

    @And("User enters the {string} and {string} infos and submit")
    public void userEntersTheAndInfosAndSubmit(String userName, String password) {
        US22_US24Pages.userNameUs_22.sendKeys(userName, Keys.TAB, password, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    //****************


    @And("User enters total Ssn number first {int} digit and {int} digit and add {int} digits plus one letter with a '-' sign after the third and fifth digits")
    public void userEntersTotalSsnNumberFirstDigitAndDigitAndAddLettersWithAGapAfterTheThirdAndFifthDigits(int int1, int int2, int int3) {
        US22_US24Pages.ssnNumberUs_22.sendKeys(Faker.instance().number().digits(int1) + "-" +
                Faker.instance().number().digits(int2) + "-" + Faker.instance().number().digits(int3) +"m");
        ReusableMethods.bekle(2);
        US22_US24Pages.submitUs_24.click();
        ReusableMethods.bekle(2);
    }

    @Then("Not see {string} alert")
    public void notSeeAdminSavedAllert(String str) {
       // Assert.assertFalse(US22_US24Pages.nameAlertUs_22.isDisplayed());
       // ReusableMethods.bekle(2);
        WebElement table=Driver.getDriver().findElement(By.xpath("//*[@class='table-responsive']"));
        List<WebElement> rows=table.findElements(By.xpath(".//tr"));
        for(WebElement row:rows) {
            //System.out.println(row.getText());
            Assert.assertFalse(row.getText().contains(str));
            //(//*[@class='visually-hidden'])[5]

        }
    }

    //************** US24


    @And("Sees {string}, {string}")
    public void sees(String str, String  str1) {
        Assert.assertTrue(US22_US24Pages.hiUs_24.getText().contains(str));
        ReusableMethods.bekle(2);
        Assert.assertTrue(US22_US24Pages.Team12AdminUs_24.getText().contains(str1));
        ReusableMethods.bekle(2);

    }

    @And("User click the menu and select Teacher Management in the menu")
    public void userClickTheMenuAndSelectTeacherManagementInTheMenu() {
        US22_US24Pages.menuUs_24.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().findElement(By.xpath("//a[text()='Teacher Management']")).click();
        ReusableMethods.bekle(5);
    }

    @And("Sees {string} header")
    public void seesHeader(String str) {
        Assert.assertTrue(US22_US24Pages.addTeacherUs_24.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @And("User selects the choosen lessons and enters the {string} and given infos except password")
    public void userSelectsTheChoosenLessonsAndEntersTheInfosAndSubmit(String dateOfBirth) {
        US22_US24Pages.selectUs_24.click();
        ReusableMethods.bekle(2);
        US22_US24Pages.basketballUs_24.click();
        ReusableMethods.bekle(2);

        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(),
                Keys.TAB, faker.address().city(), Keys.TAB, faker.internet().emailAddress(),
                Keys.TAB, faker.instance().number().digits(3) + "-" + Faker.instance().number().digits(3)
                        + "-" + Faker.instance().number().digits(4), Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, dateOfBirth,
                Keys.TAB, faker.idNumber().ssnValid(), Keys.TAB, faker.name().username(), Keys.TAB);

        ReusableMethods.bekle(2);
    }

    @And("User not select the choosen lessons and enters the {string} and given infos and submit")
    public void userNotSelectTheChoosenLessonsAndEntersTheInfosAndSubmit(String dateOfBirth) {
        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(),
                Keys.TAB, faker.address().city(), Keys.TAB, faker.internet().emailAddress(),
                Keys.TAB, faker.instance().number().digits(3) + "-" + Faker.instance().number().digits(3) + "-"
                        + Faker.instance().number().digits(4), Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
                Keys.TAB, dateOfBirth, Keys.TAB, faker.idNumber().ssnValid(), Keys.TAB, faker.name().username(),
                Keys.TAB, faker.internet().password(8,20,true,true,true),
                Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("User selects the choosen lessons")
    public void userSelectsTheChoosenLessons() {
        US22_US24Pages.selectUs_24.click();
        ReusableMethods.bekle(2);
        US22_US24Pages.basketballUs_24.click();
        ReusableMethods.bekle(2);
        US22_US24Pages.submitUs_24.click();
        ReusableMethods.bekle(2);
    }

    @And("Sees {string} under Email section")
    public void seesUnderEmailSection(String str) {
        Assert.assertTrue(US22_US24Pages.emailAlertUs_24.getText().contains(str));
        ReusableMethods.bekle(2);
    }

    @And("User enters User Name, Password and submit")
    public void userEntersThePasswordAndSubmit() {
         US22_US24Pages.userNameUs_22.sendKeys(faker.name().username(), Keys.TAB, faker.internet()
                 .password(8,20,true,true,true),
                 Keys.TAB, Keys.ENTER);
         ReusableMethods.bekle(2);
    }

    @And("User clear the Password box")
    public void userClearThePasswordBox() {
        US22_US24Pages.passwordUs_24.sendKeys(Keys.CONTROL + "a");
        US22_US24Pages.passwordUs_24.sendKeys(Keys.DELETE);
        ReusableMethods.bekle(3);
    }

    @And("User enters the {string} At least eight charakter and must contain uppercase letters, lowercase letters")
    public void userEntersTheAtLeastEightCharakterAndMustContainUppercaseLettersLowercaseLetters(String Password1) {
        US22_US24Pages.passwordUs_24.sendKeys(Password1,Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @And("User enters the {string} At least eight charakter and must contain uppercase letters and numbers")
    public void userEntersTheAtLeastEightCharakterAndMustContainUppercaseLettersAndNumbers(String Password2) {
        US22_US24Pages.passwordUs_24.sendKeys(Password2,Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("User enters the {string} At least eight charakter and must contain lowercase letters and numbers")
    public void userEntersTheAtLeastEightCharakterAndMustContainLowercaseLettersAndNumbers(String Password3) {
        US22_US24Pages.passwordUs_24.sendKeys(Password3,Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("User enters the {string} At least eight charakter and must contain uppercase letters, lowercase letters and numbers and submit")
    public void userEntersTheAtLeastCharakterAndMustContainUppercaseLettersLowercaseLettersAndNumbersAndSubmit(String Password) {
        US22_US24Pages.passwordUs_24.sendKeys(Password, Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @Then("Sees {string} admin saved alert")
    public void seesAdminSavedAlert(String str) {
        Assert.assertTrue(US22_US24Pages.adminSavedAlertUs_22.getText().contains(str));
    }

    @Then("Sees {string} Please enter valid SSN alert")
    public void seesPleaseEnterValidSSNAlert(String str) {
        Assert.assertTrue(US22_US24Pages.ssnValidAlertUs_22.getText().contains(str));
    }

    @And("Seen Teacher saved alert")
    public void seesAlert() {
        Assert.assertTrue(US22_US24Pages.teacherSavedAlertUs_24.isDisplayed());
    }

    @Then("Sees {string} One number alert")
    public void seesOneNumberAlert(String str) {
        Assert.assertTrue(US22_US24Pages.oneNumberNeedAlertUs_24.getText().contains(str));
    }

    @Then("Sees {string} One lowercase character alert")
    public void seesOneLowercaseCharacterAlert(String str) {
        Assert.assertTrue(US22_US24Pages.oneLowercaseNeedAlertUs_24.getText().contains(str));
    }

    @Then("Sees {string} One uppercase character alert")
    public void seesOneUppercaseCharacterAlert(String str) {
        Assert.assertTrue(US22_US24Pages.oneUppercaseNeedAlertUs_24.getText().contains(str));
    }

    @And("Sees Error:Lesson Programs not found alert")
    public void seesErrorLessonProgramsAlert() {
        Assert.assertTrue(US22_US24Pages.errorLessonAlertUs_24.isDisplayed());
    }

    @And("User selects the choosen lessons and enters the {string} and given infos")
    public void userSelectsTheChoosenLessonsAndEntersTheDteOfBirthInfosAndSubmit(String dateOfBirth) {
        US22_US24Pages.selectUs_24.click();
        ReusableMethods.bekle(2);
        US22_US24Pages.basketballUs_24.click();
        ReusableMethods.bekle(2);

        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(),
                Keys.TAB, faker.address().city(), Keys.TAB, faker.internet().emailAddress(),
                Keys.TAB, faker.instance().number().digits(3) + "-" + Faker.instance().number().digits(3)
                + "-" + Faker.instance().number().digits(4), Keys.TAB, Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, dateOfBirth,
                Keys.TAB, faker.idNumber().ssnValid(), Keys.TAB, faker.name().username(), Keys.TAB, faker.internet()
                .password(8,20,true,true,true));

        ReusableMethods.bekle(3);

    }


    @And("User enters required info until the {string}")
    public void userSelectsTheChoosenLessonsAndEntersTheAndGivenInfos(String dateOfBirth) {
        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(),
                Keys.TAB, faker.address().city(), Keys.TAB, faker.internet().emailAddress(),
                Keys.TAB, faker.instance().number().digits(3) + "-" + Faker.instance().number().digits(3) + "-"
                        + Faker.instance().number().digits(4), Keys.TAB, Keys.TAB, Keys.ARROW_DOWN,
                Keys.TAB, dateOfBirth);
        ReusableMethods.bekle(3);
    }

    @And("Enter {int}, {int} and {int} total eight digits with a '-' sign after the third and fifth digits")
    public void enterAndTotalEightDigitsWithASignAfterTheThirdAndFifthDigits(int d1, int d2, int d3) {
        US22_US24Pages.ssnNumberUs_22.sendKeys(Faker.instance().number().digits(d1) + "-"
                + Faker.instance().number().digits(d2) + "-" + Faker.instance().number().digits(d3));
        ReusableMethods.bekle(3);
    }

    @And("User enters the required info with {string} except gender")
    public void userEntersTheRequiredInfoWithExceptGenderAndSubmit(String dateOfBirth) {
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        US22_US24Pages.nameUs_22.sendKeys(faker.name().firstName(), Keys.TAB, faker.name().lastName(),
                Keys.TAB, faker.address().city(), Keys.TAB, Keys.TAB, dateOfBirth, Keys.TAB,
                faker.instance().number().digits(3) + "-" + Faker.instance().number().digits(3) + "-"
                + Faker.instance().number().digits(4),Keys.TAB, Keys.TAB, faker.name().username(),
                Keys.TAB, faker.internet().password(8,20,true,true,true));
        ReusableMethods.bekle(2);

    }

    @Then("see the box of Is Advisor Teacher is able to click.")
    public void seeTheBoxOfIsAdvisorTeacherIsDisableToClick() {
        US22_US24Pages.isAdviserTeacherCheckbox_24.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(US22_US24Pages.isAdviserTeacherCheckbox_24.isSelected());
        ReusableMethods.bekle(2);
        US22_US24Pages.submitUs_24.click();
        ReusableMethods.bekle(1);
    }
}

