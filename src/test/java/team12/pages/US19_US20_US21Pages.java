package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

public class US19_US20_US21Pages {
    public US19_US20_US21Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameArea;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordArea;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement meetManagement;

    @FindBy(xpath = "//*[@class=' css-19bb58m']")
    public WebElement chooseStudentsDropdown;

    @FindBy(xpath = "//*[@id='react-select-3-placeholder']")
    public WebElement editChooseStudents;


    @FindBy(xpath = "//input[@id='date']")
    public WebElement dateOfMeet;

    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement editDate;


    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement editStartTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement editStopTime;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement description;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement editDescription;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmitButton;

    @FindBy(xpath = "//*[.='Meet Saved Successfully']")
    public WebElement alert;

    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[2]")
    public WebElement ileriTarihAlert;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement errorAlert;

    @FindBy(xpath = "//*[.='Meet Updated Successfully']")
    public WebElement updateSuccessAlert;

    @FindBy(xpath = "(//*[.='Error: Course schedule cannot be selected for the same hour and day'])[5]")
    public WebElement sameHourAlert;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement deleteAlert;

    @FindBy(xpath = "(//td)[1]")
    public WebElement meetListDate;

    @FindBy(xpath = "(//td)[2]")
    public WebElement meetListStartTime;

    @FindBy(xpath = "(//td)[3]")
    public WebElement meetListStopTime;

    @FindBy(xpath = "(//td)[4]")
    public WebElement meetListDescription;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement meetListEditButton;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
    public WebElement meetListDeleteButton;

    @FindBy(xpath = "(//td)[3]")
    public WebElement lessonTeacher;

    @FindBy(xpath = "(//td)[4]")
    public WebElement lessonDay;

    @FindBy(xpath = "(//td)[5]")
    public WebElement lessonStartTime;

    @FindBy(xpath = "(//td)[6]")
    public WebElement lessonStopTime;

    @FindBy(xpath = "(//a[@class='nav-link'])[6]")
    public WebElement chooseLesson;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[17]")
    public WebElement dersSecimi1;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[18]")
    public WebElement dersSecimi2;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement chooseLessonSubmitButton;
    @FindBy(xpath = "(//input[@id='lessonProgramId'])[88]")
    public WebElement ayniSaateLesson;

    @FindBy(xpath = "(//a[@role='button'])[7]")
    public WebElement gradesAndAnnouncements;

    @FindBy(xpath = "(//td)[3]")
    public WebElement midtermExam;

    @FindBy(xpath = "(//td)[4]")
    public WebElement finalExam;

    @FindBy(xpath = "(//td)[8]")
    public WebElement meet;
}
