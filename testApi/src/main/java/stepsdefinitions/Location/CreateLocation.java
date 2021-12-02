package stepsdefinitions.Location;

import Common.BaseRestAssured;
import Common.BodyJson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static net.serenitybdd.core.Serenity.setSessionVariable;

public class CreateLocation {
    @Given("Setup data pre call name {},desc {}, address {}, zoneId {}")
    public void setUp(String name, String desc, String address, String zoneId) {
//        String body = "{\n" +
//                "  \"name\": \""+name+"\",\n" +
//                "  \"description\": \""+desc+"\",\n" +
//                "  \"address\": \""+address+"\",\n" +
//                "  \"zoneIds\": [\n" +zoneId+
//                "  ]\n" +
//                "}";
        String url = "https://gateway-dev.nextcam.vn/dev-api/location";
        setSessionVariable("endpoint").to(url);
        JsonObject jsonBody = JsonParser.parseString(BodyJson.readTextFile("src/main/resources/payloads/createLocation.json")).getAsJsonObject();
        jsonBody.addProperty("name", name);
        jsonBody.addProperty("description", desc);
        jsonBody.addProperty("address", address);
//        String[] zoneIds = zoneId.split(",");
//        JsonArray zone = jsonBody.get("zoneIds").getAsJsonArray();
//        for (String zone1: zoneIds) {
//            zone.add(zone1);
//        }
//        jsonBody.add("zoneIds",  zoneIds);
        setSessionVariable("body").to(jsonBody.toString());
    }

    @When("Call API")
    public void callAPI() {
//        System.out.println((JsonObject) sessionVariableCalled("body"));
        JsonObject body = sessionVariableCalled("body");
//        JsonPath resp = RestAssured
//                .given()
//                    .headers("x-access-token", BaseRestAssured.TOKEN)
//                    .body(body.toString())
//                    .baseUri(sessionVariableCalled("endpoint"))
//                .when()
//                    .post()
//                .then()
//                    .extract()
//                    .response()
//                    .jsonPath();
//
//        setSessionVariable("res").to(resp);
//        System.out.println(resp.prettyPrint());
       JsonPath res =  BaseRestAssured.callPostMethod(sessionVariableCalled("endpoint").toString(),sessionVariableCalled("body"),null);
       setSessionVariable(res);
        System.exit(1);
    }

    @Then("Check status call ok, location was created")
    public void veryfiRequest() {
        JsonPath resp = sessionVariableCalled("res");
        System.out.println(resp);
        System.exit(1);
//        Assert.assertTrue(resp.get("ok"));
    }
}
