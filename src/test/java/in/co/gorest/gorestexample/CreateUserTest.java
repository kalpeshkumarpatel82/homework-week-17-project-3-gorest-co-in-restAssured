package in.co.gorest.gorestexample;
/* 
 Created by Kalpesh Patel
 */

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateUserTest extends TestBase {

    @Test
    public void creteAUser(){
        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna");
        goRestPojo.setGender("female");
        goRestPojo.setEmail("tenali.ramakrishna13@gmail.com");
        goRestPojo.setStatus("active");

        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer 75c987adac5bd1820e58fb137137e2474501428068d1ec0dd68ae05bcff564c9")
                .body(goRestPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
