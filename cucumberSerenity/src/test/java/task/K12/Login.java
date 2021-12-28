package task.K12;

import Helpers.ScreenPlayAction;
import com.gargoylesoftware.htmlunit.Page;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;
import pages.Pages;

import java.util.Map;

public class Login extends ScreenPlayAction {
    public void fillFile(Map<String , String> map){
        actor.attemptsTo(
                Enter.keyValues(map.get("user")).into(Pages.Login.USERNAME),
                Enter.keyValues(map.get("password")).into(Pages.Login.PASSWORD),
                Click.on(Pages.Login.BUTTON_LOGIN)
        );
    }

}

