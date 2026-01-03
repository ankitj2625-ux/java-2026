package DEMO;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mom";
        String stringReverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            stringReverse = stringReverse + str.charAt(i);
        }
        if (str.equals(stringReverse))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
