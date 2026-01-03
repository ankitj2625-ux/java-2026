package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ankit", 6);
        map.put("raha", 56);
        map.put("akay", 66);
        map.put("aman", 336);
//      System.out.println(map);

        //convert map into list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        //sorted by value
        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> result : list) {
            System.out.println(result.getKey() + "  :  " + result.getValue());
        }

    }
}
