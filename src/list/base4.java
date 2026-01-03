package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class base4 {
    public static void main(String[] args) {
        List<Integer> integers =  new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(5);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(6);
        System.out.println(integers);

        Set<Integer> integerSet = new HashSet<>(integers);
        System.out.println(integerSet);

        List<Integer> integers1 =  new ArrayList<>(integerSet);
        System.out.println(integers1);

    }
}
