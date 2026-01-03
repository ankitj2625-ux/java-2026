package A_Learning;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountNormal {
    public static void main(String[] args) {
        String str = "ankitjibhakate";


        Map<Character, Long> val = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(val);
    }
}
