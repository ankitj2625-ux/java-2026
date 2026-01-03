package map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("ankit", "16531100");
        stringMap.put("raha", "24653213");
        stringMap.put("vamika", "34651");
        stringMap.put("akay", "2454");

        String name="ankit";
        System.out.println(stringMap.get(name));
    }
}
