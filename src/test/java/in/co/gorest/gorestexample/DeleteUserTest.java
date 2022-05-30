package in.co.gorest.gorestexample;
/* 
 Created by Kalpesh Patel
 */

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest extends TestBase {
    @Test
    public void deleteUserRecord() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 75c987adac5bd1820e58fb137137e2474501428068d1ec0dd68ae05bcff564c9")
                .pathParam("id",3741)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }

}
