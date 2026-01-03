package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> fun = num -> num * num;

        List<Integer> sqr = numbers.stream()
                .map(fun)
                .collect(Collectors.toList());

        System.out.println(sqr);
    }
}
