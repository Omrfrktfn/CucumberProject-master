package team12.stepDefinition.apiStepDef;


import io.cucumber.java.en.*;

import static team12.base_url.ManagementSchoolUrl.spec;

public class US13_US14Def {
    @Given("Ogretmen eklemek icin post request hazirligi yapilir")
    public void ogretmen_eklemek_icin_post_request_hazirligi_yapilir() {
        //https://managementonschools.com/app/teachers/save
        //set the url
        spec.pathParams("first","teachers","second","save");
    }

    @Given("Gonderilecek ogretmen bilgileri hazirlanir")
    public void gonderilecek_ogretmen_bilgileri_hazirlanir() {
        //set the expected data


    }

    @When("Ogretmen eklemek icin post request gonderilir")
    public void ogretmen_eklemek_icin_post_request_gonderilir() {

    }

    @Then("Ogretmen bilgileri dogrulanir")
    public void ogretmen_bilgileri_dogrulanir() {

    }


}



