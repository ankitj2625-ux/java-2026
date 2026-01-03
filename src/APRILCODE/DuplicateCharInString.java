package APRILCODE;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "ankitjbhakate";

        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                result.add(ch);
            }
        }
        System.out.println(result);
    }
}
