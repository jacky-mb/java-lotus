package task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import pages.Pages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AddTask_Task implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {

    }

    public static AddTask_Task login(String username, String password) throws InterruptedException {
        theActorCalled("I").wasAbleTo(Open.url("https://demoauto.xyz/"));
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(username).into(Pages.Login.USERNAME),
                Enter.keyValues(password).into(Pages.Login.PASSWORD),
                Click.on(Pages.Login.BUTTON_LOGIN)
        );


        return instrumented(AddTask_Task.class);
    }

    public static AddTask_Task fillFieldAndSubmitForm(String title, String desc, String project, String point
            , String ms, String assign, String collab, String status, String label, String start, String end) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                Click.on(Pages.FormAddTask.Btn_SelectTask),
                Click.on(Pages.FormAddTask.Btn_AddTask)
        );
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
        Enter.keyValues(title).into(Pages.FormAddTask.Title),
                Enter.keyValues(desc).into(Pages.FormAddTask.Desc)
        );
        Thread.sleep(20000);
        return instrumented(AddTask_Task.class);
    }

}
