package A_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyStringAndLengthUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "", "API", "", "Filter", "Ankit", "Amitabh");
        List<String> val = strings.stream()
                .filter(len -> !len.isEmpty())
                .filter(len -> len.startsWith("A") && len.endsWith("t"))
                .filter(len -> len.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(val);
    }
}
