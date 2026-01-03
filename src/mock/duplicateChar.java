package mock;

import java.util.HashSet;
import java.util.Set;

public class duplicateChar {
    public static void main(String[] args) {
        String str = "ankitjibhakate";

        Set<Character> stringSet = new HashSet<>();
        Set<Character> result = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!stringSet.add(ch)) {
                result.add(ch);
            }
        }
        System.out.println(result);
    }
}
