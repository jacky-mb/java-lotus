package Common;

import com.github.rjeschke.txtmark.Configuration;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.reflections.util.ConfigurationBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BodyJson {

    public static String readTextFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        String s = readTextFile("src/main/resources/payloads/createFace.json");
//        Configuration conf = new Configuration();
        DocumentContext context = JsonPath.parse(s);
        context.set("$.data.numberId",20);
        System.out.println(s);
//        JsonObject  jsonObject = JsonParser.parseString(s).getAsJsonObject();
//        System.out.println(jsonObject.get("alias"));
//        JsonPath jsonPath = new JsonPath(s);

    }
}
