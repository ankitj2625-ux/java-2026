package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prog1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(6);
        integers.add(9);
        integers.add(7);
        integers.add(0);

        System.out.println(integers);

        integers.forEach(System.out::println);

        System.out.println("removing index 2 is : "+integers.remove(2));


        Collections.sort(integers);
        System.out.println(integers);

//        for (Integer res : integers) {
//            System.out.println(res);
//        }
    }
}
