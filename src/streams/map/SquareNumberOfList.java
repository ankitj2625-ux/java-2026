package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumberOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 9, 8, 3, 2, 1, 4, 7, 5, 1, 0);
        System.out.println(list.stream().map(n -> n * n).collect(Collectors.toList()));
    }
}
