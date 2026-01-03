package A_Learning;

public class Palindrom {
    public static void main(String[] args) {

        String str = "MOM";
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        if (str.equals(reverseString))
            System.out.println("palindrome");
        else
            System.out.println("not Palindrome");
    }
}
