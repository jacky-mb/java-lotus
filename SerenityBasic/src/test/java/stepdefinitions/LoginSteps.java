package stepdefinitions;

import Helpers.Drivers;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pages.Pages;

public class LoginSteps {
    @Managed
    WebDriver driver = new Drivers("chrome").getDriver();
    @Given("I go to page")
    public void openHomePage(){

    }
}
