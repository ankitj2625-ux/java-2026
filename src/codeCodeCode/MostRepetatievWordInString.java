package codeCodeCode;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepetatievWordInString {
    public static void main(String[] args) {
        String text = "java stream java api java stream api repetitive java stream";

        Optional<Map.Entry<String, Long>> stringStream = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        stringStream.ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
