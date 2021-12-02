package Common;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseRestAssured {
    public static final String TOKEN ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlcyI6WyI2MTI1YzEwOWMxZWM4YjAwMWI3Y2NlNzMiLCI2MTlmNThjMzk2M2NlYmUxMDIxZTlhNDUiLCI2MTI1YzBkY2MxZWM4YjAwMWI3Y2NlNmUiXSwiZ3JvdXBzIjpbXSwiX2lkIjoiNjFhODczNDlhYjFlMWMwMDE0MGIxNWIzIiwiZXhwaXJlZEF0IjoxNjcyNTA1OTk5MDAwLCJuYW1lIjoiYWRhc2RhcyIsImFwcGxpY2F0aW9uIjoiIiwibWVyY2hhbnRJZCI6IjYwZWU2MmFhNDM0MjQwMDAxMzkxYjgwMyIsInVpZCI6IjRlM2UxMGRmLWY4OTAtNDY4OC05ODhiLWM4YmY5YjVjOThkNSIsImFjdGl2YXRlZCI6MSwiY3JlYXRlZEJ5IjoiNjEzOTA1N2Y5YTdjMDUwMDEyZGY4MmY4IiwiY3JlYXRlZCI6MTYzODQyOTUxMzA2MiwiX192IjowLCJpYXQiOjE2Mzg0Mjk1MTMsImV4cCI6MTY3MjQ3MTExM30.ixPSOuqlyhUx8nl87HJJk2HcFDZRBCBMtyilmcb9dGw";
    public static final Map<String, String> HEADER = new HashMap<String, String>() {{
        put("ContentType","application/json");
        put("x-access-token", TOKEN);
    }};

    public static JsonPath callPostMethod(String url, String body,File file) {
        return RestAssured.given()
                .headers(HEADER)
                .body(body)
                .multiPart(file)
                .basePath(url)
                .when()
                .post()
                .then()
                .extract()
                .response()
                .jsonPath();
    }

    public static JsonPath callGetMethod(String url, Map<String,?> param) {
        return RestAssured.given()
                .queryParams(param)
                .headers(HEADER)
                .baseUri(url)
                .when()
                .log().all()
                .get()
                .then()
                .extract()
                .response()
                .jsonPath();
    }

    public static JsonPath callPutMethod(String url, JsonObject body,File file) {
        return RestAssured.given()
                .headers(HEADER)
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
    }

    public static void main(String[] args) {
        String url = "https://gateway-dev.nextcam.vn/dev-api/camera";
        Map<String, ?> param = new HashMap<String,Object>(){{
            put("page",1);
            put("perPage",1);
            put("filter","");
            put("fromDate","");
            put("toDate","");
            put("sort","");
        }};
        System.out.println(callGetMethod(url,param).prettyPrint());

    }
}
