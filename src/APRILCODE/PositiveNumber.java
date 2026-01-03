package APRILCODE;

import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 6, 9, 8, 7, 2, 3, -6, -9, -8, -7, 6);

        List<Integer> integerList = integers.stream()
                .filter(num -> num > 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
