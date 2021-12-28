package Helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenPlayAction {
    public static WebDriver driver;
    public Actor actor;

    public static Performable waitForText(String text) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.WaitForText.class, new Object[]{text});
    }

    public static Performable waitForText(String text, long timeOut) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.WaitForText.class, new Object[]{text, timeOut});
    }

    public static Performable waitForEmelement(By element) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.WaitForElement.class, new Object[]{element});
    }

    public static Performable waitForEmelement(By element, long timeOut) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.WaitForElement.class, new Object[]{element, timeOut});
    }

    public static Performable selectOption(By element, Object value) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.SelectOption.class, new Object[]{element, value});
    }

    public static Performable selectMultipleOption(By element, Object value) {
        return (Performable) Tasks.instrumented(ScreenPlayAction.SelectMultipleOption.class, new Object[]{element, value});
    }

    private static class WaitForText implements Performable {
        private final String theText;
        private final long timeOut;

        public WaitForText(String theText, long time) {
            this.theText = theText;
            if (time == 0) {
                time = 30;
            }
            timeOut = time;
        }

        @Step("{0} wait for text: #theText")
        public <T extends Actor> void performAs(T theUser) {
            (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[contains(text(),'" + theText + "')]"), theText));
        }
    }


    private static class WaitForElement implements Performable {
        private final By element;
        private final long timeOut;

        public WaitForElement(By e, long time) {
            this.element = e;
            if (time == 0) {
                time = 30;
            }
            timeOut = time;
        }

        @Override
        @Step("{0} wait for element is present: #element")
        public <T extends Actor> void performAs(T actor) {
            (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.visibilityOfElementLocated(element));

        }
    }

    private static class SelectOption implements Performable {
        private final By element;
        private final Object value;

        public SelectOption(By e, Object v) {
            element = e;
            value = v;
        }

        @Override
        @Step("{0} select choose #value in #element")
        public <T extends Actor> void performAs(T actor) {
            Select select = new Select(driver.findElement(element));
            try {
                select.selectByValue(String.valueOf(value));
            } catch (Exception ignored) {
            }
            try {
                select.selectByIndex((int) value);
            } catch (Exception ignored) {
            }
            try {
                select.selectByVisibleText(String.valueOf(value));
            } catch (Exception ignored) {

            }

        }
    }

    private static class SelectMultipleOption implements Performable {
        private final By element;
        private final Object value;

        public SelectMultipleOption(By e, Object v) {
            element = e;
            value = v;
        }

        @Override
        @Step("{0} select choose #value in #element")
        public <T extends Actor> void performAs(T actor) {
            Select select = new Select(driver.findElement(element));
            try {
                select.selectByValue(String.valueOf(value));
            } catch (Exception ignored) {
            }
            try {
                select.selectByIndex((int) value);
            } catch (Exception ignored) {
            }
            try {
                select.selectByVisibleText(String.valueOf(value));
            } catch (Exception ignored) {

            }

        }
    }
}
