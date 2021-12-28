package stepdefinitions.RestfulBooker;

import Helpers.ScreenRest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.FileNotFoundException;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class loginResfulBooker extends ScreenRest {
    private EnvironmentVariables environmentVariables;

    @Before
    public void configureBaseUrl() {
        String theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://restful-booker.herokuapp.com/");

        actor.whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @Given("Setup")
    public void setup() throws FileNotFoundException {
        String body = ScreenRest.readTextFile("src/test/resources/payload/RefulBooker/login.json");
        Serenity.setSessionVariable("body").to(body);
    }

    @When("Call API")
    public void callAPI() {

        String body = (String) Serenity.sessionVariableCalled("body");
        callPostMethod("/auth", body);

    }

    @Then("Check token response")
    public void checkTokenResponse() {
        actor.should(
                seeThatResponse("The user should have been successfully added",
                        response -> response.statusCode(201))
        );
    }
}
