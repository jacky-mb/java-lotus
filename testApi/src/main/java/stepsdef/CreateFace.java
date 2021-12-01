package stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Steps;

public class CreateFace {
    @Before
    public void setup()
    {
        RestAssured.baseURI = "https://portal-dev.nextcam.vn/";
    }
    @After
    public void tearDown()
    {
        RestAssured.reset();
    }
    @Steps
    CreateFace createFaceApi;
    @Given("I authentication with account merchant is {}, username is {}, password is {}")
    public void authentication(String user, String password){

    }
}
