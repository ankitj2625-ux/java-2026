package local;

public class NonRepetativeCharInString {
    public static void main(String[] args) {
        String str = "javaCode";

        for (Character ch : str.toCharArray()) {
            if (str.lastIndexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("the non repetitive char in String is  : " + ch);
                break;
            }
        }
    }
}
