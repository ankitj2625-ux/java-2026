package mock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 9, 5, 3, 2, 1, 4, 7, 8, 9, 5, 4);

        List<String> integerList = list.stream()
                .map(num -> num + ((num % 2 == 0) ? " : Even" : " : Odd"))
                .collect(Collectors.toList());
        for (String str : integerList) {
            System.out.println(str);
        }
    }
}
