package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractFisrtCharInString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<Character> w = words.stream()
                .map(ch -> ch.charAt(0))
                .collect(Collectors.toList());

        System.out.println(w);

    }
}
