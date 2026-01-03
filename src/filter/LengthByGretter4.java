package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthByGretter4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi");

        System.out.println(words.stream().filter(len -> len.length() > 4).collect(Collectors.toList()));

    }
}
