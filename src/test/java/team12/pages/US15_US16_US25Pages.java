package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

public class US15_US16_US25Pages {

    public US15_US16_US25Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginLoginButton;

    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement team12ViceDean; // doğrulama

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[text()='Student Management']")
    public WebElement studentManagementYazisi;

    @FindBy(xpath = "//*[text()='Add Student']")
    public WebElement addStudentYazisi; // doğrulama

    @FindBy(xpath = "//*[@class='form-select']")
    public WebElement chooseAdvisorTeacher;

    @FindBy(xpath = "//div//select//option[3]")
    public WebElement chooseAdvisorTeacherOption3;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameUS;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surNameUS;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlaceUS;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailAddressUS;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumberUS;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement maleRadioButton;
    @FindBy(id = "birthDay") //*[@type='date']
    public WebElement dateOfBirthUS;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssnNumberUS;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameUS;

    @FindBy(xpath = "//*[@id='fatherName']")
    public WebElement fatherName;

    @FindBy(xpath = "//*[@id='motherName']")
    public WebElement motherName;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement sifre;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Student saved Successfully']")
    public WebElement StudentSavedSuccesfullYazisi;

    @FindBy(xpath = "//*[text()='Student Number']")
    public WebElement studentNumber; // doğrulama

    @FindBy(xpath = "//*[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")
    public WebElement genderError;

    @FindBy(xpath = "//div[text()='Your name should be at least 2 characters']")
    public WebElement nameError;

    @FindBy(xpath = "//div[text()='Your surname should be at least 2 characters']")
    public WebElement surnameError;

    @FindBy(xpath = "//div[text()='Please enter valid email']")
    public WebElement emailError;

    @FindBy(xpath = "//*[text()='Your email should be between 5 and 50 characters']")
    public WebElement emailError2;

    @FindBy(xpath = "//div[text()='Please enter valid phone number']")
    public WebElement phoneNumberError;

    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement ssnNumberError;

    @FindBy(xpath = "//div[text()='geçmiş bir tarih olmalı']")
    public WebElement dateOfBirthError;

    @FindBy(xpath = "//div[text()='Your birth place should be at least 2 characters']")
    public WebElement birthPlaceError;

    @FindBy(xpath = "//*[text()='Your username should be at least 4 characters']") //*[@id='48']
    public WebElement userNameError;

    @FindBy(xpath = "//div[text()='Your father name should be at least 2 characters']")
    public WebElement fatherNameError;

    @FindBy(xpath = "//div[text()='Your mother name should be at least 2 characters']")
    public WebElement motherNameError;

    @FindBy(xpath = "//*[text()='At least 8 characters']")
    public WebElement atLeast8CharactersError;

    @FindBy(xpath = "//*[text()='One uppercase character']")
    public WebElement oneUpperCaseCharacterError;

    @FindBy(xpath = "//*[text()='One lowercase character']")
    public WebElement oneLowerCaseCharacterError;
    @FindBy(xpath = "//*[text()='One number']")
    public WebElement OneNumberError;

    @FindBy(xpath = "//div[text()='Please select advisor teacher']")
    public WebElement pleaseSelectAdvisorTeacherError;

    @FindBy(xpath = "//*[text()='Contact Get All']")
    public WebElement contactGetAllYazisi;

    @FindBy(xpath = "//*[text()='Contact Message']")
    public WebElement contactMessageYazisi;

    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement nameMessage;

    @FindBy(xpath = "(//tr//td)[2]")
    public WebElement emailMessage;

    @FindBy(xpath = "(//tr//td)[3]")
    public WebElement dateMessage;

    @FindBy(xpath = "(//tr//td)[4]")
    public WebElement subjectMessage;

    @FindBy(xpath = "(//tr//td)[5]")
    public WebElement message;

    @FindBy(xpath = "(//*[text()='Team12Admin'])[1]")
    public WebElement team12AdminYazisi; // doğrulama
}

