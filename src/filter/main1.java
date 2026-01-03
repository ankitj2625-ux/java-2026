package filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 6, 8, 5, 4, 6, 6);
        System.out.println(list.stream().count());

        List<Integer> sort = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sort);



    }
}
