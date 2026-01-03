package A_Learning;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "maharana";

        Set<Character> characterSet = new HashSet<>();
        Set<Character> result = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!characterSet.add(ch)) {
                result.add(ch);
            }

        }
        System.out.println(result);
    }
}
