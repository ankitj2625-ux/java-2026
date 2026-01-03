package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLengthMoreThanThreeChar {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "bye", "good", "no");

       List<String> view = words.stream()
               .filter(n ->n.length()>3)
               .map(n-> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(view);

    }
}
