package Helpers;

import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelpTask {
    public  WebDriver driver;
    public  WebDriverWait driverWait;
    public  Actor actor = Actor.named("actor");
    public long timeOut = 10;
    public  JavascriptExecutor executorJs;
    public void setTimeOut(long timeOut) {
        driverWait.withTimeout(Duration.ofSeconds(timeOut));

    }

    public HelpTask(WebDriver drivers) {
        driver = drivers;
        driverWait = new WebDriverWait(driver, timeOut);
        executorJs = (JavascriptExecutor) driver;
    }
}
