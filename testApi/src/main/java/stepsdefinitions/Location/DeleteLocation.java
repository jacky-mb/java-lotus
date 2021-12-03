package stepsdefinitions.Location;

import Common.BaseRestAssured;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.*;

public class DeleteLocation {
    @When("Call api delete location with id")
    public void callApiDeleteLocation(){
        JsonPath locationCreated = sessionVariableCalled("resp");
        String url = "https://gateway-dev.nextcam.vn/dev-api/location/"+locationCreated.get("data._id");
        JsonPath resp = BaseRestAssured.callDeleteMethod(BaseRestAssured.HEADER,url);
    }
    @Then("Check status call ok, location was deleted")
    public void checkDeleteOk(){
        JsonPath resp = sessionVariableCalled("resp");
        Assert.assertTrue(resp.get("ok"));
    }
}
