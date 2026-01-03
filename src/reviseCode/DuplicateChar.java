package reviseCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "ankitjibhakate";

        Set<Character> characterSet = new HashSet<>();
        Set<Character> duplicateChar = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!characterSet.add(ch)) {
                duplicateChar.add(ch);
            }

        }
        System.out.println(duplicateChar);
    }
}
