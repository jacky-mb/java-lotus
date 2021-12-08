package stepdefinitions.AddEvent;

import Helpers.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Pages;
import task.AddEventTask;

public class AddEventSteps {
    public static WebDriver driver;
    public static AddEventTask eventTask;
    @Before
    public void setStage() {
        eventTask = new AddEventTask();
        eventTask.actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Iam on admin page with account {}, {}")
    public void login(String email, String password) {
        eventTask.login(email, password);
    }

    @When("I open form create new Event")
    public void openFormAddTask() {
        eventTask.actor.attemptsTo(
                Click.on(Pages.FormAddEvent.Btn_SelectTask),
                Click.on(Pages.FormAddEvent.Btn_AddEvent)
        );
        eventTask.driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form [name='start_time']")));
    }

    @And("I created new event with title : {}, desc: {}, startDate: {}, endDate: {},startTime: {},endTime: {},location: {},labels: {},clientId: {},repeat: {}")
    public void fillFiled(String title, String desc, String startDate, String endDate, String startTime, String endTime
            , String location, String labels, String clientId, String repeat) throws InterruptedException {
        eventTask.fillField(title, desc, startDate, endDate, startTime, endTime, location, labels, clientId, repeat);
    }

    @Then("Can see text {}")
    public void veryfiTask(String text) {
        eventTask.driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + text + "')]")));
    }

    @After
    public void tidyUp() {
        eventTask.driver.quit();
    }
}
