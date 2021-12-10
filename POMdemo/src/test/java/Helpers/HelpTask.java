package Helpers;

import com.beust.jcommander.ParameterException;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelpTask {
    public WebDriver driver;
    public WebDriverWait driverWait;
    public Actor actor = Actor.named("actor");
    public long timeOut = 10;
    public JavascriptExecutor executorJs;

    public void setTimeOut(long timeOut) {
        driverWait.withTimeout(Duration.ofSeconds(timeOut));

    }

    public HelpTask() {
        driver = new Drivers("chrome").getDriver();
        driverWait = new WebDriverWait(driver, timeOut);
        executorJs = (JavascriptExecutor) driver;
    }
    public HelpTask(String dr) {
        driver = new Drivers(dr).getDriver();
        driverWait = new WebDriverWait(driver, timeOut);
        executorJs = (JavascriptExecutor) driver;
    }

    public WebElement findWebElement(Object s) {
        String type = s.getClass().getSimpleName();
        if (!type.equals("String") && !type.contains("By")) throw new ParameterException("Not match type selector");
        WebElement e = null;
        try {
            if (type.equals("String")) {
                e = driver.findElement(By.cssSelector((String) s));
            } else {
                e = driver.findElement((By) s);
            }
        } catch (NoSuchElementException | ParameterException ex) {
            ex.printStackTrace();
        }
        return e;
    }

    public void fillField(Object selector, String value) {
        WebElement e = findWebElement(selector);
        e.sendKeys(value);
    }

    public void click(Object selector) {
        WebElement e = findWebElement(selector);
        e.click();
    }

    public void waitForText(String text) {
        driverWait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[contains(text(),'" + text + "')]"), text));
    }

    public void waitForElement(Object selector) {
        String type = selector.getClass().getSimpleName();
        if (type.equals("String")) {
            driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((String) selector)));
        } else {
            driverWait.until(ExpectedConditions.visibilityOfElementLocated((By) selector));
        }
    }

    public void checkBox(Object selector, boolean option) {
        boolean isChecked = (boolean) executorJs.executeScript("return $(" + selector + ").is(\":checked\")");
        if (isChecked) {
            if (option) {
                /*no action*/
            } else {
                this.click(selector);
            }
        } else {
            if (option) {
                this.click(selector);
            } else {
                /*no action*/
            }
        }
    }

    public static void sleep(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOption(Object selector, String value) {
        Select s = new Select(findWebElement(selector));
        s.selectByValue(value);
    }
}
