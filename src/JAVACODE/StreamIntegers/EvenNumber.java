package JAVACODE.StreamIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 6, 9, 8, 7, 5, 5);
        //Even Number
        System.out.println(integers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList()));

        //Square of Each Number
        System.out.println(integers.stream().map(num -> num * num).collect(Collectors.toList()));

        //Sum of All Numbers
        int sum = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);



    }
}
