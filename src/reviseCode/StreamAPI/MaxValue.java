package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

        //Max Value
        Integer maxVal = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(maxVal);

        //Min Value
        Integer minVal = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(minVal);
    }
}
