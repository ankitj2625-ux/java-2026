package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertDoubleToString {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

       List<String> str = doubles.stream()
                .map(String :: valueOf)
                .collect(Collectors.toList());
        System.out.println(str);

    }
}
