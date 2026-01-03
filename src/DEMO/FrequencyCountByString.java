package DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountByString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ankit", "virat", "rohit", "rohit", "ankit");

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry frequency : map.entrySet()) {
            System.out.println(frequency.getKey() + " " + frequency.getValue());
        }
    }
}
