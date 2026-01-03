package A_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumberDouble {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-10, 5, 3, -2, 8, -1, 6);

        List<Integer> val = numbers.stream()
                .filter(num -> num > 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(val);
    }
}
