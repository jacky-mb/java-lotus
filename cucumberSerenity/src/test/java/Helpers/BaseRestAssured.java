package Helpers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.Serenity;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseRestAssured {
    public static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlcyI6WyI2MTI1YzEwOWMxZWM4YjAwMWI3Y2NlNzMiLCI2MTlmNThjMzk2M2NlYmUxMDIxZTlhNDUiLCI2MTI1YzBkY2MxZWM4YjAwMWI3Y2NlNmUiXSwiZ3JvdXBzIjpbXSwiX2lkIjoiNjFhODczNDlhYjFlMWMwMDE0MGIxNWIzIiwiZXhwaXJlZEF0IjoxNjcyNTA1OTk5MDAwLCJuYW1lIjoiYWRhc2RhcyIsImFwcGxpY2F0aW9uIjoiIiwibWVyY2hhbnRJZCI6IjYwZWU2MmFhNDM0MjQwMDAxMzkxYjgwMyIsInVpZCI6IjRlM2UxMGRmLWY4OTAtNDY4OC05ODhiLWM4YmY5YjVjOThkNSIsImFjdGl2YXRlZCI6MSwiY3JlYXRlZEJ5IjoiNjEzOTA1N2Y5YTdjMDUwMDEyZGY4MmY4IiwiY3JlYXRlZCI6MTYzODQyOTUxMzA2MiwiX192IjowLCJpYXQiOjE2Mzg0Mjk1MTMsImV4cCI6MTY3MjQ3MTExM30.ixPSOuqlyhUx8nl87HJJk2HcFDZRBCBMtyilmcb9dGw";
    public static final Map<String, String> HEADER = new HashMap<String, String>() {{
        put("Content-Type", "application/json");
        put("x-access-token", TOKEN);
    }};
/*post method*/
    public static JsonPath callPostMethod(Map<String,?>headers,String url, String jsonBody, File file){
        JsonPath response = RestAssured.given()
                .headers(headers)
                .body(jsonBody)
                .multiPart(file)
                .when()
                .post(url)
                .then()
                .log().all()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
    public static JsonPath callPostMethod(Map<String,?>headers,String url, String jsonBody){
        JsonPath response = RestAssured.given()
                .headers(headers)
                .body(jsonBody)
                .when()
                .post(url)
                .then()
                .log().all()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
/*get method*/
    public static JsonPath callGetMethod(Map<String,?>headers, String url, Map<String, ?> param) {
        JsonPath response = RestAssured.given()
                .queryParams(param)
                .headers(headers)
                .baseUri(url)
                .when()
                .log().all()
                .get()
                .then()
//                .log().all()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
    public static JsonPath callGetMethod(Map<String,?> headers, String url){
        JsonPath response =  RestAssured.given()
                .headers(headers)
                .baseUri(url)
                .when()
                .log().all()
                .get()
                .then()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
/*put method*/
    public static JsonPath callPutMethod(Map<String,?> headers, String url, String body, File file) {
        JsonPath response = RestAssured.given()
                .headers(headers)
                .body(body)
                .multiPart(file)
                .baseUri(url)
                .when()
                .log().all()
                .post()
                .then()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
    public static JsonPath callPutMethod(Map<String,?> headers, String url, String body) {
        JsonPath response = RestAssured.given()
                .headers(headers)
                .body(body)
                .baseUri(url)
                .when()
                .log().all()
                .post()
                .then()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
    /*delete method*/
    public static JsonPath callDeleteMethod(Map<String,?> headers, String url, String body){
        JsonPath response =  RestAssured.given()
                .headers(headers)
                .body(body)
                .baseUri(url)
                .when()
                .log().all()
                .delete()
                .then()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
    public static JsonPath callDeleteMethod(Map<String,?> headers, String url){
        JsonPath response = RestAssured.given()
                .headers(headers)
                .baseUri(url)
                .when()
                .log().all()
                .delete()
                .then()
                .log().all()
                .extract()
                .response()
                .jsonPath();
        Serenity.setSessionVariable("resp").to(response);
        return response;
    }
}
