package in.co.gorest.gorestexample;
/* 
 Created by Kalpesh Patel
 */

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserTest extends TestBase {
    @Test
    public void updateUserRecord(){
        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Steve Jobs");
        goRestPojo.setEmail("jobssteve@appels.be");
        goRestPojo.setStatus("active");
        goRestPojo.setGender("male");
        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 75c987adac5bd1820e58fb137137e2474501428068d1ec0dd68ae05bcff564c9")
                .body(goRestPojo)
                .pathParam("id",3741)
                .when()
                .patch("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
