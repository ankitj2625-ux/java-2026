package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(1);
        set.add(6);
//        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
