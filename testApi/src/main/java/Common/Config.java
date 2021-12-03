package Common;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static class RestfulBook{
        public static Map<String,?> HEADER = new HashMap<String,Object>(){{
            put("Content-Type","application/json");
        }};
        public static String BASE_URL = "https://restful-booker.herokuapp.com/";
    }
}
