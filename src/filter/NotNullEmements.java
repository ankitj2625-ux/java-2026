package filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NotNullEmements {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", null, "banana", null, "cherry");
        System.out.println(items.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList()));
    }
}
