package PageObject;

import Repository.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class EventPage extends BasePage{
    public EventPage(WebDriver dr){
        this.driver = dr;
    }
    public void openFormCreateEvent(){
        click(Locator.Event.BUTTON_ADD_EVENT);
        waitForElement(By.cssSelector("form"));
    }
    public void fillFormCreateEvent(Map<String, Object>map){
        fillField(Locator.Event.title,map.get("title"));
        fillField(Locator.Event.desc,map.get("desc"));
        fillField(Locator.Event.startDate,map.get("startDate"));
        fillField(Locator.Event.end_Date,map.get("endDate"));
        fillField(Locator.Event.startTime,map.get("startTime"));
        fillField(Locator.Event.endTime,map.get("endTime"));
        fillField(Locator.Event.location,map.get("location"));
        click(Locator.Event.clientId);
//        executorJs.executeScript("$( \"[role='option']:contains('COM')\" )[0].click()");
        executorJs.executeScript("$('form [name=\"recurring\"]')[0].click()");
        executorJs.executeScript("$('[data-color=\""+map.get("color")+"\"]')[0].click()");
    }
    public void checkCreateForm(Map<String, Object>map){
        waitForText(String.valueOf(map.get("expect")));
    }

}
