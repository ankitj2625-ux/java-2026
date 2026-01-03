package reviseCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 9, 12, 20);
        int min = 5;
        int max = 20;


        List<Integer> element = IntStream.rangeClosed(min, max)
                .filter(i -> !list.contains(i))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(element);


    }
}
