package team12.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


//import static utilities.AuthenticationMedunna.generateToken;
public class  ManagementSchoolUrl {

    public static RequestSpecification spec;

    public static void setup() {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                //.addHeader("Authorization", generateToken())
                .setContentType(ContentType.JSON)
                .build();
    }
//guncelleme

}
