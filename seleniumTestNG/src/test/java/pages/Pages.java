package pages;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class Pages {
    public static String BASE_URL ="https://demoauto.xyz/";
    public static By BUTTON_ADD = By.id("quick-add-icon");
    public static class Login{
        public static String URL = "signin";
        public static By USERNAME = By.cssSelector("form [name='email']");
        public static By PASSWORD = By.cssSelector("form [name='password']");
        public static By BUTTON_LOGIN = By.cssSelector("button[type=submit]");

    }
    public static class Event{
        public static By BUTTON_ADD_EVENT = By.cssSelector("#js-quick-add-event");
        public static By title = By.cssSelector("form [name='title']");
        public static By desc = By.cssSelector("form [name='description']");
        public static By startDate = By.cssSelector("form [name='start_date']");
        public static By end_Date = By.cssSelector("form [name='end_date']");
        public static By startTime = By.cssSelector("form [name='start_time']");
        public static By endTime = By.cssSelector("form [name='end_time']");
        public static By location = By.cssSelector("form [name='location']");
        public static By labels = By.cssSelector("form [name='labels']");
        public static By clientId = By.cssSelector("form #s2id_clients_dropdown");
        public static By repeat = By.cssSelector("#event_recurring");
        public static By color = By.cssSelector(".color-palet [data-color=\"#83c340\"]");
        public static By btnSubmit = By.cssSelector(".modal-footer button[type=submit]");
    }
}

