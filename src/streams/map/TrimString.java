package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrimString {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(" apple ", " banana ", " cherry ");
        List<String> Strtrim = words.stream()
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(Strtrim);
    }
}
