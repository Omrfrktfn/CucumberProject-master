package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

public class US22_US24Pages {

    public US22_US24Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement logInUs_22;

    @FindBy(xpath = "//*[@placeholder='username']")
    public WebElement userNameUs_22;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement dateOfBirthUs_22;

    @FindBy(xpath = "(//h5)[1]")
    public WebElement addAdminHeaderUs_22;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameUs_22;

    @FindBy(xpath = "//*[text()='Admin Saved']")
    public WebElement adminSavedAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement nameAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[2]")
    public WebElement surnameAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[3]")
    public WebElement birthPlaceAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[4]")
    public WebElement dateOfBirthAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[5]")
    public WebElement phoneAlertUs_22;

    @FindBy(xpath = "//*[text()='Required']")
    public WebElement ssnAlertUs_22;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnAlertMinUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[7]")
    public WebElement userNameAlertUs_22;

    @FindBy(xpath = "//*[text()='Enter your password']")
    public WebElement passwordAlertUs_22;

    @FindBy(xpath = "(//*[text()='Required'])[4]")
    public WebElement emailAlertUs_24;

    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnMinAlertUs_22;

    @FindBy(xpath = "//*[@placeholder='ssn']")
    public WebElement ssnNumberUs_22;

    @FindBy(xpath = "//*[text()='Please enter valid SSN number']")
    public WebElement ssnValidAlertUs_22;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement femaleGenderUs_22;

    @FindBy(xpath = "(//*[@type='radio'])[2]")
    public WebElement maleGenderUs_22;

//*******************************************

    @FindBy(xpath = "(//button)[1]")
    public WebElement menuUs_24;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement isAdviserTeacherCheckbox_24;
    @FindBy(xpath = "//*[@class='text-white ']")
    public WebElement hiUs_24;

    @FindBy(xpath = "//*[text()='Team12Admin']")
    public WebElement Team12AdminUs_24;

    @FindBy(xpath = "(//*[text()='Teacher Management'])[2]")
    public WebElement teacherManagementUs_24;

    @FindBy(xpath = "(//h5)[1]")
    public WebElement addTeacherUs_24;

    @FindBy(xpath = "//*[text()='Select lesson']")
    public WebElement selectLessonUs_24;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitUs_24;

    @FindBy(xpath = "//*[text()='Teacher saved successfully']")
    public WebElement teacherSavedAlertUs_24;

    @FindBy(xpath = "//*[text()='One number']")
    public WebElement oneNumberNeedAlertUs_24;

    @FindBy(xpath = "//*[text()='One uppercase character']")
    public WebElement oneUppercaseNeedAlertUs_24;

    @FindBy(xpath = "//*[text()='One lowercase character']")
    public WebElement oneLowercaseNeedAlertUs_24;

    @FindBy(xpath = "//*[text()='Error:Lesson Programs not found']")
    public WebElement errorLessonAlertUs_24;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordUs_24;

    @FindBy(xpath = "(//*[@class='justify-content-start flex-grow-1 fs-5 ps-3 navbar-nav'])[2]")
    public WebElement mainMenuListUs_24;

    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement selectUs_24;

    @FindBy(xpath = "//*[text()='Basketbol']")
    public WebElement basketballUs_24;
}
