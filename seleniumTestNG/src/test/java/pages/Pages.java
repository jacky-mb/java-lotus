package pages;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class Pages {
    public static String BASE_URL ="https://demoauto.xyz/";
    public static class Login{
        public static String URL = "signin";
        public static By USERNAME = By.cssSelector("form [name='email']");
        public static By PASSWORD = By.cssSelector("form [name='password']");
        public static By BUTTON_LOGIN = By.cssSelector("button[type=submit]");

    }
}

