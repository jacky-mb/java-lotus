package stepdefinitions.Events;

import Helpers.HelpTask;
import com.gargoylesoftware.htmlunit.Page;
import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Pages;
import stepdefinitions.Login.LoginSteps;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.*;

public class CreateEventsSteps extends HelpTask {
    public CreateEventsSteps(WebDriver driver){
        super(driver);
    }
    public void openFormInputEvents(){
        driver.get("https://demoauto.xyz/signin");
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        driver.findElement(Pages.Login.USERNAME).sendKeys("admin02@mailinator.com");
        driver.findElement(Pages.Login.PASSWORD).sendKeys("123456");
        driver.findElement(Pages.Login.BUTTON_LOGIN).click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Dashboard')]")));
        driver.findElement(Pages.BUTTON_ADD).click();
        driver.findElement(Pages.Event.BUTTON_ADD_EVENT).click();
    }
    public void fillFields(Map<String, String> map){
        driver.findElement(Pages.Event.title).sendKeys(map.get("title"));
        driver.findElement(Pages.Event.desc).sendKeys(map.get("desc"));
        driver.findElement(Pages.Event.startDate).sendKeys(map.get("startDate"));
        driver.findElement(Pages.Event.end_Date).sendKeys(map.get("endDate"));
        driver.findElement(Pages.Event.startTime).sendKeys(map.get("startTime"));
        driver.findElement(Pages.Event.endTime).sendKeys(map.get("endTime"));
        driver.findElement(Pages.Event.location).sendKeys(map.get("location"));
        driver.findElement(Pages.Event.clientId).click();
//        executorJs.executeScript("$( \"[role='option']:contains('COM')\" )[0].click()");
        executorJs.executeScript("$('form [name=\"recurring\"]')[0].click()");
        executorJs.executeScript("$('[data-color=\""+map.get("color")+"\"]')[0].click()");
//        driver.findElement(Pages.Event.repeat).click();

    }
}
