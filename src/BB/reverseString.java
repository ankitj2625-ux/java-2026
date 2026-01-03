package BB;

public class reverseString {
    public static void main(String[] args) {
        String str = "ankit";
        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);
    }
}
