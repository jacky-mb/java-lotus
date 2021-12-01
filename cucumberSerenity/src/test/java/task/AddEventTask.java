package task;

import Helpers.HelpTask;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Pages;

public class AddEventTask extends HelpTask {
    public AddEventTask(WebDriver drivers) {
        super(drivers);
    }
    public void login(String email, String password) {
        actor.attemptsTo(Open.url("https://demoauto.xyz/signin"));
        actor.attemptsTo(
                Enter.keyValues(email).into(Pages.Login.USERNAME),
                Enter.keyValues(password).into(Pages.Login.PASSWORD),
                Click.on(Pages.Login.BUTTON_LOGIN)
        );
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Dashboard')]")));
    }

    public void fillField(String title, String desc, String startDate, String endDate, String startTime, String endTime
            , String location, String labels, String clientId, String repeat) throws InterruptedException {

        actor.attemptsTo(Enter.keyValues(title).into(Pages.FormAddEvent.Title));
        actor.attemptsTo(Enter.keyValues(desc).into(Pages.FormAddEvent.Desc));
        actor.attemptsTo(Enter.keyValues(startDate).into(Pages.FormAddEvent.StartDate));
        actor.attemptsTo(Enter.keyValues(endDate).into(Pages.FormAddEvent.EndDate));
        actor.attemptsTo(Enter.keyValues(startTime).into(Pages.FormAddEvent.Start_Time));
        actor.attemptsTo(Enter.keyValues(endTime).into(Pages.FormAddEvent.End_Time));
        actor.attemptsTo(Enter.keyValues(location).into(Pages.FormAddEvent.Location));
        executorJs.executeScript("$('form [name=\"recurring\"]')[0].click()");
        executorJs.executeScript("$('#ajaxModalContent button[type=submit]')[0].click()");
    }
}
