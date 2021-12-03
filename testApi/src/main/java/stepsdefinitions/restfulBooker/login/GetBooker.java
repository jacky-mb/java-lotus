package stepsdefinitions.restfulBooker.login;

import Common.BaseRestAssured;
import Common.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GetBooker {
    @Given("Setup call api get booking firstname {}, lastname {}, checkin {}, checkout {}")
    public void setUp(String fisrtName, String lastName, String checkin, String checkOut) {
        Map<String, String> param = new HashMap<String, String>();
        if(!fisrtName.isEmpty())
            param.put("firstname", fisrtName);
        if(!lastName.isEmpty())
            param.put("lastname", lastName);
        if(!checkin.isEmpty())
            param.put("checkin", checkin);
        if(!checkOut.isEmpty())
            param.put("checkout", checkOut);
        Serenity.setSessionVariable("param").to(param);
    }
    @When("Call api login get booking")
    public void callApiGetBooker(){
        Map<String, String> param = Serenity.sessionVariableCalled("param");
        String url = "https://restful-booker.herokuapp.com/booking";
        JsonPath resp = BaseRestAssured.callGetMethod(Config.RestfulBook.HEADER,url,param);
    }
    @Then("Cheking response")
    public void veryfiResponse(){
        JsonPath resp = Serenity.sessionVariableCalled("resp");
        Assert.assertNotNull(resp.get("[0].bookingid"));
    }
}
