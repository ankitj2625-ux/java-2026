package lambda;

interface ConcatStr {
    String stringConcat(String s1, String s2);
}

public class ConcatString {
    public static void main(String[] args) {

        ConcatStr concatStr = (a, b) -> a + " " + b;
        String str = concatStr.stringConcat("ankit", "jibhakate");
        System.out.println(str);

    }
}
