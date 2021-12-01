package stepdefinitions.AddTask;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static task.AddTask_Task.fillFieldAndSubmitForm;
import static task.AddTask_Task.login;

public class AddTaskSteps {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("{} am on admin page with account {},{}")
    public void loginPages(String actor, String email,String password) throws InterruptedException {
        theActorCalled(actor).attemptsTo(
                login(email, password));
    }

    @Then("User is on homepage")
    public void onHomePage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        theActorInTheSpotlight().should(seeThat(the(Target.the("text").located(By.xpath("//*[contains(text(),'Dashboard')]"))), isVisible()));
    }


    @When("I created new task with title : {}, desc: {}, project: {}, point: {},milestone: {},assign: {},collabrators: {},status: {},labels: {},start: {},end: {}")
    public void fillFields(String title, String desc,
                           String project, String point,String milestone,
                           String assign, String collab, String status, String label,
                           String start, String end) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                fillFieldAndSubmitForm(title, desc, project, point,milestone, assign, collab, status,label, start, end )
        );
        Thread.sleep(100000);
    }
//    @Then("I can see text asdsa {}")
//    public void iCanSeeTextABC(String text) {
//        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(Target.the("text").located(By.xpath("//*[contains(text()," + text + ")]"))), isVisible()));
//    }


}
