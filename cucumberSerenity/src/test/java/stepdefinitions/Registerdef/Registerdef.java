package stepdefinitions.Registerdef;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Date;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static task.RegisterTask.reLogin;
import static task.RegisterTask.register;

public class Registerdef {
    private static final String now = String.valueOf(new Date().getTime());
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{} Go to page")
    public void goToPage(String actor) {
        theActorCalled(actor).wasAbleTo(Open.url("https://demoauto.xyz/signup"));
    }

    @When("I fill field data {} {} {} {} {} {}")
    public void iFilFieldData(String firstName, String lastName, String companyName, String email, String password, String retypePassword) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                register(firstName, lastName, companyName, email+now, password, retypePassword)
        );
    }

    @Then("See text {}")
    public void seeText(String text) {
        theActorInTheSpotlight().should(seeThat(the(Target.the("text").located(By.xpath("//*[contains(text()," + text + ")]"))), isVisible())
        );
    }

    @And("I re login with new account created {} {}")
    public void iReLoginWithNewAccount(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                reLogin(email+now, password));

    }

    @Then("I can see text {}")
    public void iCanSeeText(String text) {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(Target.the("text").located(By.xpath("//*[contains(text()," + text + ")]"))), isVisible()));
    }

}
