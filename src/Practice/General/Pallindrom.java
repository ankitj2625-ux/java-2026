package Practice.General;

public class Pallindrom {
    public static void main(String[] args) {
        String str = "mom";
        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }

        if (str.equals(revString))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
