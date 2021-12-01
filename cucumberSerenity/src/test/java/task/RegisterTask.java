package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import pages.Pages;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public  class RegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {

    }
    public static RegisterTask register(String firstName, String lastName, String companyName, String email,
                                        String password, String retypePassword) throws InterruptedException {

        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(firstName).into(Pages.SignUp.FIRST_NAME),
                Enter.keyValues(lastName).into(Pages.SignUp.LAST_NAME),
                Enter.keyValues(companyName).into(Pages.SignUp.COMPANY_NAME),
                Enter.keyValues(email).into(Pages.SignUp.EMAIL),
                Enter.keyValues(password).into(Pages.SignUp.PASSWORD),
                Enter.keyValues(retypePassword).into(Pages.SignUp.RETYPE_PASSWORD),
                Click.on(Pages.SignUp.BUTTON_SIGNUP)

        );
        TimeUnit.SECONDS.sleep(5);
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(Target.the("text").located(By.xpath("//*[contains(text(),'created successfully')]"))), isVisible())
        );
        return instrumented(RegisterTask.class);

    }

    public static RegisterTask reLogin(String email, String password){
        theActorCalled("actor").wasAbleTo(Open.url("https://demoauto.xyz/signin"));
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(email).into(Pages.Login.USERNAME),
                Enter.keyValues(password).into(Pages.Login.PASSWORD),
                Click.on(Pages.Login.BUTTON_LOGIN)
        );
        return instrumented(RegisterTask.class);
    }
}
