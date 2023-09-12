package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import static team12.utilities.ReusableMethods.clickElementByJS;

import org.openqa.selenium.Keys;

import team12.pages.US15_US16_US25Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

public class US15_US16_US25Def {

    Faker faker = new Faker();
    private static String fakeName;
    private static String fakeSurname;
    private static String fakeEmailAddress;
    private static String fakeBirthPlace;
    private static String fakePhoneNumber;
    private static String fakeDateOfBirth;
    private static String fakeSsnNumber;
    private static String fakeUserName;
    private static String fakeFatherName;
    private static String fakeMotherName;
    private static String fakePassword;


    US15_US16_US25Pages okulPage = new US15_US16_US25Pages();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("vice dean olarak login islemini yapar")
    public void viceDeanOlarakLoginIsleminiYapar() {
        ReusableMethods.click(okulPage.loginButton);
        okulPage.loginUserName.sendKeys(ConfigReader.getProperty("viceDeanName"),
        Keys.TAB, ConfigReader.getProperty("viceDeanPassword"));
        okulPage.loginLoginButton.click();
    }

    @And("vice dean sayfasinin goruntulendigini dogrular")
    public void viceDeanSayfasininGoruntulendiginiDogrular() {
        assertTrue(okulPage.team12ViceDean.isDisplayed());
    }

    @And("cikan ekranda Menu butonuna tiklar")
    public void cikanEkrandaMenuButonunaTiklar() {
        ReusableMethods.click(okulPage.menuButton);
    }

    @And("acilan menude Student Management kismini secer")
    public void acilanMenudeStudentManagementKisminiSecer() {
        ReusableMethods.click(okulPage.studentManagementYazisi);
    }

    @And("Add Student sayfasinin acildigini dogrular")
    public void addStudentSayfasininAcildiginiDogrular() {
        assertTrue(okulPage.addStudentYazisi.isDisplayed());
    }

    @And("acilan Add Student sayfasinda Choose Advisor Teacher secer")
    public void acilanAddStudentSayfasindaChooseAdvisorTeacherSecer() {
        okulPage.chooseAdvisorTeacher.click();
        okulPage.chooseAdvisorTeacherOption3.click();
    }

    @And("Name alanina {string} girer")
    public void nameAlaninaGirer(String name) {
        fakeName = faker.name().firstName();
        okulPage.nameUS.sendKeys(fakeName);
    }

    @And("Surname alanina {string} girer")
    public void surnameAlaninaGirer(String surname) {
        fakeSurname = faker.name().lastName();
        okulPage.surNameUS.sendKeys(fakeSurname);
    }

    @And("Birth Place alanina {string} girer")
    public void birthPlaceAlaninaGirer(String birth_place) {
        fakeBirthPlace = faker.country().capital();
        okulPage.birthPlaceUS.sendKeys(fakeBirthPlace);
    }

    @And("E-mail alanina {string} girer")
    public void eMailAlaninaGirer(String email_address) {
        fakeEmailAddress = faker.internet().emailAddress();
        okulPage.emailAddressUS.sendKeys(fakeEmailAddress);
    }

    @And("Phone alanina {string} girer")
    public void phoneAlaninaGirer(String phone_number) {
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        okulPage.phoneNumberUS.sendKeys(fakePhoneNumber);
    }


    @And("Cinsiyet {string} secer")
    public void cinsiyetSecer(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            clickElementByJS(okulPage.maleRadioButton);
        } else {
            clickElementByJS(okulPage.femaleRadioButton);
        }

