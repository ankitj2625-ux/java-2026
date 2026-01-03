package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "aamla");

        Optional<String> name = words.stream().findFirst();
        System.out.println(name);

        List<String> strats = words.stream().filter(start -> start.startsWith("a")).collect(Collectors.toList());
        System.out.println(strats);


    }
}
