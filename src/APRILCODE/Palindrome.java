package APRILCODE;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mom";
        String strRev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev + str.charAt(i);
        }
        if (str.equals(strRev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
