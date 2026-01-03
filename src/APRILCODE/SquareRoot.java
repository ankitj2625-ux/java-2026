package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 16, 25);
        List<Double> num = numbers.stream().map(Math::sqrt).collect(Collectors.toList());
        System.out.println(num);

    }
}
