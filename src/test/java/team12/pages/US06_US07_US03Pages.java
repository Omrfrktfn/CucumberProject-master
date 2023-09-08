package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;


public class US06_US07_US03Pages {

    public US06_US07_US03Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //US_06
    @FindBy(xpath = "//a[@href='/login']")
    public static WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public static WebElement loginButton;

    @FindBy(xpath = "//h5[text()='Add Vice Dean']")
    public static WebElement addViceDeanYazisi;

    @FindBy(xpath = "//input[@id='name']")
    public static WebElement nameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public static WebElement nameRequired;

    @FindBy(xpath = "//input[@id='surname']")
    public static WebElement surnameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public static WebElement surnameRequired;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public static WebElement birthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public static WebElement birthPlaceRequired;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public static WebElement femaleRadio;

    @FindBy(xpath = "//input[@value='MALE']")
    public static WebElement maleRadio;

    @FindBy(xpath = "//input[@id='birthDay']")
    public static WebElement birthDay;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public static WebElement birthDayRequired;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public static WebElement phoneNumberBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public static WebElement phoneNumberRequired;

    @FindBy(xpath = "//input[@id='ssn']")
    public static WebElement ssnBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public static WebElement ssnRequired;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public static WebElement usernameRequired;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public static WebElement passwordRequired;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public static WebElement submitAddViceDean;

    @FindBy(xpath = "(//a[@href='#'])[11]")
    public static WebElement listeyiIlerletmeOklari;

    @FindBy(xpath = "//tr//td//span[text()='Cucumberui1']")
    public static WebElement sonSatir;//bunun locatini yazdgin name üzerinden al

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public static WebElement ssnkaraktermesaji;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public static WebElement passwordbuyukharfyok;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public static WebElement passwordkucukharfyok;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public static WebElement phonenumberhatasi;





    //US07
    @FindBy(xpath = "//button[text()='Menu']")
    public static WebElement menuButonu;

    @FindBy(xpath = "(//a[@href='#'])[24]")
    public static WebElement contactGetAll;

    @FindBy(xpath = "//h5[text()='Contact Message']")
    public static WebElement contactMessageYazisi;

    @FindBy(xpath = "//tr//td//span[text()='Can I ask a question?']")
    public static WebElement enUsttekiMesaj;

    @FindBy(xpath = "//tr//td//span[text()='john@stark.com']")
    public static WebElement enUsttekiMesajEmail;

    @FindBy(xpath = "//tr//td//span[text()='2023-09-07']")
    public static WebElement enUsttekiMesajDate;

    @FindBy(xpath = "//tr//td//span[text()='Hello!']")
    public static WebElement enUsttekiMesajSubject;

    @FindBy(xpath = "//tr//td//span[text()='Snow']")
    public static WebElement enUsttekiMesajName;

    @FindBy(xpath = "//thead//tr")
    public static WebElement silinmedi;



    //US23-->US07 ile locateler ayni
    @FindBy(xpath = "(//a[@href='#'])[25]")
    public static WebElement viceDeanManagement;

    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public static WebElement adminvckayit;//önce bildirime click yap, ondan sonra assert yap, bildirim süresi kisa

    @FindBy(xpath = "//h3[text()='Admin Management']")
    public static WebElement adminManagement;


}