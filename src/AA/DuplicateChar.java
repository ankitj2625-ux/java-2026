package AA;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "ankitjibhakate";

        Set<Character> duplicate = new HashSet<>();
        Set<Character> original = new HashSet<>();

        for (Character ch : str.toCharArray()) {
            if (!duplicate.add(ch)) {
                original.add(ch);
            }
        }
        System.out.println(original);
    }
}
