package Practice.General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countTheNumberInArray {
    public static void main(String[] args) {

        // Array
        int[] arr = {5, 3, 6, 9};
        System.out.println(arr.length);

        // OR COUNT TOTAL
        int total = 0;

        for (int num : arr) {
            total = total + num;
        }
        System.out.println(total);

//------------------------------------------------------------------------------------------
        //String
        List<String> strings1 = new ArrayList<>(Arrays.asList("ankit", "nadir"));
        System.out.println(strings1.size());
        strings1.add(1, "mohan");
        System.out.println(strings1.stream().count());

    }
}
