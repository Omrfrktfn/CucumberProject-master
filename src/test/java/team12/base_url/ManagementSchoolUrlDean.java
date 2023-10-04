package team12.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static team12.utilities.AuthenticationSchool.generateToken;
import static team12.utilities.AuthenticationSchoolDean.generateToken1;


//import static utilities.AuthenticationMedunna.generateToken;
public class ManagementSchoolUrlDean {

    public static RequestSpecification spec1;

    public static void setup1() {
        spec1 = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateToken1())
                .setContentType(ContentType.JSON)
                .build();
    }
//guncelleme

}
