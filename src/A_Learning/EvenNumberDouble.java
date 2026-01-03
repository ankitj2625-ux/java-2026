package A_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberDouble {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21, 14, 6, 95, 9, 7, 55, 1, 24, 25, 42, 74);
        List<Integer> val = numbers.stream()
                .filter(num -> num >= 10)
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2).collect(Collectors.toList());
        System.out.println(val);
    }
}
