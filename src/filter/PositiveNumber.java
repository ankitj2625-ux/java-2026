package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumber {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, -9, 5, 5, 4, 2, 4, -5, -1};
        List<Integer> num = Arrays.asList(arr)
                .stream()
                .filter(positive -> positive > 0)
                .collect(Collectors.toList());
        System.out.println(num);
    }
}
