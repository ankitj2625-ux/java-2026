package DEMO;

import java.util.Arrays;
import java.util.List;

public class MinMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 20, 7, 15);

        Integer min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println(min);

        Integer max = numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(max);
    }
}
