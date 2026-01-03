package A_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("mango", "apple", "pineApple", "mango", "grapes");
        Map<String, Long> result = stringList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
