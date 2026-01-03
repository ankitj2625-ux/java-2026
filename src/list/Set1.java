package list;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ankit");
        set.add("raj");
        set.add("ankit");
        System.out.println(set);
    }
}
