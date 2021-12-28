package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pages {

    public static class Login{
        public static By USERNAME = By.cssSelector("[name='fields[username]']");
        public static By PASSWORD = By.cssSelector("[name='fields[password]']");
        public static By BUTTON_LOGIN = By.cssSelector("button[type=submit]");
    }
    public static class LoginTarget{
        public static Target USERNAME = Target.the("user").located(By.cssSelector("[name='fields[username]']"));
        public static Target PASSWORD = Target.the("password").located(By.cssSelector("[name='fields[password]']"));
        public static Target BUTTON_LOGIN =Target.the("btn login").located(By.cssSelector("button[type=submit]"));
    }
    public static class SignUp{
        public static Target FIRST_NAME = Target.the("name").located(By.name("first_name"));
        public static Target LAST_NAME = Target.the("lastname").located(By.name("last_name"));
        public static Target COMPANY_NAME = Target.the("company name").located(By.name("company_name"));
        public static Target EMAIL = Target.the("email").located(By.name("email"));
        public static Target PASSWORD = Target.the("password").located(By.name("password"));
        public static Target RETYPE_PASSWORD = Target.the("retype password").located(By.name("retype_password"));
        public static Target BUTTON_SIGNUP = Target.the("submit sign up").located(By.xpath("//button[@type='submit']"));
    }

    public static class FormAddTask{
        public static Target Title = Target.the("Title").located(By.cssSelector("form [name='title']"));
        public static Target Desc = Target.the("Desc").located(By.cssSelector("form [name='description']"));
        public static Target Project = Target.the("Project").located(By.cssSelector("form [project_id']"));
        public static Target Points  = Target.the("Points").located(By.cssSelector("form [points']"));
        public static Target Milestone = Target.the("Milestone").located(By.cssSelector("form [milestone_id']"));
        public static Target Assign  = Target.the("Assign").located(By.cssSelector("form [assigned_to']"));
        public static Target Collaborators = Target.the("Collaborators").located(By.cssSelector("form [collaborators']"));
        public static Target Status = Target.the("Status").located(By.cssSelector("form [status_id']"));
        public static Target Labels = Target.the("Labels").located(By.cssSelector("form [labels']"));
        public static Target Start_date = Target.the("Start_date").located(By.cssSelector("form [start_date']"));
        public static Target Deadline = Target.the("Deadline").located(By.cssSelector("form [deadline']"));
        public static Target Btn_Submit = Target.the("SubmitForm").located(By.id("save-and-show-button"));
        public static Target Btn_SelectTask = Target.the("btn show form add task").located(By.id("quick-add-icon"));
        public static Target Btn_AddTask = Target.the("open form ").located(By.xpath("//a[@title='Add task']"));
    }
    public static  class FormAddEvent{
        public static Target Title = Target.the("Title").located(By.cssSelector("form [name='title']"));
        public static Target Desc = Target.the("Description").located(By.cssSelector("form [name='description']"));
        public static Target StartDate = Target.the("Start date").located(By.cssSelector("form [name='start_date']"));
        public static Target EndDate = Target.the("End date").located(By.cssSelector("form [name='end_date']"));
        public static Target Start_Time = Target.the("Start time").located(By.cssSelector("form [name='start_time']"));
        public static Target End_Time = Target.the("End time").located(By.cssSelector("form [name='end_time']"));
        public static Target Location = Target.the("Location").located(By.cssSelector("form [name='location']"));
        public static Target Label = Target.the("Labels").located(By.id("s2id_autogen2"));
        public static Target Client = Target.the("Client id").located(By.cssSelector("form [name='client_id']"));
        public static Target Repeat = Target.the("Recurring").located(By.cssSelector("form [name='recurring']"));
        public static Target Btn_Submit = Target.the("SubmitForm").located(By.cssSelector("#event-form > div.modal-footer > button.btn.btn-primary"));
        public static Target Btn_SelectTask = Target.the("btn show form add task").located(By.id("quick-add-icon"));
        public static Target Btn_AddEvent = Target.the("btn add event form ").located(By.xpath("//a[@title='Add event']"));
    }
}

