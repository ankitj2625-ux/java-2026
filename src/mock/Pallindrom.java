package mock;

public class Pallindrom {
    public static void main(String[] args) {
        String str = "mam";
        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);

        if (str.equals(revString)) {
            System.out.println(str + "  Palindrome ");
        } else {
            System.out.println(str + " Not palindrome");
        }
    }
}
