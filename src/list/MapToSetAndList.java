package list;

import java.util.*;

public class MapToSetAndList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("F", 3);
        map.put("H", 3);
        map.put("D", 3);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> set = new HashSet<>(map.entrySet());
        for (Map.Entry res : set) {
            System.out.println(res.getKey() + " : " + res.getValue());
        }
        System.out.println("------------------------------------------------");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (Map.Entry op : list) {
            System.out.println(op.getKey() + " : " + op.getValue());
        }
    }
}
