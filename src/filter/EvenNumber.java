package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 6, 9, 8, 2, 4, 7);
        List<Integer> emptyList = new ArrayList<>();

        list.stream().filter(even -> even % 2 == 0).forEach(System.out::println);

        for (Integer fullList : list) {
            emptyList.add(fullList);
        }
        System.out.println(emptyList);
    }
}
