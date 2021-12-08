package stepdefinitions.test;

import Helpers.Drivers;
import Helpers.HelpTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import pages.Pages;
import task.AddEventTask;

public class login{
    public static HelpTask task ;
    @Before
    public void setStage() {
        task = new HelpTask();
        task.actor.can(BrowseTheWeb.with(task.driver));
    }
    @Given("I go to pageee")
    public void openPage(){
        task.driver.get("https://test1.k12online.vn/?page=login");
        task.waitForElement("form");
    }
    @When("I fill field dataaa")
    public void fillData(){
        task.fillField("[name=\"fields[username]\"]","admink12");
        task.fillField("[name=\"fields[password]\"]","Vhv@2020");
        task.click("button[type=submit]");
        task.checkBox("[name=\"remember\"]",true);
//        task.sleep(100);
    }
    @Then("I seeeee {}")
    public void verify(String text){
        task.waitForText(text);
    }
}
