package local;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ankit";
        String revesreString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revesreString = revesreString + str.charAt(i);
        }
        System.out.println(revesreString);
    }
}

