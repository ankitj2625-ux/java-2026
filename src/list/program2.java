package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("c");
        list.add("B");
        list.add("c");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
