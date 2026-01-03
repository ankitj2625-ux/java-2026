package Practice.General;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "def", "", "ghi");

        System.out.println(strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()));
    }
}
