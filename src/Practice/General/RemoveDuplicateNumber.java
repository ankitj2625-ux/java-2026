package Practice.General;

import java.util.*;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {

        //method 1
        List<Integer> list = Arrays.asList(5, 6, 9, 2, 6, 4);
        Set<Integer> set = new HashSet<>(list);

        List<Integer> list1 = new ArrayList<>(set);
        System.out.println(list1);

        //method 2

        int[] arr = {5, 6, 9, 2, 6, 4};

        Set<Integer> removeDuplicate = new HashSet<>();
        for (int num : arr) {
            removeDuplicate.add(num);
        }
        System.out.println(removeDuplicate);
    }
}
