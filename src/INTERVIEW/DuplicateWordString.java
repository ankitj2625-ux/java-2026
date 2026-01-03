package INTERVIEW;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordString {
    public static void main(String[] args) {
        String str = "mango, orange, banana, orange, banana, apple";

        Map<String, Long> map = Arrays.stream(str.split(",")).map(String::trim)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        map.forEach((key, value) -> System.out.println(key +" : " +value));

        for (Map.Entry names : map.entrySet()) {
            System.out.println(names);
        }

    }
}