package stepsdefinitions.restfulBooker.login;

import Common.BaseRestAssured;
import Common.BodyJson;
import Common.Config;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;


public class Login {
    @Given("Set up call api login with username {} and password {}")
    public void setUp(String username, String password){
        String body = BodyJson.readTextFile("src/main/resources/payloads/RestfulBooker/createToken.json");
        JsonObject jsonObject = JsonParser.parseString(body).getAsJsonObject();
        jsonObject.addProperty("username",username);
        jsonObject.addProperty("password",password);
        Serenity.setSessionVariable("body").to(jsonObject.toString());
    }
    @When("Call api login")
    public void callApi(){
        String url = Config.RestfulBook.BASE_URL+"auth";
        String body = Serenity.sessionVariableCalled("body");
        JsonPath jsonPath = BaseRestAssured.callPostMethod(Config.RestfulBook.HEADER,url,body);
    }
    @Then("Check api return token field")
    public void checkLoginSuccessfully(){
        JsonPath  jsonPath = Serenity.sessionVariableCalled("resp");
        Assert.assertNotNull(jsonPath.get("token"));
    }
}
