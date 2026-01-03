package A_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGreaterThan3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "API", "Filter");
        List<String> val = strings.stream().filter(len -> len.length() > 3).collect(Collectors.toList());
        System.out.println(val);

    }
}
