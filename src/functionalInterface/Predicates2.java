package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ankit", "mohan", "rahul", "aman");

        Predicate<String> pre = result -> result.endsWith("n");

        List<String> stringList = str.stream()
                .filter(pre)
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
