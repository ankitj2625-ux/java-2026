package A_Learning;

import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 3, 0, 1, 8);
        Integer maxNumber = integers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(maxNumber);


        Integer minNumber = integers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(minNumber);
    }
}
