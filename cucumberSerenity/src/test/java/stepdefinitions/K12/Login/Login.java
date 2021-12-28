package stepdefinitions.K12.Login;

import Helpers.Drivers;
import Helpers.ScreenPlayAction;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import pages.Pages;

public class Login extends ScreenPlayAction {
    @Before
    public void setUp() {
        driver = new Drivers("chrome").getDriver();
        actor = Actor.named("actor").can(BrowseTheWeb.with(driver));
    }

    @Given("I go to page ,url is {}")
    public void iGoToPageUrlIsHttpsTestKOnlineVnPageLogin(String url) {
        actor.wasAbleTo(Open.url(url));
    }

    @When("I enter authorize with user {} and password is {}")
    public void iEnterAuthorizeWithUserAdminkAndPasswordIsVhv(String user, String password) {
        actor.attemptsTo(
                Enter.keyValues(user).into(Pages.Login.USERNAME),
                Enter.keyValues(password).into(Pages.Login.PASSWORD),
                Click.on(Pages.Login.BUTTON_LOGIN)
        );
    }

    @Then("I see {}")
    public void iSee(String text) {
        actor.attemptsTo(
                waitForText(text, 1),
                waitForEmelement(By.xpath("//*[contains(text(),'Quản lý')]"), 10)
        );
    }

}
