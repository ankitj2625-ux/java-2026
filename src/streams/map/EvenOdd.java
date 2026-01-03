package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<String> oddEven = numbers.stream()
                .map(num -> num + " is " + (num % 2 == 0 ? "even" : "odd"))
                .collect(Collectors.toList());

        for (String num : oddEven) {
            System.out.println(num);
        }

//        System.out.println(oddEven);

    }
}
