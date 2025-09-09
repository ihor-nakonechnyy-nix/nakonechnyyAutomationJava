package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APITest1 {
    public static void main(String[] args) {

            given().
                    when().
                    get("https://httpbin.org/get").
                    then().
                    statusCode(200);

        }
    }
