package local;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumberCount {
    public static void main(String[] args) {

        //SIZE
        List<Integer> integerList = Arrays.asList(5, 3, 6, 9, 8, 8, 5, 2, 1, 4, 4);
        System.out.println("count of number in Array : " + integerList.size());

        //SORTED
        List<Integer> sortedInteger = integerList.stream().sorted().toList();
        System.out.println("Accending order =  " + sortedInteger);

        //ReverseOrder
        List<Integer> revOrder = integerList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Decending order =  " + revOrder);

        //MAX NUMBER
        Optional<Integer> maxNum = integerList.stream().max(Integer::compareTo);
        System.out.println("maxNum =  " + maxNum);

        //MIN NUMBER
        Optional<Integer> minNum = integerList.stream().min(Integer::compareTo);
        System.out.println("minNum =  " + minNum);
    }
}
