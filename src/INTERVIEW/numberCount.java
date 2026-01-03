package INTERVIEW;

import java.util.*;

public class numberCount {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 5, 2, 5, 2, 9};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        for (int num : set) {
            System.out.println(num + " = " + Collections.frequency(list, num));

        }
//-------------------------------------------------------------------------------------------
        int total = 0;
        for (int num : arr) {
            total = total + num;
        }
        System.out.println("Addition of all number :  " + total);
//--------------------------------------------------------------------------------------

        List<Integer> integerList = Arrays.asList(5,3,6,9,8,8,5,2,1,4,4);
        System.out.println(integerList.size());

    }
}
