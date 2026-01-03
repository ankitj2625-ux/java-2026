package INTERVIEW;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "mynameiskhan";
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println(duplicates);


    }
}
