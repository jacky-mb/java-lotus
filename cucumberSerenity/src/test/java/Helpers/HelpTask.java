package Helpers;

import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    public void fillField(String selector, String value){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
        driver.findElement(By.cssSelector(selector)).sendKeys(value);
    }
    public void click(String selector){
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
        driver.findElement(By.cssSelector(selector)).click();
    }

    public void checkBox(String selector,boolean option){
        boolean isChecked = (boolean) executorJs.executeScript("return $("+selector+").is(\":checked\")");
        if(isChecked){
            if(option){
                /*no action*/
            }else{
                this.click(selector);
            }
        }else{
            if(option){
                this.click(selector);
            }else{
                /*no action*/
            }
        }
    }
}
