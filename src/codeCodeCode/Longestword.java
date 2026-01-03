package codeCodeCode;

public class Longestword {
    public static void main(String[] args) {
        String str = " i am ankit";
        String[] strings = str.split("\\s");
        String longetsWord = "";

        for (String s : strings) {
            if (s.length() > longetsWord.length()) {
                longetsWord = s;
            }
        }
        System.out.println(longetsWord);
    }
}
