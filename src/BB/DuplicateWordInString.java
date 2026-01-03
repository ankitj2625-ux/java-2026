package BB;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";

        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(map);
        for (Map.Entry val : map.entrySet()) {
            System.out.println(val);
        }
    }
}