        ReusableMethods.scrollHome();
    }

    @And("Dogum tarihi alanina {string} girer")
    public void dogumTarihiAlaninaGirer(String birth_day) {
        //fakeDateOfBirth = faker.date().toString();
        okulPage.dateOfBirthUS.sendKeys("01.01.1990");
    }

    @And("SSN alanina {string} girer")
    public void ssnAlaninaGirer(String ssn) {
        fakeSsnNumber = faker.idNumber().ssnValid();
        okulPage.ssnNumberUS.sendKeys(fakeSsnNumber);
    }

    @And("User Name alanina {string} girer")
    public void userNameAlaninaGirer(String username) {
        fakeUserName = faker.name().username();
        okulPage.userNameUS.sendKeys(fakeUserName);
    }

    @And("Father Name alanina {string} girer")
    public void fatherNameAlaninaGirer(String father_Name) {
        fakeFatherName = faker.name().firstName();
        okulPage.fatherName.sendKeys(fakeFatherName);
    }

    @And("Mother Name alanina {string} girer")
    public void motherNameAlaninaGirer(String mother_Name) {
        fakeMotherName = faker.name().firstName();
        okulPage.motherName.sendKeys(fakeMotherName);
    }

    @And("Password alanina password girer")
    public void passwordAlaninaPasswordGirer() {
        fakePassword = faker.internet().password(8,20,true,true,true);
        okulPage.sifre.sendKeys(fakePassword);
    }

     @And("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
        ReusableMethods.click(okulPage.submitButton);
    }

    @And("“Student saved succesfull” yazisini goruntuler")
    public void studentSavedSuccesfullYazisiniGoruntuler() {
        assertTrue(okulPage.StudentSavedSuccesfullYazisi.isDisplayed());
    }

    @And("Basarili bir sekilde kaydoldugunu dogrular")
    public void basariliBirSekildeKaydoldugunuDogrular() {
        assertTrue(okulPage.StudentSavedSuccesfullYazisi.isDisplayed());
    }

    @And("Student number’in otomatik olarak Student List bolumune geldigini dogrular")
    public void studentNumberInOtomatikOlarakStudentListBolumuneGeldiginiDogrular() {
        assertTrue(okulPage.studentNumber.isDisplayed());
    }

    @And("acilan Add Student sayfasinda Choose Advisor Teacher secmeden devam eder")
    public void acilanAddStudentSayfasindaChooseAdvisorTeacherSecmedenDevamEder() {
    }

    @And("“Please select advisor teacher” yazili hata mesajini alir")
    public void pleaseSelectAdvisorTeacherYaziliHataMesajiniAlir() {
        okulPage.pleaseSelectAdvisorTeacherError.isDisplayed();
    }

    @And("Cinsiyet secmeden devam eder")
    public void cinsiyetSecmedenDevamEder() {
    }

    @And("“Your name should be at least {int} characters” yazili hata mesajini alir")
    public void yourNameShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.nameError.isDisplayed();
    }

    @And("“Your surname should be at least {int} characters” yazili hata mesajini alir")
    public void yourSurnameShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.surnameError.isDisplayed();
    }

    @And("“Your birth place should be at least {int} characters” yazili hata mesajini alir")
    public void yourBirthPlaceShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.birthPlaceError.isDisplayed();
    }

    @And("“Please enter valid email” yazili hata mesajini alir")
    public void pleaseEnterValidEmailYaziliHataMesajiniAlir() {
        okulPage.emailError.isDisplayed();
    }

    @And("“Please enter valid phone number” yazili hata mesajini alir")
    public void pleaseEnterValidPhoneNumberYaziliHataMesajiniAlir() {
        okulPage.phoneNumberError.isDisplayed();
    }

    @And("“Gecmis bir tarih olmali” yazili hata mesajini alir")
    public void gecmisBirTarihOlmaliYaziliHataMesajiniAlir() {
        okulPage.dateOfBirthError.isDisplayed();
    }

    @And("“Please enter valid SSN number” yazili hata mesajini alir")
    public void pleaseEnterValidSSNNumberYaziliHataMesajiniAlir() {
        okulPage.ssnNumberError.isDisplayed();
    }

    @And("“Your user name should be at least {int} characters” yazili hata mesajini alir")
    public void yourUserNameShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.userNameError.isDisplayed();
    }

    @And("“Your father name should be at least {int} characters” yazili hata mesajini alir")
    public void yourFatherNameShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.fatherNameError.isDisplayed();
    }

    @And("“Your mother name should be at least {int} characters” yazili hata mesajini alir")
    public void yourMotherNameShouldBeAtLeastCharactersYaziliHataMesajiniAlir(int arg0) {
        okulPage.motherNameError.isDisplayed();
    }

    @And("“You have entered an invalid value. Valid values are: MALE, FEMALE” yazili hata mesajini alir")
    public void youHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEYaziliHataMesajiniAlir() {
        ReusableMethods.waitForVisibility(okulPage.genderError, 15);
        okulPage.genderError.isDisplayed();
    }

    @And("sifreyi kucuk harflerle ve rakamlarla girer")
    public void sifreyiKucukHarflerleVeRakamlarlaGirer() {
        okulPage.sifre.sendKeys("alican01");
    }

    @And("“One Upper Case Character\" yazisinin gorundugunu dogrular")
    public void oneUpperCaseCharacterYazisininGorundugunuDogrular() {
        assertTrue(okulPage.oneUpperCaseCharacterError.isDisplayed());
    }

    @And("sifreyi buyuk harflerle ve rakamlarla girer")
    public void sifreyiBuyukHarflerleVeRakamlarlaGirer() {
        okulPage.sifre.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys(Keys.CONTROL, "x");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys("ALICAN01");
        ReusableMethods.bekle(2);
    }

    @And("“One Lower Case Character\" yazisinin gorundugunu dogrular")
    public void oneLowerCaseCharacterYazisininGorundugunuDogrular()  {
        assertTrue(okulPage.oneLowerCaseCharacterError.isDisplayed());
    }

    @And("sifreyi kucuk harf ve buyuk harf ile girer")
    public void sifreyiKucukHarfVeBuyukHarfIleGirer() {
        okulPage.sifre.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys(Keys.CONTROL, "x");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys("ALicannn");
        ReusableMethods.bekle(2);
    }

    @And("“One number” yazisinin gorundugunu dogrular")
    public void oneNumberYazisininGorundugunuDogrular() {
        assertTrue(okulPage.OneNumberError.isDisplayed());
    }

    @And("Parolayi {int} karakterden az girer")
    public void parolayiKarakterdenAzGirer(int arg0) {
        okulPage.sifre.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys(Keys.CONTROL, "x");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys("Alican1");
        ReusableMethods.bekle(2);
    }

    @And("“At least {int} Characters” yazisinin gorundugunu dogrular")
    public void atLeastCharactersYazisininGorundugunuDogrular(int arg0) {
        assertTrue(okulPage.atLeast8CharactersError.isDisplayed());
    }


    @And("Sifreyi istenilen sekilde olarak girer")
    public void sifreyiIstenilenSekildeOlarakGirer() {
        okulPage.sifre.sendKeys(Keys.CONTROL, "a");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys(Keys.CONTROL, "x");
        ReusableMethods.bekle(2);
        okulPage.sifre.sendKeys("Alican12");
        ReusableMethods.bekle(2);
    }

    @And("Dogum tarihi alanina yanlis formatta bir tarih girer")
    public void dogumTarihiAlaninaYanlisFormattaBirTarihGirer() {
        okulPage.dateOfBirthUS.sendKeys("01.01.199000");
    }

    @And("SSN alanina kimlik numarasini “-” olmadan girer")
    public void ssnAlaninaKimlikNumarasiniOlmadanGirer() {
        okulPage.ssnNumberUS.sendKeys("12345678912");
    }

    @And("acilan menude Contact Get All yazisina tiklar")
    public void acilanMenudeContactGetAllYazisinaTiklar() {
        okulPage.contactGetAllYazisi.click();
    }

    @And("Contact Message sayfasinin acildigini dogrular")
    public void contactMessageSayfasininAcildiginiDogrular() {
        assertTrue(okulPage.contactMessageYazisi.isDisplayed());
    }

    @And("acilan Contact Message sayfasinda silme butonunu gorur")
    public void acilanContactMessageSayfasindaSilmeButonunuGorur() {
    }

    @And("acilan Contact Message sayfasinda silme butonunun oldugunu dogrular")
    public void acilanContactMessageSayfasindaSilmeButonununOldugunuDogrular() {
    }

    @And("acilan Contact Message sayfasinda mesaj yazanlarin isimlerini gorur")
    public void acilanContactMessageSayfasindaMesajYazanlarinIsimleriniGorur() {
        okulPage.nameMessage.isDisplayed();
    }

    @And("acilan Contact Message sayfasinda mesaj yazanlarin isimlerinin gorundugunu dogrular")
    public void acilanContactMessageSayfasindaMesajYazanlarinIsimlerininGorundugunuDogrular() {
        assertTrue(okulPage.nameMessage.isDisplayed());
    }

    @And("acilan Contact Message sayfasinda mesaj yazanlarin email adreslerini gorur")
    public void acilanContactMessageSayfasindaMesajYazanlarinEmailAdresleriniGorur() {
        okulPage.emailMessage.isDisplayed();
    }

    @And("acilan Contact Message sayfasinda mesaj yazanlarin email adreslerinin gorundugunu dogrular")
    public void acilanContactMessageSayfasindaMesajYazanlarinEmailAdreslerininGorundugunuDogrular() {
        assertTrue(okulPage.emailMessage.isDisplayed());
    }

    @And("acilan Contact Message sayfasinda mesajlarin gonderilme tarihini gorur")
    public void acilanContactMessageSayfasindaMesajlarinGonderilmeTarihiniGorur() {
        okulPage.dateMessage.isDisplayed();
    }

    @And("acilan Contact Message sayfasinda mesajlarin gonderilme tarihinin gorundugunu dogrular")
    public void acilanContactMessageSayfasindaMesajlarinGonderilmeTarihininGorundugunuDogrular() {
        assertTrue(okulPage.dateMessage.isDisplayed());
    }

    @And("acilan Contact Message sayfasinda  subject kismini gorur")
    public void acilanContactMessageSayfasindaSubjectKisminiGorur() {
        okulPage.subjectMessage.isDisplayed();
    }

    @And("acilan Contact Message sayfasinda  subject kismini gorundugunu dogrular")
    public void acilanContactMessageSayfasindaSubjectKisminiGorundugunuDogrular() {
        assertTrue(okulPage.subjectMessage.isDisplayed());
    }

    @And("acilan Contact Message sayfasinda mesajlari gorur")
    public void acilanContactMessageSayfasindaMesajlariGorur() {
        okulPage.message.isDisplayed();
    }

    @And("acilan Contact Message sayfasinda mesajlarin gorundugunu dogrular")
    public void acilanContactMessageSayfasindaMesajlarinGorundugunuDogrular() {
        assertTrue(okulPage.message.isDisplayed());
    }

    @And("Olusturulan mesajlari siler")
    public void olusturulanMesajlariSiler() {
    }

    @And("Mesajlarin silindigini dogrular")
    public void mesajlarinSilindiginiDogrular() {
    }

    @Then("Admin olarak login islemini yapar")
    public void adminOlarakLoginIsleminiYapar() {
        ReusableMethods.click(okulPage.loginButton);
        okulPage.loginUserName.sendKeys(ConfigReader.getProperty("adminName"),
                Keys.TAB, ConfigReader.getProperty("adminPassword"));
        okulPage.loginLoginButton.click();

    }
    @And("Admin sayfasinin goruntulendigini dogrular")
    public void adminSayfasininGoruntulendiginiDogrular() {
        assertTrue(okulPage.team12AdminYazisi.isDisplayed());
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("SSN alanina {string} “-” olmadan girer")
    public void ssnAlaninaOlmadanGirer(String arg0) {
        okulPage.ssnNumberUS.sendKeys("12345678912");
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Name alanina isim girer")
    public void nameAlaninaIsimGirer() {
        okulPage.nameUS.sendKeys("a");
    }

    @And("Surname alanina soyisim girer")
    public void surnameAlaninaSoyisimGirer() {
        okulPage.surNameUS.sendKeys("b");
    }

    @And("Birth Place alanina dogum yeri girer")
    public void birthPlaceAlaninaDogumYeriGirer() {
        okulPage.birthPlaceUS.sendKeys("c");
    }

    @And("E-mail alanina email adres girer")
    public void eMailAlaninaEmailAdresGirer() {
        okulPage.emailAddressUS.sendKeys("a@b");
    }

    @And("Phone alanina telefon numarasi girer")
    public void phoneAlaninaTelefonNumarasiGirer() {
        okulPage.phoneNumberUS.sendKeys("123456789321");
    }

    @And("Dogum tarihi alanina dogum tarihini girer")
    public void dogumTarihiAlaninaDogumTarihiniGirer() {
        okulPage.dateOfBirthUS.sendKeys("01.01.2024");
    }

    @And("User Name alanina kullanici adi girer")
    public void userNameAlaninaKullaniciAdiGirer() {
        okulPage.userNameUS.sendKeys("ab");
    }

    @And("Father Name alanina baba adi girer")
    public void fatherNameAlaninaBabaAdiGirer() {
        okulPage.fatherName.sendKeys("f");
    }

    @And("Mother Name alanina anne adi girer")
    public void motherNameAlaninaAnneAdiGirer() {
        okulPage.motherName.sendKeys("g");
    }

    @And("“Your email should be between {int} and {int} characters” yazili hata mesajini alir")
    public void yourEmailShouldBeBetweenAndCharactersYaziliHataMesajiniAlir(int arg0, int arg1) {
        okulPage.emailError2.isDisplayed();
    }


    @And("Kayit isleminin tamamlanmadigini dogrular")
    public void kayitIslemininTamamlanmadiginiDogrular() {
        assertFalse(okulPage.StudentSavedSuccesfullYazisi.isDisplayed());
    }
    @And("Advisor teacher secmedigi icin kayit isleminin tamamlanmadigini dogrular")
    public void advisorTeacherSecmedigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(okulPage.pleaseSelectAdvisorTeacherError.isDisplayed());
    }

    @And("name, surname, birth place, email uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular")
    public void nameSurnameBirthPlaceEmailUyariMesajlariAlmasiSebebiyleKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(okulPage.nameError.getText().contains("Your name should be at least 2 characters"));
        assertTrue(okulPage.surnameError.getText().contains("Your surname should be at least 2 characters"));
        assertTrue(okulPage.emailError2.getText().contains("Your email should be between 5 and 50 characters"));
        assertTrue(okulPage.birthPlaceError.getText().contains("Your birth place should be at least 2 characters"));
    }

    @And("phone number, ileri bir dogum tarihi, ssn uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular")
    public void phoneNumberIleriBirDogumTarihiSsnUyariMesajlariAlmasiSebebiyleKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(okulPage.phoneNumberError.getText().contains("Please enter valid phone number"));
        assertTrue(okulPage.dateOfBirthError.getText().contains("geçmiş bir tarih olmalı"));
        assertTrue(okulPage.ssnNumberError.getText().contains("Please enter valid SSN number"));
    }

    @And("username, father name, mother name uyari mesajlari almasi sebebiyle kayit isleminin tamamlanmadigini dogrular")
    public void usernameFatherNameMotherNameUyariMesajlariAlmasiSebebiyleKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(okulPage.fatherNameError.getText().contains("Your father name should be at least 2 characters"));
        assertTrue(okulPage.motherNameError.getText().contains("Your mother name should be at least 2 characters"));
        assertTrue(okulPage.userNameError.getText().contains("Your username should be at least 4 characters"));
    }

    @And("gender secmedigi icin kayit isleminin tamamlanmadigini dogrular")
    public void genderSecmedigiIcinKayitIslemininTamamlanmadiginiDogrular() {
        assertTrue(okulPage.genderError.getText().contains("You have entered an invalid value. Valid values are: MALE, FEMALE"));
    }

}
