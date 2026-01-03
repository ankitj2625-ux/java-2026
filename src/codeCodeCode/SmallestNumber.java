package codeCodeCode;

import java.util.Arrays;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 20, 7, 15);

        // smallest
        Integer min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println(min);
//-----------------------------------------------------
        //Largest

        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(max);


    }
}
