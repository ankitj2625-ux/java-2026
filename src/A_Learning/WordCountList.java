package A_Learning;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountList {
    public static void main(String[] args) {
        String str = "i am ankit, i am an best coder";
        Map<String, Long> result = Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry val : result.entrySet()) {
            System.out.println(val.getKey() + " " + val.getValue());
        }
    }
}
