package APRILCODE;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String str = "mango, orange, banana, orange, banana, apple";

        Map<String, Long> counts = Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry wordCount : counts.entrySet()) {
            System.out.println(wordCount.getKey() + " = " + wordCount.getValue());
        }
    }
}

