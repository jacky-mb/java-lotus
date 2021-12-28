package Helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScreenRest extends HelpTask implements Task {
    /*post method*/
    public ScreenRest callPostMethod(Map<String, ?> headers, String url, String jsonBody, File file) {
        actor.attemptsTo(
                Post.to(url).with(
                        request -> request.headers(headers)
                                .body(jsonBody)
                                .multiPart(file)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callPostMethod(Map<String, ?> headers, String url, String jsonBody) {
        actor.attemptsTo(
                Post.to(url).with(
                        request -> request.headers(headers)
                                .body(jsonBody)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callPostMethod(String url, String jsonBody) {
        actor.attemptsTo(
                Post.to(url).with(
                        request -> request.body(jsonBody)
                )
        );
        return instrumented(ScreenRest.class);
    }

    /*Get method*/
    public ScreenRest callGetMethod(Map<String, ?> headers, String url, Map<String, ?> param) {
        actor.attemptsTo(
                Get.resource(url).with(
                        request -> request.headers(headers)
                                .queryParams(param)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callGetMethod(String url, Map<String, ?> param) {
        actor.attemptsTo(
                Get.resource(url).with(
                        request -> request
                                .queryParams(param)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callGetMethod(String url) {
        actor.attemptsTo(
                Get.resource(url)
        );
        return instrumented(ScreenRest.class);
    }

    /*Put method*/
    public ScreenRest callPutMethod(Map<String, ?> headers, String url, String jsonBody, File file) {
        actor.attemptsTo(
                Put.to(url).with(
                        request -> request.headers(headers)
                                .body(jsonBody)
                                .multiPart(file)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callPutMethod(Map<String, ?> headers, String url, String jsonBody) {
        actor.attemptsTo(
                Put.to(url).with(
                        request -> request.headers(headers)
                                .body(jsonBody)
                )
        );
        return instrumented(ScreenRest.class);
    }

    public ScreenRest callPutMethod(String url, String jsonBody) {
        actor.attemptsTo(
                Put.to(url).with(
                        request -> request.body(jsonBody)
                )
        );
        return instrumented(ScreenRest.class);
    }

    /*path method*/
    public ScreenRest callPathMethod(String url, String jsonBody) {
        actor.attemptsTo(
                Patch.to(url).with(
                        request -> request.body(jsonBody)
                )
        );
        return instrumented(ScreenRest.class);
    }
    public static String readTextFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
