package JAVACODE.Map;

import java.util.HashMap;
import java.util.Map;

public class code1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ankit", 1);
        map.put("mohan", 2);
        map.put("radhika", 3);
        map.put("shreya", 4);
        System.out.println(map);

        for (Map.Entry val : map.entrySet()) {
            System.out.println(val.getKey() + " : " + val.getValue());
        }
    }
}
