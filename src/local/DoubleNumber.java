package local;

import java.util.Arrays;
import java.util.List;

public class DoubleNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}
