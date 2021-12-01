package Task;

import Common.BaseRestAssured;
import Objects.FaceObjects;
import com.google.gson.JsonObject;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;

import java.util.Map;

public class CreateFaceTask{
    private final Response res = null; //Response
    private final JsonPath jp = null; //JsonPath

    @When("Call Create Face API")
    public void createFaceApi(Map<String, String> headers, JsonObject body){
        JsonPath result = BaseRestAssured.callPostMethod(FaceObjects.BASE_URI, FaceObjects.CREATE_FACE_PATH, headers, body);
        String a = result.getString("a.b.c");
        Serenity.setSessionVariable("phoneNumber").to(a);
    }

    @When("sdasd")
    public void a() {
        String phoneNumber = Serenity.sessionVariableCalled("phoneNumber");
        JsonObject payloads = JsonUtil.readJsonFile("");
        JsonUtil.updatePayload(payloads, "phoneNumber", phoneNumber);
    }

}
