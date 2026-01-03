package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberSquare {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 8, 7, 4, 5, 8, 8, 4, 5);

        List<Integer> result = integers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
