package codeCodeCode;

public class LargestElementInString {
    public static void main(String[] args) {
        String str = "i am good";

        String[] s = str.split("\\s");
        System.out.println(s.length);

        String largestString = "";

        for (String word : s) {
            if (word.length() > largestString.length()) {
                largestString = word;
            }
        }
        System.out.println(largestString);

    }
}