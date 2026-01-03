package reviseCode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";

        Map<String, Long> wordCount = Arrays.stream(str.toLowerCase().split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(wordCount);

        for (Map.Entry aa : wordCount.entrySet()) {
            System.out.println(aa);
        }

//        wordCount.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1).
//                forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


    }
}
