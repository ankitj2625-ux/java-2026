package reviseCode;

public class ReverseString {
    public static void main(String[] args) {

        String s1 = "ankit";
        String revString = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            revString = revString + s1.charAt(i);
        }
        System.out.println(revString);

    }
}
