package CCCC;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";

        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("String is anagram");
        } else {
            System.out.println("String is not anagram");
        }

    }
}
