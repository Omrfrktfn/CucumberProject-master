package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;

public class US10_US11_US12Pages {
    public US10_US11_US12Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement getLoginButton;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgramme;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooseLessons;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement cooseLesson2;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement submitLessonButton;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[3]//tr[15]")
    public WebElement locateOfLessonInWebTable;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[4]//tr[67]")
    public WebElement lessonOnAssignmentList;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[67]")
    public WebElement lessonCheckBox;

    @FindBy(xpath = "//select[@id='teacherId']")
    public WebElement chooseTeacherDdm;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[4]")
    public WebElement chooseTeacherSubmitButton;

    @FindBy(xpath = "//div[text()='Lesson added to Teacher']")
    public WebElement lessonAddedToTeacherMessage;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[4]")
    public WebElement lessonProgramAssignmentWebTable;

}
