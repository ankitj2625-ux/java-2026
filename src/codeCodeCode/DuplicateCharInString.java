package codeCodeCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "mynameiskhan";

        Set<Character> characters = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!characters.add(ch)) {
                result.add(ch);
            }
        }
        System.out.println(result);
    }
}
