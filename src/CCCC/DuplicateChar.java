package CCCC;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "ankitjibhakate";

        Set<Character> original = new HashSet<>();
        Set<Character> removeChar = new HashSet<>();

        for (Character ch : str.toCharArray()) {
            if (!original.add(ch)) {
                removeChar.add(ch);
            }
        }
        System.out.println(removeChar);

    }
}
