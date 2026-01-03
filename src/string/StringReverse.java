package string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ankit";
        String stringReverses = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            stringReverses = stringReverses + str.charAt(i);
        }
        System.out.println(stringReverses);

    }
}
