package team12.stepDefinition.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team12.pages.US10_US11_US12Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.util.List;

public class US10_US11_US12Def {
    US10_US11_US12Pages us10Us11Us12Pages=new US10_US11_US12Pages();

    @Given("user goes to homepage of the site")
    public void userGoesToHomepageOfTheSite() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.bekle(2);
        us10Us11Us12Pages.loginButton.click();
        ReusableMethods.bekle(1);

    }

    @Then("user logs in as vice dean")
    public void userLogsInAsViceDean() {
        us10Us11Us12Pages.username.sendKeys(ConfigReader.getProperty("viceDeanName"));
        ReusableMethods.bekle(1);
        us10Us11Us12Pages.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
        ReusableMethods.bekle(1);
        us10Us11Us12Pages.getLoginButton.click();

    }

    @Then("user clicks on lesson program")
    public void userClicksOnLessonProgram() {

        us10Us11Us12Pages.lessonProgramme.click();
    }

    @And("user chooses a lesson from ddm")
    public void userChoosesALessonFromDdm() {
        us10Us11Us12Pages.chooseLessons.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_UP,Keys.ENTER).perform();
        ReusableMethods.bekle(2);


    }

    @And("user chooses an education term from ddm")
    public void userChoosesAnEducationTermFromDdm() {
        WebElement educationTermDdm=us10Us11Us12Pages.chooseEducationTerm;
        Select select=new Select(educationTermDdm);
        select.selectByIndex(1);
        ReusableMethods.bekle(2);


    }

    @And("user chooses a day from the drop down menu")
    public void userChoosesADayFromTheDropDownMenu() {
        WebElement dayDdm=us10Us11Us12Pages.chooseDay;
        Select select=new Select(dayDdm);
        select.selectByVisibleText("MONDAY");
        ReusableMethods.bekle(2);


    }

    @Then("user chooses start and stop time")
    public void userChoosesStartAndStopTime() {
        us10Us11Us12Pages.startTime.sendKeys("1230");
        ReusableMethods.bekle(1);
        us10Us11Us12Pages.stopTime.sendKeys("1330");
        ReusableMethods.bekle(1);

    }

    @And("user waits for {int} seconds")
    public void userWaitsForSeconds(int number) {
        try {
            Thread.sleep(number*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("user clicks on submit button to create the lesson")
    public void userClicksOnSubmitButtonToCreateTheLesson() {
        //us10Us11Us12Pages.submitLessonButton.click();

    }

    @Then("user checks if the created lesson is in the lesson program list")
    public void userChecksIfTheCreatedLessonIsInTheLessonProgramList() {
        /*
        Hucre hucre butun data yi yazdirmak istersem kullanirim, ama su an ihtiyac yok
        WebElement table=Driver.getDriver().findElement(By.xpath("(//table[@class='table table-striped table-bordered table-hover'])[3]"));
        List<WebElement> rows=table.findElements(By.xpath(".//tr"));
        for(WebElement row:rows){
            List<WebElement> cells=row.findElements(By.xpath(".//td"));
            for (WebElement cell:cells){
                System.out.println(cell.getText());
            }
        }
        */

        /*
        WebElement table=Driver.getDriver().findElement(By.xpath("(//table[@class='table table-striped table-bordered table-hover'])[3]"));
        List<WebElement> rows=table.findElements(By.xpath(".//tr"));
        for(WebElement row:rows) {
            System.out.println(row.getText());
            Assert.assertTrue(row.getText().contains("English FRIDAY 14:30:00 15:00:00"));
        }
        */
        Actions actions=new Actions(Driver.getDriver());
        actions.scrollByAmount(0,1000).perform();
        System.out.println(us10Us11Us12Pages.locateOfLessonInWebTable.getText());
        Assert.assertTrue(us10Us11Us12Pages.locateOfLessonInWebTable.getText().equals("English MONDAY 12:30:00 13:30:00"));


    }

    @Then("user goes to lesson program assignment list and check if the creates lesson is listed")
    public void userGoesToLessonProgramAssignmentListAndCheckIfTheCreatesLessonIsListed() {
        Actions actions=new Actions(Driver.getDriver());
        actions.scrollByAmount(0,3000).perform();
        WebElement table=Driver.getDriver().findElement(By.xpath("(//table[@class='table table-striped table-bordered table-hover'])[4]"));
        List<WebElement> rows=table.findElements(By.xpath(".//tr"));
        for(WebElement row:rows) {
            if(row.getText().contains("English FRIDAY 14:30:00 15:00:00")){
                System.out.println("True");
            }
        }
        //System.out.println(us10Us11Us12Pages.lessonOnAssignmentList.getText());
        //Assert.assertTrue(us10Us11Us12Pages.lessonOnAssignmentList.getText().equals("English WEDNESDAY 20:00:00 21:00:00"));
    }

    @And("user clicks on the lesson on the assignment list")
    public void userClicksOnTheLessonOnTheAssignmentList() {
        us10Us11Us12Pages.lessonCheckBox.click();

    }

    @Then("user scrolls down the page and click to choose the teacher from choose the teacher section")
    public void userScrollsDownThePageAndClickToChooseTheTeacherFromChooseTheTeacherSection() {
        Actions actions=new Actions(Driver.getDriver());
        actions.scrollByAmount(0,5000).perform();
        WebElement teacherDdm=us10Us11Us12Pages.chooseTeacherDdm;
        Select select=new Select(teacherDdm);
        select.selectByVisibleText("Ted Baker");
        ReusableMethods.bekle(2);
        
    }


    @And("user clicks on submit button and Lesson Added to Teacher message appears at the top of the page")
    public void userClicksOnSubmitButtonAndLessonAddedToTeacherMessageAppearsAtTheTopOfThePage() {
        us10Us11Us12Pages.chooseTeacherSubmitButton.click();
        ReusableMethods.visibleWait(us10Us11Us12Pages.lessonAddedToTeacherMessage,3);
        Assert.assertTrue(us10Us11Us12Pages.lessonAddedToTeacherMessage.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @And("user closes the driver")
    public void userClosesTheDriver() {

        //Driver.closeDriver();
    }
}

