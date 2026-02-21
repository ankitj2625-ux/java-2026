package local;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan25 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 35, 65);
        List<Integer> nums = numbers.stream().filter(number -> number > 25).collect(Collectors.toList());
        System.out.println(nums);
    }
}
