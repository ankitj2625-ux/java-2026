package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheElements {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 8, 70);
        List<Integer> numList = integers.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(numList);
    }
}
