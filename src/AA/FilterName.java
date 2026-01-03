package AA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ankit", "Jane", "rohit", "pankaj", "radhika");

        List<String> filteredName = names.stream()
                .filter(name ->name.toLowerCase().startsWith("j") && name.length() > 2).collect(Collectors.toList());
        System.out.println(filteredName);
    }
}
