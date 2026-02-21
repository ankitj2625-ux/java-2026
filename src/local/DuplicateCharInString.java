package local;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "ankitjibhakate";
        Set<Character> charecter = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!charecter.add(ch)) {
                result.add(ch);
            }
        }
        System.out.println(result);

    }
}
