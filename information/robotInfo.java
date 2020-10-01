package information;

import java.util.ArrayList;

public class robotInfo {
    private static String name;
    private static String type;
    private static Integer time;

    public static String getName() {
        return name;
    }

    public static void setName(String username) {
        name = username;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type1) {
        type = type1;
    }

    public static Integer getTime() {return time; }

    public static void setTime(Integer time1) {time = time1; }
}
