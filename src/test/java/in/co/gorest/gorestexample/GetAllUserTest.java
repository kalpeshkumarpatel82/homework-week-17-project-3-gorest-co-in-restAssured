package in.co.gorest.gorestexample;
/* 
 Created by Kalpesh Patel
 */

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllUserTest extends TestBase {
    @Test
    public void getAllUsers(){
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        System.out.println("----------- Response ------------------------------");
        List<?> totalRecords = response.then().extract().path("");
        System.out.println("Total Records              :" + totalRecords.size());
        List<?> name = response.then().extract().path("findAll{it.id==3297}.name");
        System.out.println("id 3297 has name           :" + name);
        List<?> email = response.then().extract().path("findAll{it.id==3296}.email");
        System.out.println("id 3296 has name           :" + email);
        List<?> status = response.then().extract().path("status");
        System.out.println("All Ids Status             :" + status);
        List<?> femaleGender = response.then().extract().path("findAll{it.id==3295}.gender");
        System.out.println("id 3295 has Gender Female  :" + femaleGender);
        List<?> maleGender = response.then().extract().path("findAll{it.id==3294}.gender");
        System.out.println("id 3294 has Gender Male    :" + maleGender);
        System.out.println("----------- End of Response ----------------------");
        response.prettyPrint();
    }
}
