package BB;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepetedChar {
    public static void main(String[] args) {
        String str = "ankitkumar";
        Set<Character> characterSet = new HashSet<>();
        Set<Character> removeChar = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!characterSet.add(ch)) {
                removeChar.add(ch);
            }
        }
        System.out.println(removeChar);
    }
}
