package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class base5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(5);
        list1.add(6);

        list2.add(4);
        list2.add(6);

        list3.add(9);
        list3.add(10);
        list3.add(11);

        List<Integer> mergeList =new ArrayList<>(list1);
        mergeList.addAll(list2);
        mergeList.addAll(list3);

        Collections.sort(mergeList);
        System.out.println(mergeList);

    }
}
