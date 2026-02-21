package java_26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 7, 11, 15);
        int min = 1;
        int max = 15;

        List<Integer> missingNumber = IntStream.rangeClosed(min, max).filter(num -> !integerList.contains(num)).boxed().toList();
        System.out.println(missingNumber);
    }
}
