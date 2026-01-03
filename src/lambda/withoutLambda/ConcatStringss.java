package lambda.withoutLambda;

public class ConcatStringss {
    public static void main(String[] args) {

        String str = ConcatStringss.concatstr("ankit", "jibhakate");
        System.out.println(str);

    }

    public static String concatstr(String s1, String s2) {
        return s1 + " " + s2;
    }
}

