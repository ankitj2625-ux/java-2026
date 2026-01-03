package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 15, 20, 25, 30);

        Predicate<Integer> greaterThan = num -> num > 10;

        List<Integer> pred = numbers.stream()
                .filter(greaterThan)
                .collect(Collectors.toList());

        System.out.println(pred);

    }

}
