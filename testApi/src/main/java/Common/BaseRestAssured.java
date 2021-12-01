package Common;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.util.Map;

public class BaseRestAssured {
    BaseRestAssured(){

    }
    BaseRestAssured(Map<String , String> headers){
        RestAssured.given().headers(headers);
    }
    public void setHeader(String key, String value){
        try {
            RestAssured.given().headers(key,value);
        }catch (Exception e){
        }
    }

    public static JsonPath callPostMethod(String basePath, Map<String, String> headers, JsonObject body) {
        RestAssured.baseURI = baseUri;
        RestAssured.basePath = basePath;
        JsonPath jsonPath = RestAssured.given()
                .headers(headers)

                .body(body)
                .when()
                .post()
                .then()
                .extract()
                .response()
                .jsonPath();
        return jsonPath;
    }
}
