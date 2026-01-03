package INTERVIEW;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ankit";
        String ReverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ReverseString = ReverseString + str.charAt(i);
        }
        System.out.println(ReverseString);
    }
}
