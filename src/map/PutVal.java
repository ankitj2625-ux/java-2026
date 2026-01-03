package map;

import java.util.HashMap;
import java.util.Map;

public class PutVal {
    public static void main(String[] args) {

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "ankit");
        stringMap.put(2, "aman");
        stringMap.put(3, "aarati");
        stringMap.put(4, "akshay");
//        System.out.println(stringMap);

        for (Map.Entry result : stringMap.entrySet())
        {
            System.out.println(result);
        }

    }
}
