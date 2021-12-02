package Common;

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
}
