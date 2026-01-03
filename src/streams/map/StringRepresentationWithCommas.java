package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringRepresentationWithCommas {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1000, 2000000, 30000);

        List<String> formattedNumbers = numbers.stream()
                .map(n -> String.format("%,d", n))
                .collect(Collectors.toList());
        System.out.println(formattedNumbers);

    }
}
