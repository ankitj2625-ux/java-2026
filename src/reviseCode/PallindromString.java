package reviseCode;

public class PallindromString {
    public static void main(String[] args) {
        String str = "mam";
        String strRev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev + str.charAt(i);
        }
        if (str.equals(strRev)) {
            System.out.println(str + " is palindrome");
        } else
            System.out.println(str + " Not Palindrome");
    }
}
