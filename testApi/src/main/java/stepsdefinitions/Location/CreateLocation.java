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
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

import static io.restassured.path.json.JsonPath.*;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static net.serenitybdd.core.Serenity.setSessionVariable;

public class CreateLocation {
    @Given("Setup data pre call name {},desc {}, address {}, zoneId {}")
    public void setUp(String name, String desc, String address, String zoneId) {
        String url = "https://gateway-dev.nextcam.vn/dev-api/location";
        setSessionVariable("endpoint").to(url);
        JsonObject jsonBody = JsonParser.parseString(BodyJson.readTextFile("src/main/resources/payloads/createLocation.json")).getAsJsonObject();
        jsonBody.addProperty("name", name);
        jsonBody.addProperty("description", desc);
        jsonBody.addProperty("address", address);
        setSessionVariable("body").to(jsonBody.toString());
    }

    @When("Call API create location")
    public void callAPI() {
        String body = sessionVariableCalled("body");
       JsonPath res =  BaseRestAssured.callPostMethod(BaseRestAssured.HEADER,sessionVariableCalled("endpoint"),body);
    }

    @Then("Check status call ok, location was created")
    public void veryfiRequest() {
        JsonPath resp = sessionVariableCalled("resp");
        Assert.assertNotNull(resp.get("data._id"));
    }
}
