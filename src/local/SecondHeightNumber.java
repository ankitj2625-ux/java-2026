package local;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHeightNumber {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer number = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(number);
    }
}
