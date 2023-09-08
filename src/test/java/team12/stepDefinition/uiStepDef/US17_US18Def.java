package team12.stepDefinition.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import team12.pages.US17_US18Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

public class US17_US18Def {
    US17_US18Pages us17Us18Pages = new US17_US18Pages();
    WebDriver driver;

    @Given("kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @Then("TEACHER GIRISI YAPAR")
    public void teacherGIRISIYAPAR() {
        us17Us18Pages.login.click();
        ReusableMethods.bekle(3);
        us17Us18Pages.username.sendKeys("kmari", Keys.TAB, "Kmari123", Keys.TAB, Keys.ENTER);
    }

    @When("TEACHER DERS SECER")
    public void teacherDERSSECER() {
        ReusableMethods.ddmVisibleText(us17Us18Pages.chooseLesson, "Selenium");
    }

    @And("TEACHER OGRENCI SECER")
    public void teacherOGRENCISECER() {
        ReusableMethods.ddmVisibleText(us17Us18Pages.chooseStudent, "banker bilo");

    }

    @And("TEACHER DONEM SECER")
    public void teacherDONEMSECER() {
        ReusableMethods.ddmVisibleText(us17Us18Pages.chooseEducationTerm, "FALL_SEMESTER");

    }

    @And("TEACHER DEVAMSIZLIK-MIDTERM EXAM-FINAL EXAM-INFO NOTU GIRER\\(INFO NOTU HARF RAKAM VE OZEL ISARET ICEREBILMELI)")
    public void teacherDEVAMSIZLIKMIDTERMEXAMFINALEXAMINFONOTUGIRERINFONOTUHARFRAKAMVEOZELISARETICEREBILMELI() {
        us17Us18Pages.absentee.sendKeys("5", Keys.TAB, "75", Keys.TAB, "85", Keys.TAB, "iyi1Note@!", Keys.TAB, Keys.ENTER);

    }

    @When("teacher name lessonname ansentee midterm and final exam note info note ve average bilgilerini gorebilir")
    public void teacherNameLessonnameAnsenteeMidtermAndFinalExamNoteInfoNoteVeAverageBilgileriniGorebilir() {
        ReusableMethods.scroll("", us17Us18Pages.pages);
        Assert.assertTrue(us17Us18Pages.chooseLesson.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.absentee.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.midtermExam.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.finalExam.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.header_Note_M.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.infoNote.isDisplayed());
        ReusableMethods.bekle(1);
        Assert.assertTrue(us17Us18Pages.header_Average_M.isDisplayed());
    }


    @And("Edit Student info Midterm Exam inputu {string} olarak guncellenir.")
    public void editStudentInfoMidtermExamInputuOlarakGuncellenir(String string) {
       // RM.waitFor(1);
       // RM.clickElementWithJs(us17Us18Pages.btn_EditFirstOption_M);
        us17Us18Pages.btn_EditFirstOption_M.click();
        us17Us18Pages.input_EditStudentInfoLesson_M.sendKeys("Selenium");
        us17Us18Pages.editStudentEducationTerm.sendKeys("FALL_SEMESTER");
       // RM.sendKeysText(us17Us18Pages.editMidterExam, string);

        String selectAll = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
        us17Us18Pages.editMidterExam.sendKeys(selectAll,"100");
    }

    @And("Edit Student info Final Exam inputu {string} olarak guncellenir.")
    public void editStudentInfoFinalExamInputuOlarakGuncellenir(String string) {
       // RM.sendKeysText(us17Us18Pages.editStudentInfoFinalExam, string);
        String selectAll = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
        us17Us18Pages.editStudentInfoFinalExam.sendKeys(selectAll,"100");

       // RM.clickElementWithJs(us17Us18Pages.editSubmit);
        us17Us18Pages.editSubmit.click();
        ReusableMethods.bekle(3);
    }
    @And("student info list kapatilir")
    public void studentInfoListKapatilir() {
       // RM.clickElementWithJs(us17Us18Pages.close);
        us17Us18Pages.close.click();
    }
    @And("teacher delete butonunun gorunurlugunu kontrol eder")
    public void teacherDeleteButonununGorunurlugunuKontrolEder() {  us17Us18Pages.Delete.isDisplayed();

    }
}