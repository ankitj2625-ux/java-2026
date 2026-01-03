package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 3, 6, 5, 5, 3, 6, 9, 7, 4, 1, 5);

        //sorted list
        list.stream().sorted().forEach(System.out::println);

        //remove duplicate number
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("new list without duplicates : "+newList);
    }
}
