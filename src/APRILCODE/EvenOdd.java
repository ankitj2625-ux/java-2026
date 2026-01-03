package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 6, 9, 8, 7, 4, 5, 2, 5, 8, 8, 8, 4, 5);

        List<String> evenOdd = integers.stream()
                .map(num -> num + " is " + (num % 2 == 0 ? "EVEN" : "ODD"))
                .collect(Collectors.toList());
        System.out.println(evenOdd);
    }
}
