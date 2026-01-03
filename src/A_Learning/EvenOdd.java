package A_Learning;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 6, 5, 2, 4, 8, 9, 5, 2, 5, 5);
        List<String> val = integers.stream()
                .map(num -> num + " is " + (num % 2 == 0 ? "Even Number" : "Odd Number"))
                .collect(Collectors.toList());
        for (String result : val) {
            System.out.println(result);
        }
    }
}
