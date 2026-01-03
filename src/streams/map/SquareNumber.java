package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqrt = numbers.stream()
                .map(sq -> sq * sq)
                .collect(Collectors.toList());
        System.out.println(sqrt);
    }
}
