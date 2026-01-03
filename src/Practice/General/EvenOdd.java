package Practice.General;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 3, 6, 9, 8, 8, 5, 2, 1, 4, 4);

        List<String> integers = integerList.stream().map(num -> num + " is " + (num % 2 == 0 ? "EVEN Number" : "ODD number")).collect(Collectors.toList());
        System.out.println(integers);
    }
}
