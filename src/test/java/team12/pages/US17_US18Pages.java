package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

public class US17_US18Pages{
    public US17_US18Pages(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath =   "//main[@class='content']")
    public WebElement pages;
    @FindBy(xpath =   "//a[@class='header_link ms-2']")
    public WebElement login;
    @FindBy(xpath =   "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath =   "//select[@id='lessonId']")
    public WebElement chooseLesson;
    @FindBy(xpath =   "//select[@id='studentId']")
    public WebElement chooseStudent;
    @FindBy(xpath =   "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm;
    @FindBy(xpath =   "//input[@id='absentee']")
    public WebElement absentee;
    @FindBy(xpath =   "//input[@id='midtermExam']")
    public WebElement midtermExam;
    @FindBy(xpath =   "//input[@id='finalExam']")
    public WebElement finalExam;
    @FindBy(xpath =   "//input[@id='infoNote']")
    public WebElement infoNote;
    @FindBy (xpath = "//th[.='Note']") public WebElement header_Note_M;
    @FindBy (xpath = "//th[.='Average']") public WebElement header_Average_M;
    @FindBy (css = ".me-4 #lessonId") public WebElement input_EditStudentInfoLesson_M;
    @FindBy (xpath = "(//button[contains(.,'Edit')])[1]") public WebElement btn_EditFirstOption_M;
    @FindBy (css = ".me-4 #educationTermId") public WebElement editStudentEducationTerm;
    @FindBy (css = ".me-4 #midtermExam") public WebElement editMidterExam;
    @FindBy (css = ".me-4 #finalExam") public WebElement editStudentInfoFinalExam;
    @FindBy (xpath = "(//*[text()='Submit'])[2]") public WebElement editSubmit;
    @FindBy(xpath =   "(//button[@class='btn-close'])[3]")
    public WebElement close;
    @FindBy (xpath = "//tbody[1]//tr[1]//i[@class='fa-solid fa-trash']") public WebElement Delete;
}
