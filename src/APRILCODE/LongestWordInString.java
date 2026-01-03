package APRILCODE;

public class LongestWordInString {
    public static void main(String[] args) {
        String str = "i am fine";
        String longestString = "";
        String[] s = str.split("\\s");

        for (String s1 : s) {
            if (s1.length() > longestString.length()) {
                longestString = s1;
            }
        }
        System.out.println(longestString);

    }
}
