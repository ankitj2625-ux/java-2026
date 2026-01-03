package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ankit", "mohan", "radha", "krishna");

//        Function<String, String> val = upper -> upper.toUpperCase();

        Function<String, String> val = String::toUpperCase;

        List<String> result = str.stream()
                .map(val)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
