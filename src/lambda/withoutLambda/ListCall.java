package lambda.withoutLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCall {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 6, 4, 5, 8);

        System.out.println(integers(integerList));


    }

    public static List<Integer> integers(List<Integer> integers) {
        return integers.stream().filter(num -> num % 2 == 0).map(num -> num * num).collect(Collectors.toList());
    }
}
