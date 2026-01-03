package codeCodeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNumberOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 9, 8, 8, 5, 2, 1, 4, 4};
        System.out.println(arr.length);

        List<Integer> integerList = Arrays.asList(5, 3, 6, 9, 8, 8, 5, 2, 1, 4, 4);
        System.out.println(integerList.size());

        List<String> strings = Arrays.asList("ankit", "rahul");

        List<String> strings1 = new ArrayList<>(Arrays.asList("ankit", "nadir"));
        strings1.add(0,"radhika");
        strings1.set(2,"NarendraSingh");
        System.out.println(strings1);


//        strings.add(0,"mahesh");
//        System.out.println(strings);

//
//        System.out.println(integerList.size());
//        System.out.println(integerList.stream().count());

    }
}
