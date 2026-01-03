package map;

import java.util.HashMap;
import java.util.Map;

public class sam1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ankit", 1);
        map.put("rahul", 2);
        map.put("akay", 3);
        map.put("vamika", 4);
        map.put("akay", 3);
//
//        for (Map.Entry result : map.entrySet()) {
//            System.out.println(result.getKey() + "  :  " + result.getValue());
//        }


        map.forEach((a, b) ->{
            System.out.println(a + " = "+ b);
        });
    }
}
