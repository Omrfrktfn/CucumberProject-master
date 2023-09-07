package team12.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

import java.util.List;

public class US04_US05Pages {
    public US04_US05Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@id='phoneNumber'])[1]")
    public WebElement addDeanPhoneNumber;

    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editDeanPhoneNumber;

    @FindBy(xpath = "(//input[@id='ssn'])[1]" )
    public WebElement addDeanSSN;

    @FindBy(xpath = "(//input[@id='ssn'])[2]" )
    public WebElement editDeanSSN;

    @FindBy(xpath = "(//input[@id='username'])[1]" )
    public WebElement addDeanUsername;

    @FindBy(xpath = "(//input[@id='username'])[2]" )
    public WebElement editDeanUsername;

    @FindBy(xpath="(//input[@id='password'])[1]")
    public WebElement addDeanPassword;

    //(//input[@id='password'])[2]
    @FindBy(xpath="(//input[@id='password'])[2]")
    public WebElement editDeanPassword;

    @FindBy(xpath = "(//input[@id='birthPlace'])[1]")
    public WebElement addDeanBirthPlace;

    @FindBy(xpath = "(//input[@id='birthPlace'])[2]")
    public WebElement editDeanBirthPlace;

    @FindBy(xpath = "//*[text()='Dean updated Successful']")
    public WebElement deanUpdatedText;

    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement pageLink;




    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement adminMenu;

    @FindBy(xpath = "//*[text()='Dean Management']")
    public WebElement deanManagement;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> deanNameList;

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> genderList;

    @FindBy(xpath = "//tbody//td[3]")
    public List<WebElement> phoneNumberList;

    @FindBy(xpath = "//tbody//td[4]")
    public List<WebElement> ssnList;

    @FindBy(xpath = "//tbody//td[5]")
    public List<WebElement> userNameList;

    @FindBy(xpath = "(//*[contains(@class,'text-dark')])[20]")
    public WebElement editButton;

    @FindBy(xpath = "(//*[text()='Submit'])[1]")
    public WebElement addSubmitButton;

    @FindBy(xpath = "(//*[text()='Submit'])[2]")
    public WebElement editSubmitButton;

    @FindBy(xpath = "(//input[@id='name'])[1]")
    public WebElement addDeanName;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editDeanName;

    @FindBy(xpath = "(//input[@id='surname'])[1]")
    public WebElement addDeanSurname;

    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement editDeanSurname;

    @FindBy(xpath = "(//input[@value='FEMALE'])[1]")
    public WebElement addDeanGenderFemale;

    @FindBy(xpath = "(//input[@value='FEMALE'])[2]")
    public WebElement editDeanGenderFemale;

    @FindBy(xpath = "(//input[@value='MALE'])[1]")
    public WebElement addDeanGenderMale;

    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement editDeanGenderMale;

    @FindBy(xpath = "(//input[@id='birthDay'])[1]")
    public WebElement addDeanBirthday;

    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement editDeanBirthday;

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement passwordAlert;

    @FindBy(xpath = "//*[text()='Dean Saved']")
    public WebElement deanSavedText;

    @FindBy(xpath = "//*[text()='Please enter valid SSN number']")
    public WebElement invalidSsnText;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButton2;

    @FindBy(xpath = "(//i)[4]")
    public WebElement us05EditButton;


}
