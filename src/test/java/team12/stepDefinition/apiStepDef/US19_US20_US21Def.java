package team12.stepDefinition.apiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import team12.pages.US19_US20_US21Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertTrue;

public class US19_US20_US21Def {
    US19_US20_US21Pages projectPage = new US19_US20_US21Pages();
    LocalDate currentDate;
    DateTimeFormatter desiredFormat;
    String formattedDate;
    Actions actions;
    @Given("kullanici managementonschool sayfasina gider")
    public void kullanici_managementonschool_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.bekle(2);
    }
    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        projectPage.login.click();
        ReusableMethods.bekle(2);
    }
    @Then("kullanici username alanına username girer")
    public void kullanici_username_alanına_username_girer() {
        projectPage.usernameArea.sendKeys("TeacherTeam12");
        ReusableMethods.bekle(2);

    }
    @Then("kullanici password alanina password girer")
    public void kullanici_password_alanina_password_girer() {
        projectPage.passwordArea.sendKeys("TeacherTeam12");
        ReusableMethods.bekle(2);
    }
    @Then("kullanici login'e tiklar")
    public void kullanici_login_e_tiklar() {
        projectPage.loginButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("kullanici menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        projectPage.menu.click();
        ReusableMethods.bekle(2);
    }
    @Then("kullanici Meet management butonuna tiklar")
    public void kullanici_meet_management_butonuna_tiklar() {
        projectPage.meetManagement.click();
        ReusableMethods.bekle(2);
    }
    @Then("kullanici choose student dropdown'undan ogrenci secer")
    public void kullanici_choose_student_dropdown_undan_ogrenci_secer() {
        actions = new Actions(Driver.getDriver());
        actions.moveByOffset(300, 450).click().build().perform();
        ReusableMethods.visibleWait(projectPage.chooseStudentsDropdown, 2);
        actions.keyDown(Keys.ARROW_DOWN).sendKeys("Team12 Students", Keys.ENTER).perform();
    }
    @Then("kullanici Date of Meet bolumunden ileri bir tarih secer")
    public void kullanici_date_of_meet_bolumunden_ileri_bir_tarih_secer() {
        projectPage.dateOfMeet.clear();
        projectPage.dateOfMeet.sendKeys("23.10.2023");
        ReusableMethods.bekle(2);
    }
    @Then("kullanici start time secer")
    public void kullanici_start_time_secer() {
        projectPage.startTime.clear();
        projectPage.startTime.sendKeys("22:00");
        ReusableMethods.bekle(2);
    }
    @Then("kullanici stop time secer")
    public void kullanici_stop_time_secer() {
        projectPage.stopTime.clear();
        projectPage.stopTime.sendKeys("23:00");
        ReusableMethods.bekle(2);
    }
    @Then("kullanici description girer")
    public void kullanici_description_girer() {
        projectPage.description.clear();
        projectPage.description.sendKeys("Bütler");
        ReusableMethods.bekle(2);
    }
    @Then("kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        projectPage.submitButton.click();
        ReusableMethods.bekle(2);
    }
    @Then("kullanici Meet Saved Successfully mesajinin alindiğini dogrular")
    public void kullanici_meet_saved_successfully_mesajinin_alindiğini_dogrular() {
        assertTrue(projectPage.alert.getText().contains("Successfully"));
        ReusableMethods.bekle(3);
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("kullanici Date of Meet bolumunden icinde oldugumuz tarihi secer")
    public void kullaniciDateOfMeetBolumundenIcindeOldugumuzTarihiSecer() {
        currentDate = LocalDate.now();
        desiredFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formattedDate = currentDate.format(desiredFormat);

        projectPage.dateOfMeet.sendKeys(formattedDate);
    }

    @And("kullanici ileri saat seciminde Meet Saved Successfully mesajinin alindiğini dogrular")
    public void kullaniciIleriSaatSecimindeMeetSavedSuccessfullyMesajininAlindiğiniDogrular() {
        Assert.assertFalse(projectPage.ileriTarihAlert.getText().contains("Successfully"));
        ReusableMethods.bekle(3);
    }

    @And("kullanici Date of Meet bolumunden gecmis bir tarih secer")
    public void kullaniciDateOfMeetBolumundenGecmisBirTarihSecer() {
        currentDate = LocalDate.now();
        LocalDate dayBefore = currentDate.minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dayBeforeString = dayBefore.format(formatter);
        projectPage.dateOfMeet.sendKeys(dayBeforeString);
    }

    @And("kullanici Ileri bir tarih olmali mesajinin alindigini dogrular")
    public void kullaniciIleriBirTarihOlmaliMesajininAlindiginiDogrular() {
        assertTrue(projectPage.ileriTarihAlert.getText().contains("ileri bir tarih olmalı"));
    }

    @And("kullanici Date of Meet bolumune meet listte var olan bir tarih secer")
    public void kullaniciDateOfMeetBolumuneMeetListteVarOlanBirTarihSecer() {
        projectPage.dateOfMeet.sendKeys("23.10.2023");
    }

    @And("kullanici Error: Meet schedule cannot be selected for the same hour and day mesajinin alindigini dogrular")
    public void kullaniciErrorMeetScheduleCannotBeSelectedForTheSameHourAndDayMesajininAlindiginiDogrular() {
        assertTrue(projectPage.errorAlert.getText().contains("Error: Meet schedule cannot be selected for the same hour and day"));
    }

    @And("kullanici date bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciDateBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.meetListDate.isDisplayed());
    }


    @Then("kullanici start time bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciStartTimeBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.meetListStartTime.isDisplayed());
    }

    @Then("kullanici stop time bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciStopTimeBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.meetListStopTime.isDisplayed());
    }

    @And("kullanici description bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciDescriptionBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.meetListDescription.isDisplayed());
    }

    @Then("kullanici edit butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciEditButonununTiklanabilirOldugunuDogrular() {
        assertTrue(projectPage.meetListEditButton.isEnabled());
    }

    @And("kullanici delete butonunun tiklanabilir oldugunu dogrular")
    public void kullaniciDeleteButonununTiklanabilirOldugunuDogrular() {
        assertTrue(projectPage.meetListDeleteButton.isEnabled());
    }

    @And("kullanici edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        projectPage.meetListEditButton.click();
    }

    @Then("kullanici edit bolumunden date tarihini ileri bir tarihle degistirir")
    public void kullaniciEditBolumundenDateTarihiniIleriBirTarihleDegistirir() {
        projectPage.dateOfMeet.clear();
        projectPage.dateOfMeet.sendKeys("24.10.2023");
    }

    @Then("kullanici edit bolumunden description bolumunu degistirir")
    public void kullaniciEditBolumundenDescriptionBolumunuDegistirir() {
        projectPage.editDescription.clear();
        projectPage.editDescription.sendKeys("US20-TC02");
        ReusableMethods.bekle(2);
    }

    @And("kullanici edit bolumunden submit butonuna tiklar")
    public void kullaniciEditBolumundenSubmitButonunaTiklar() {
        projectPage.editSubmitButton.click();
    }

    @Then("kullanici Meet Updated Successfully mesaji alindigini dogrular")
    public void kullaniciMeetUpdatedSuccessfullyMesajiAlindiginiDogrular() {
        Assert.assertTrue(projectPage.updateSuccessAlert.isDisplayed());
    }

    @Then("kullanici edit bolumunden start time degistirir")
    public void kullaniciEditBolumundenStartTimeDegistirir() {
        projectPage.startTime.sendKeys("23:10");
    }

    @Then("kullanici edit bolumunden stop time degistirir")
    public void kullaniciEditBolumundenStopTimeDegistirir() {
        projectPage.stopTime.sendKeys("23:50");
    }

    @Then("kullanici saat guncellemesinden Meet Updated Successfully mesaji alindigini dogrular")
    public void kullaniciSaatGuncellemesindenMeetUpdatedSuccessfullyMesajiAlindiginiDogrular() {
        Assert.assertFalse(projectPage.errorAlert.getText().contains("Updated Successfully"));
    }

    @And("kullanici delete butonuna tiklar")
    public void kullaniciDeleteButonunaTiklar() {
        projectPage.meetListDeleteButton.click();
    }

    @Then("kullanici Meet deleted successfully mesaji alindigini dogrular")
    public void kullaniciMeetDeletedSuccessfullyMesajiAlindiginiDogrular() {
        Assert.assertTrue(projectPage.deleteAlert.isDisplayed());
    }

    @And("kullanici student username alanına username girer")
    public void kullaniciStudentUsernameAlanınaUsernameGirer() {
        projectPage.usernameArea.sendKeys("StudentTeam12");
    }

    @And("kullanici student password alanina password girer")
    public void kullaniciStudentPasswordAlaninaPasswordGirer() {
        projectPage.passwordArea.sendKeys("StudentTeam12");
    }

    @And("kullanici Choose lesson bolumunden teacher bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciChooseLessonBolumundenTeacherBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.lessonTeacher.isDisplayed());
    }

    @Then("kullanici Choose lesson bolumunden day bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciChooseLessonBolumundenDayBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.lessonDay.isDisplayed());
    }

    @Then("kullanici Choose lesson bolumunden start time bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciChooseLessonBolumundenStartTimeBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.lessonStartTime.isDisplayed());
    }

    @And("kullanici Choose lesson bolumunden stop time bolumunun gorulebilir oldugunu dogrular")
    public void kullaniciChooseLessonBolumundenStopTimeBolumununGorulebilirOldugunuDogrular() {
        assertTrue(projectPage.lessonStopTime.isDisplayed());
    }

    @And("kullanici ders secer")
    public void kullaniciDersSecer() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",projectPage.dersSecimi1);
    }

    @And("kullanici choose lesson bolumunden submite tiklar")
    public void kullaniciChooseLessonBolumundenSubmiteTiklar() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",projectPage.chooseLessonSubmitButton);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici Lesson added to Student mesaji alindigini dogrular")
    public void kullaniciLessonAddedToStudentMesajiAlindiginiDogrular() {
        Assert.assertTrue(projectPage.errorAlert.isDisplayed());
    }

    @And("kullanici iki ders secer")
    public void kullaniciIkiDersSecer() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",projectPage.dersSecimi1);
        js.executeScript("arguments[0].click();",projectPage.dersSecimi2);
    }

    @Then("kullanici iki ders seciminden Lesson added to Student mesaji alindigini dogrular")
    public void kullaniciIkiDersSecimindenLessonAddedToStudentMesajiAlindiginiDogrular() {
        Assert.assertTrue(projectPage.errorAlert.isDisplayed());
    }

    @And("kullanici ders programinda ekli olan, ayni gun ve saate denk gelen baska bir ders secer")
    public void kullaniciDersProgramindaEkliOlanAyniGunVeSaateDenkGelenBaskaBirDersSecer() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",projectPage.ayniSaateLesson);
    }

    @Then("kullanici Error: Course schedule cannot be selected for the same hour and day mesaji alindigini dogrular")
    public void kullaniciErrorCourseScheduleCannotBeSelectedForTheSameHourAndDayMesajiAlindiginiDogrular() {
        Assert.assertTrue(projectPage.sameHourAlert.isDisplayed());
    }

    @And("kullanici Grades and Announcements butonuna tiklar")
    public void kullaniciGradesAndAnnouncementsButonunaTiklar() {
        projectPage.gradesAndAnnouncements.click();
    }

    @Then("kullanici Student Info List bolumunden notlarinin gorundugunu dogrular")
    public void kullaniciStudentInfoListBolumundenNotlarininGorundugunuDogrular() {
        Assert.assertTrue(projectPage.midtermExam.isDisplayed());
        Assert.assertTrue(projectPage.finalExam.isDisplayed());
    }

    @Then("kullanici Meet List bolumunden toplantilarinin gorundugunu dogrular")
    public void kullaniciMeetListBolumundenToplantilarininGorundugunuDogrular() {
        Assert.assertTrue(projectPage.meet.isDisplayed());
    }
}
