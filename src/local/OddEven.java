package local;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<String> list = numbers.stream()
                .map(num -> num + " - is " + (num % 2 == 0 ? " Even Number" : "  Odd Number"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
