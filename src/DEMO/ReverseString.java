package DEMO;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ankit";
        String stringReverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            stringReverse = stringReverse + str.charAt(i);
        }
        System.out.println(stringReverse);
    }
}
