package map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class samp4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 6, 9, 5, 3, 7, 5);

        // accending order
        List<Integer> accendingOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(accendingOrder);

        //decending oreder
        List<Integer> integerList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList);

        // Distinct
        List<Integer> disNumber = list.stream().distinct().collect(Collectors.toList());
        System.out.println(disNumber);

        //count
        long count = list.stream().count();
        System.out.println(count);

        //findFirst
        Optional<Integer> findfirst = list.stream().findFirst();
        System.out.println(findfirst);

        //findLast
        Optional<Integer> num = list.stream().skip(list.size() -1).findFirst();
        System.out.println(num);




    }
}
