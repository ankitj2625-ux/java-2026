package CCCC_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerProgram {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 3, 6, 9, 4, 2, 1, 0, 2, 5, 5, 7);

        //assending
        System.out.println(integerList.stream().sorted().collect(Collectors.toList()));

        //Unique Elemnets
        System.out.println(integerList.stream().distinct().sorted().collect(Collectors.toList()));

        //Max Value in Array
        System.out.println(integerList.stream().max(Integer::compareTo));

        //Min Value in String
        System.out.println(integerList.stream().min(Integer::compareTo));

        //Greater than 5
        System.out.println(integerList.stream().filter(num -> num >= 5).collect(Collectors.toList()));

        //Sum of All Value
        System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());

        //count the number greater than 4
        System.out.println(integerList.stream().filter(num -> num > 4).count());

        //Square the values
        System.out.println(integerList.stream().map(num -> num * num).collect(Collectors.toList()));

        //Find first elements
        System.out.println(integerList.stream().findFirst().orElseThrow());

       //Even number
        System.out.println(integerList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()));

        //Odd number
        System.out.println(integerList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList()));

        //length of array
        System.out.println(integerList.size());
    }
}
