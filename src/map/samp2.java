package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class samp2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 5, 9, 8, 7);
        List<Integer> result = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
