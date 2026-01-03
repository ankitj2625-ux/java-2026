package Practice.General;

import java.util.Arrays;
import java.util.List;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 20, 7, 15);

        // Min
        Integer num = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(num);



        //Max
        Integer max = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(max);


    }
}
