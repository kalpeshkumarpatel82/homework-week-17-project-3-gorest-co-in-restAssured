package in.co.gorest.testbase;
/* 
 Created by Kalpesh Patel
 */

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI="https://gorest.co.in/public/v2";
        RestAssured.basePath="/users";
    }
}
